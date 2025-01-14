package com.example.Back_End_Sofipa.Security;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.Back_End_Sofipa.model.ErrorResponse;
import com.example.Back_End_Sofipa.repository.LogsSofipaRepository;
import com.example.Back_End_Sofipa.repository.ModelDAO.logs_sofipa;
import com.example.Back_End_Sofipa.service.LogsSofipaService;
import com.example.Back_End_Sofipa.service.SecurityService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = "/restricted/**")  // URL Protegida
public class GuardFiltro extends OncePerRequestFilter  {

	SecurityService securityService = new SecurityService(); 
	LogsSofipaService logsSofipaService = new LogsSofipaService();
	logs_sofipa logs_sofipa_ = new logs_sofipa();
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		 ServletContext servletContext = ((HttpServletRequest) request).getServletContext();
	     WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
	     LogsSofipaRepository logsRepository = applicationContext.getBean(LogsSofipaRepository.class);		
		
		logs_sofipa_.setFecha(LocalDate.now());
		logs_sofipa_.setHora(LocalTime.now());
		logs_sofipa_.setIp( request.getRemoteAddr() );
		
		boolean	respuesta = securityService.validarAccesoFechaHora(logs_sofipa_); 		
		
		logs_sofipa_.setEstatus(respuesta?"CORRECTA":"INCORRECTA");
		logsSofipaService.guardar(logs_sofipa_,logsRepository);
		
		if (respuesta) {
        	filterChain.doFilter(request, response);
        	return;
        }	
			
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		response.getWriter().write(modelarRespuestaError());
		response.setContentType("application/json");    			
		
	}
	
	public String modelarRespuestaError() throws JsonProcessingException { // Modelar Respuesta Erronea
		ErrorResponse errorResponse = new ErrorResponse(
                "No Autorizado, Fuera del Rango de Acceso", 
                "Hora Lunes a Viernes de 8:00 a 18:00"
        );
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonResponse = objectMapper.writeValueAsString(errorResponse);

        return jsonResponse;
	}

	
}
