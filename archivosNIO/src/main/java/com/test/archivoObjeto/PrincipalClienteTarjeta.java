/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.archivoObjeto;

import java.util.Scanner;

/**
 *
 * @author David Elias Mamani Laura
 */
public class PrincipalClienteTarjeta {

    public static void main(String[] args) {
        int opc = 0;
        boolean continuar = true;
        OperacionesClienteTarjeta obj = new OperacionesClienteTarjeta();
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Crear archivo");
            System.out.println("2. Registrar cliente - Tarjeta");
            System.out.println("3. Guardar los registros");
            System.out.println("4. Mostrar Datos"); 
            System.out.println("5. Bloquear Tarjeta");
            System.out.println("6. Depositar Dinero");
            System.out.println("7. Retiro de Dinero");
            System.out.println("8. salir");
            System.out.println("Digite una opcion");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    obj.crearArchivo();
                    break;
                case 2:
                    String res="S";
                    while(res.equalsIgnoreCase("S")){
                      obj.crearClienteTarjeta();
                        System.out.println("Desea seguir registrando clientes S/N");
                        res=leer.next();
                    }                    
                    break;
                case 3:
                    obj.guardarObjetos();
                    break;
                case 4:
                    obj.leerClientes();
                    obj.mostrarCliente();
                    break;
               
                case 5:
                    obj.leerClientes();
                    System.out.println("Digite el numero de cedula");
                    int c=leer.nextInt();
                    obj.cambiarEstado(c);
                    obj.guardarObjetos();
                    break;
                case 6:
                    obj.leerClientes();
                    System.out.println("Digite el numero de cedula");
                    int ced=leer.nextInt();
                    System.out.println("Digite el monto que desea depositar");
                    double m=leer.nextDouble();
                    obj.depositar(ced, m);
                    obj.guardarObjetos();
                    break;
                case 7:
                    obj.leerClientes();
                    System.out.println("Digite el numero de cedula");
                    int cedu=leer.nextInt();
                    System.out.println("Digite el monto que desea reetirar");
                    double mon=leer.nextDouble();
                    obj.retirar(cedu, mon);
                    obj.guardarObjetos();
                    break;
                default:
                    continuar = false;
                    break;
            }
        } while (continuar);
    }

}
