/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hernandez_fernando_lab3;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author fdhg0
 */
public class Hernandez_Fernando_lab3 {

    public static void main(String[] args) {
        Random numerosAleatorios= new Random();
        Scanner lea = new Scanner(System.in);
            String opcionjuego = "";
            String opcionUsuario = "";
            int opcionCorrecta = 0;
        System.out.println("----MENU----");
        System.out.println("1- juego piedra, papel o tijera");
        System.out.println("2- ejercicio Suma");
        System.out.println("3- patron numero");
        int opcion = lea.nextInt();

        String denuevo = "si";

        if (opcion == 1) {



                while (denuevo.equals("si")) {
                    System.out.println("juego de piedra papel o tijera.");
                    while (opcionCorrecta == 0) {
                        System.out.println("quieres usar piedra,papel o tijera? ");
                        opcionUsuario = lea.next().toLowerCase();
                        if (opcionUsuario.equals("piedra") || opcionUsuario.equals("papel") || opcionUsuario.equals("tijera")) {
                            opcionCorrecta++;

                            System.out.println("Opcion valida.");
                        } else {
                            System.out.println("Favor ingrese una opcion valida.");
                        }
                    }
                    int opcionComputadora = numerosAleatorios.nextInt(3);
                    String computadora = "";

                    if (opcionComputadora == 0) {
                        computadora = "piedra";
                    } else if (opcionComputadora == 1) {
                        computadora = "papel";
                    } else if (opcionComputadora == 2) {
                        computadora = "tijera";
                    }

                    if (opcionUsuario.equals(computadora)) {
                        System.out.println("la maquina utilizo " + computadora);
                        System.out.println("Empate.");
                    } else if ((opcionUsuario.equals("piedra") && computadora.equals("tijera")
                            || (opcionUsuario.equals("tijera") && computadora.equals("papel")
                            || (opcionUsuario.equals("papel")) && computadora.equals("piedra")))) {
                        System.out.println("la maquina utilizo:" + computadora);
                        System.out.println("VICTORIA.");
                    } else {
                        System.out.println("la maquina utilizo: " + computadora);
                        System.out.println("DERROTA.");
                       
                    }
                    opcionCorrecta--;
                    System.out.println("Quiere volver a jugar? ");
                    denuevo=lea.next();

                }
            }
            if (opcion == 2) {

                int numero = 0;
                char numeroActual = 0;
                int contador = 0;
                int resultado = 0;

                System.out.println("ingrese una cadena de numeros: ");
                numero = lea.nextInt();

                String cambio = Integer.toString(numero);

                while (contador < cambio.length()) {
                    numeroActual = cambio.charAt(contador);
                    resultado += Character.getNumericValue(numeroActual);
                    contador++;
                    if (contador < cambio.length()) {
                        System.out.print(numeroActual + " + ");
                    } else {
                        System.out.print(numeroActual);
                    }
                }
                System.out.print(" = " + resultado);
            }

            if (opcion == 3) {
                int fila;
                int contador = 0;
                int contadorEspacio = 0;
                String espacio = "";

                System.out.println("ingrese el numero de filas deseado");
                fila = lea.nextInt();

                int filalimite = fila;

                while (contador < filalimite) {

                    while (contadorEspacio < contador) {
                        espacio = espacio + filalimite;

                        contadorEspacio++;
                    }
                    System.out.println(fila);
                    contador++;

                }

            }
            if (opcion==4){
                System.out.println("Saliendo");
                System.exit(0);
            }
        }
        // TODO code application logic here
    }

