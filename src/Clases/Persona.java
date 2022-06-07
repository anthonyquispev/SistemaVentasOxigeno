
package Clases;

import java.io.Serializable;


public class Persona implements Serializable{
    //Atributos
    
    String DNI;
    String Nombres;
    String Apellidos;
    String Email;
    
    //Constructor
    
    public Persona(String DNI, String Nombres, String Apellidos, String Email) {
        this.DNI = DNI;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Email = Email;
    }
    
    //Getters&Setters

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
}