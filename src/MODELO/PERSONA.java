/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;


public  class PERSONA {
    private String nombre,apellido,direccion;
    private int edad;
    private String tipoPersona;
    
    public PERSONA (String nombre, String apellido,String direccion, int edad ,String tipoPersona){
    this.nombre=nombre;
    this.apellido=apellido;
    this.direccion=direccion;
    this.edad=edad;
    this.tipoPersona=tipoPersona;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void presentarse(){
        System.out.println("hola mi nombre es" + getNombre() + getApellido());
    }
}
