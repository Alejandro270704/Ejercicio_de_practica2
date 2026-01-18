/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import MODELO.BENEFICIARIO;
import MODELO.COLABORADOR;
import MODELO.EMPLEADO;
import MODELO.PERSONA;
import java.util.Scanner;
import java.util.ArrayList;

public class FUNCIONES extends FUNCIONES_ABSTRACTA {

    ArrayList<PERSONA> personas = new ArrayList<>();

    public void menu() {
        int op = 0;
        do {
            System.out.println("""
                           1. registrar persona
                           2. ver persona
                           3. salir
                           """);
            op = new Scanner(System.in).nextInt();
            while (op < 1 || op > 5) {
                System.out.println("error opcion no valida");
                System.out.println("""
                           1. registrar persona
                           2. ver persona
                           3. salir
                           """);
                op = new Scanner(System.in).nextInt();

            }
            switch (op) {
                case 1:
                    registrar();
                    break;
                case 2:
                    verPersona();
                    break;
            }
        } while (op != 3);
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
                EMPLEADO e = new EMPLEADO(salario, horario, nombre, apellido, direccion, edad, tipopersona);
                personas.add(e);
                System.out.println("Empleado registrado");

                break;

            case 2:
                System.out.println("ingrese las horas que quiere trabajar");
                hora = new Scanner(System.in).nextInt();
                while (hora > 25 || hora < 0) {
                    System.out.println("hora no valida ,maximo 25 horas por mes");
                    hora = new Scanner(System.in).nextInt();

                }
                tipopersona = "colaborador";
                COLABORADOR c = new COLABORADOR(hora, nombre, apellido, direccion, edad, tipopersona);
                personas.add(c);
                System.out.println("Colaborador registrado");

                break;
            case 3:
                tipopersona = "beneficiario";
                System.out.println("cuantas ayudas tuvo este mes ");
                cantidad = new Scanner(System.in).nextInt();
                while (cantidad > 5 || cantidad < 0) {
                    System.out.println("error hora no establecida dentro de rango maximo de horas 5");
                    cantidad = new Scanner(System.in).nextInt();

                }
                BENEFICIARIO b = new BENEFICIARIO(cantidad, nombre, apellido, direccion, edad, tipopersona);
                personas.add(b);
                System.out.println("Beneficiario registrado");
        }

    }

    public void verPersona() {
        if (personas.size() == 0) {
            System.out.println("No hay personas registradas");
            return;
        }
        for (int i = 0; i < personas.size(); i++) {
            PERSONA p = personas.get(i);

            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Apellido: " + p.getApellido());
            System.out.println("Tipo: " + p.getTipoPersona());
            System.out.println("----------------------");
        }
    }
}
