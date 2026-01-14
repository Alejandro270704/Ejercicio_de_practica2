/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

public class EMPLEADO extends PERSONA {
    private double salario;
    private String horario;

    public EMPLEADO(double salario, String horario, String nombre, String apellido, String direccion, int edad, String tipopersona) {
        super(nombre, apellido, direccion, edad, tipopersona);
        this.salario = salario;
        this.horario = horario;
    }

   
    @Override
    public void presentarse(){
            System.out.println("hola mi nombre es" + getNombre() + getApellido() +"soy un empleado");
    }

    
    }

    
    
    

