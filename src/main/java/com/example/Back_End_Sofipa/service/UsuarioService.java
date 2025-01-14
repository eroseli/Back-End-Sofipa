package com.example.Back_End_Sofipa.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.example.Back_End_Sofipa.model.UsuarioDTO;

@Service
public class UsuarioService {

	public ArrayList<UsuarioDTO> obtener(){
		
		List<UsuarioDTO> usuarios = new ArrayList<UsuarioDTO>();
		
		usuarios.add(new UsuarioDTO(1, "Daniel","Ramirez","Aragon","aragon@gmail.com"));
		usuarios.add(new UsuarioDTO(1, "Maria","Santiago","Hernandez","mar@gmail.com"));
		usuarios.add(new UsuarioDTO(1, "Emanuel","Ramirez","Librado","sandoval@gmail.com"));
		
		return (ArrayList<UsuarioDTO>) usuarios;
		
	}
	
}

