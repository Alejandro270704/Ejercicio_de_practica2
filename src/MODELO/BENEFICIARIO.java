/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

public class BENEFICIARIO extends PERSONA {
    private int cantidad ;

    public BENEFICIARIO(int cantidad, String nombre, String apellido, String direccion, int edad, String tipopersona) {
        super(nombre, apellido, direccion, edad, tipopersona);
        this.cantidad = cantidad;
    }

    
    @Override
    public void presentarse(){
            System.out.println("hola mi nombre es" + getNombre() + getApellido() +"soy un beneficiario");
    }
    
}
