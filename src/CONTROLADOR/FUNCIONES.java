/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.BENEFICIARIO;
import MODELO.COLABORADOR;
import MODELO.EMPLEADO;
import java.util.Scanner;

public class FUNCIONES extends FUNCIONES_ABSTRACTA {
    EMPLEADO e;
    COLABORADOR c;
    BENEFICIARIO b;
    public void menu(){
    int op =0;
    do{
        System.out.println("""
                           1. registrar persona
                           2. ver persona
                           3. salir
                           """);
    op = new Scanner(System.in).nextInt();
    while(op<1|| op>5){
        System.out.println("error opcion no valida");
        System.out.println("""
                           1. registrar persona
                           2. ver persona
                           3. salir
                           """);    
        op = new Scanner(System.in).nextInt();
            

    }
    switch(op){
        case 1:
            registrar();
            break;
        case 2: 
            verPersona();
            break;
    }
    }while(op!=3);
}
    @Override
    public void registrar() {
        String tipopersona;
        int hora = 0;
        int cantidad = 0;
        String horario = "";
        System.out.println("registrate");
        System.out.println("nombre : ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("apellido : ");
        String apellido = new Scanner(System.in).nextLine();
        System.out.println("direccion : ");
        String direccion = new Scanner(System.in).nextLine();
        System.out.println("edad : ");
        int edad = new Scanner(System.in).nextInt();
        System.out.println("ingrese el numero del tipo de persona ");
        System.out.println("""
                           1.empleado
                           2.colaborador 
                           3.beneficiario
                           """);

        int op = new Scanner(System.in).nextInt();

        switch (op) {
            case 1:
                System.out.println("ingrese el salario que tiene el empleado ");
                int salario = new Scanner(System.in).nextInt();
                System.out.println("ingresa la hora en que trabajo");
                System.out.println("1. 8-5pm");
                System.out.println("2. 2-11pm");

                int op2 = new Scanner(System.in).nextInt();
                switch (op2) {
                    case 1:
                        horario = "8-5 pm";
                        break;
                    case 2:
                        horario = "2-11 pm";
                        break;
                }

                tipopersona = "empleado";
                e = new EMPLEADO(salario, horario, nombre, apellido, direccion, edad, tipopersona);
                                System.out.println("persona registrada");

                break;

            case 2:
                System.out.println("ingrese las horas que quiere trabajar");
                hora = new Scanner(System.in).nextInt();
                while (hora > 25 || hora < 0) {
                    System.out.println("hora no valida ,maximo 25 horas por mes");
                    hora = new Scanner(System.in).nextInt();

                }
                tipopersona = "colaborador";
                c = new COLABORADOR(hora, nombre, apellido, direccion, edad, tipopersona);
                                System.out.println("persona registrada");

                break;
            case 3:
                tipopersona = "beneficiario";
                System.out.println("cuantas ayudas tuvo este mes ");
                cantidad = new Scanner(System.in).nextInt();
                while (cantidad > 5 || cantidad < 0) {
                    System.out.println("error hora no establecida dentro de rango maximo de horas 5");
                    cantidad = new Scanner(System.in).nextInt();

                }
                b= new BENEFICIARIO(cantidad, nombre, apellido, direccion, edad, tipopersona);
                System.out.println("persona registrada");
        }

    }

    public void verPersona() {
         if (e != null) {
        System.out.println("Empleado: " + e.getNombre());
    }

    if (c != null) {
        System.out.println("Colaborador: " + c.getNombre());
    }

    if (b != null) {
        System.out.println("Beneficiario: " + b.getNombre());
    }

    if (e == null && c == null && b == null) {
        System.out.println("No hay personas registradas");
    }
    }
}
