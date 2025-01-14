package com.example.Back_End_Sofipa.model;

public class ErrorResponse {

	 private String mensaje;
     private String detalle;

     public ErrorResponse(String message, String details) {
         this.mensaje = message;
         this.detalle = details;
     }

     public String getMessage() {
         return mensaje;
     }

     public void setMessage(String message) {
         this.mensaje = message;
     }

     public String getDetails() {
         return detalle;
     }

     public void setDetails(String details) {
         this.detalle = details;
     }
	
}
