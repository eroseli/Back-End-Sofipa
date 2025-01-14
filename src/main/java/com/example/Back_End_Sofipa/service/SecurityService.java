package com.example.Back_End_Sofipa.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.stereotype.Service;

import com.example.Back_End_Sofipa.repository.ModelDAO.logs_sofipa;

@Service
public class SecurityService {

	
	public  boolean validarAccesoFechaHora(logs_sofipa logs_sofipa_) {
		
		DayOfWeek dia = logs_sofipa_.getFecha().getDayOfWeek();
		
		if (dia == DayOfWeek.SATURDAY || dia == DayOfWeek.SUNDAY) {
			return false;
		}
		
		if ( logs_sofipa_.getHora().isBefore( LocalTime.of(9, 0) ) || logs_sofipa_.getHora().isAfter(LocalTime.of(18, 0))   ) {
			return false;
		}

		return true;
	}
	
}
