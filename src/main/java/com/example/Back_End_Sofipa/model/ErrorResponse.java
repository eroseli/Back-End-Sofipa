package com.example.Back_End_Sofipa.model;

public class ErrorResponse {

	 private String mensaje;
     private String detalle;

     public ErrorResponse(String mensaje, String detalle) {
         this.mensaje = mensaje;
         this.detalle = detalle;
     }

     public String getMensaje() {
         return mensaje;
     }

     public void setMensaje(String mensaje) {
         this.mensaje = mensaje;
     }

     public String getDetalle() {
         return detalle;
     }

     public void setDetalle(String detalle) {
         this.detalle = detalle;
     }
	
}
