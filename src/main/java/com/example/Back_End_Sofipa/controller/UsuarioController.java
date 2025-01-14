package com.example.Back_End_Sofipa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Back_End_Sofipa.model.UsuarioDTO;
import com.example.Back_End_Sofipa.service.LogsSofipaService;
import com.example.Back_End_Sofipa.service.UsuarioService;

@RestController
@RequestMapping("/restricted")
public class UsuarioController {

	@Autowired
	UsuarioService service;
	
	@GetMapping
	public ArrayList<UsuarioDTO> getUsuarios(){
		return service.obtener();
	}
	
}
