package com.example.Back_End_Sofipa.model;

public class UsuarioDTO {

	private int Id;
	private String usuario;
	private String apaterno;
	private String amaterno;
	private String correo;
	
	public UsuarioDTO(int id, String usuario, String apaterno, String amaterno, String correo) {
		super();
		Id = id;
		this.usuario = usuario;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.correo = correo;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getApaterno() {
		return apaterno;
	}
	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}
	public String getAmaterno() {
		return amaterno;
	}
	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
