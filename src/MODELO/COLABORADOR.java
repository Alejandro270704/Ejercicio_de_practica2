/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

public class COLABORADOR extends PERSONA {
    private int hora;

    public COLABORADOR(int hora, String nombre, String apellido, String direccion, int edad, String tipopersona) {
        super(nombre, apellido, direccion, edad, tipopersona);
        this.hora = hora;
    }

    
    @Override
    public void presentarse(){
            System.out.println("hola mi nombre es" + getNombre() + getApellido() +"soy un colaborador");
    }
    
    
}
