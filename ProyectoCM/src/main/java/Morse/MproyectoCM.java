package Morse;

import java.util.Scanner;

public class MproyectoCM {
                                   
static String mensaje;
static int precio;
    private static int menu2;
    private static Iterable<String> mensajeArr;
      
    static void print(String indicacion) { 
        System.out.println(indicacion);
    }
    static void separar() {
        print("=========================================");
    }
    static void separar2() {
        print("");
    }
     public static void main(String[] args) {
        informacion();
        menu();
    }
    static void informacion() {
        print("\n    Universidad Autonoma de Campeche   ");
        print("         Facultad de Ingenieria      ");
        print(" Ingeniería en Sistemas Computacionales ");
        print("       Lenguaje de Programación 1    ");
        print("    Avilez - Berzunza - Cruz - Vargas   \n");
        
}
    static void menu() {
        separar();
        Scanner teclado = new Scanner(System.in);
        print("\nBienvenido aqui podra redactar un mensaje");
        separar2();
        print(" 1.- Redactar Mensaje");
        separar2();
        print(" 2.- Salir");
        separar2();
        print("Seleccione una opción para continuar...");
        int menu1 = teclado.nextInt();
        menu2(menu1);
        separar();
    }
        static void menu2(int menu1) {
        if (menu1 == 1) {
            Scanner teclado = new Scanner(System.in);
            separar2();
            separar();
            print("Redacte un mensaje: ");
            mensaje = teclado.nextLine();
            String frase = mensaje;
            String[] mensajeArr = frase.split(" ");
            
            separar2();
            print("Su mensaje en código morse es: ");
            char[] morse = mensaje.toCharArray(); 
            
            for (int i = 0; i < mensaje.length(); i++) { 
                switch (morse[i]) { 
                    case 'A':
                        System.out.print(".- ");
                        break;
                    case 'B':
                        System.out.print("-... ");
                        break;
                    case 'C':
                        System.out.print("-.-.");
                        break;
                    case 'D':
                        System.out.print("-..");
                        break;
                    case 'E':
                        System.out.print(". ");
                        break;
                    case 'F':
                        System.out.print("..-. ");
                        break;
                    case 'G':
                        System.out.print("--. ");
                        break;
                    case 'H':
                        System.out.print(".... ");
                        break;
                    case 'I':
                        System.out.print(".. ");
                        break;
                    case 'J':
                        System.out.print(".--- ");
                        break;
                    case 'K':
                        System.out.print("-.-. ");
                        break;
                    case 'L':
                        System.out.print(".-.. ");
                        break;
                    case 'M':
                        System.out.print("-- ");
                        break;
                    case 'N':
                        System.out.print("-. ");
                        break;
                    case 'O':
                        System.out.print("--- ");
                        break;
                    case 'P':
                        System.out.print(".--. ");
                        break;
                    case 'Q':
                        System.out.print("--.- ");
                        break;
                    case 'R':
                        System.out.print(".-. ");
                        break;
                    case 'S':
                        System.out.print("... ");
                        break;
                    case 'T':
                        System.out.print("- ");
                        break;
                    case 'U':
                        System.out.print("..- ");
                        break;
                    case 'V':
                        System.out.print("...- ");
                        break;
                    case 'W':
                        System.out.print(".-- ");
                        break;
                    case 'X':
                        System.out.print("-..- ");
                        break;
                    case 'Y':
                        System.out.print("-.-- ");
                        break;                    
                    case 'Z':
                        System.out.print("--.. ");
                        break;
                    default:
                        System.out.print(" / ");

                }

            }

            for (String cadaPalabra : mensajeArr) {
                int numeroLetras = cadaPalabra.length();
                if (numeroLetras <= 3) {
                    precio = precio + 10;
                } else {
                    precio = precio + 15;
                }

            }
            pago();
        }
        }     
        private static void pago() {
        separar2();
        separar();
        System.out.println("total a pagar $" + precio);
        Scanner lector = new Scanner(System.in);
        print("¿Procedera a realizar el pago?");
        separar2();
        print("1-. SI");
        print("2-. NO, SALIR");
        int pago1 = lector.nextInt();
   
        if (pago1 == 1) {
            separar2();
            Scanner nnimporte = new Scanner(System.in);
            print("Introduzca su importe emprendido solo de $100, $200, $500 y $1000");
            int importe = lector.nextInt();
            if (importe == 100) {
                Scanner Nimporte = new Scanner(System.in);
                print("Si su importe sobrepasa los $100 introduzca cuantos importes procesara");
                int nimporte = lector.nextInt();
                int Total = nimporte * importe;
                if (Total < precio) {
                    print("No tiene suficiente dinero");
                    pago();
                }
                int cambio = Total - precio;
                System.out.print("Su cambio es $" + cambio);
                separar2();
                separar();
                print("Su mensaje fue enviado..");
            }
            if (importe == 200) {
                Scanner Nimporte = new Scanner(System.in);
                print("Si su importe sobrepasa los $100 introduzca cuantos importes procesara");
                int nimporte = lector.nextInt();
                int Total = nimporte * importe;
                if (Total < precio) {
                    print("No tiene suficiente dinero");
                    pago();
                }
                int cambio = Total - precio;
                System.out.print("Su cambio es $" + cambio);
                separar2();
                separar();
                print("Su mensaje fue enviado");
            }
            if (importe == 500) {
                Scanner Nimporte = new Scanner(System.in);
                print("Si su importe sobrepasa los $100 introduzca cuantos importes procesara");
                int nimporte = lector.nextInt();
                int Total = nimporte * importe;
                if (Total < precio) {
                    print("No tiene suficiente dinero");
                    pago();
                }
                int cambio = Total - precio;
                System.out.print("Su cambio es $" + cambio);
                separar2();
                separar();
                print("Su mensaje fue enviado...");
            }
            if (importe == 1000) {
                Scanner Nimporte = new Scanner(System.in);
                print("Si su importe sobrepasa los $100 introduzca cuantos importes procesara");
                int nimporte = lector.nextInt();
                int Total = nimporte * importe;
                if (Total < precio) {
                    print("No tiene dinero suficiente");
                    pago();
                }else {
                   int cambio = Total - precio;
                   System.out.print("Su cambio es $" + cambio);
                   separar();
                   print("Su mensaje fue enviado...");  
                }
            }
             if (importe < 100 || importe > 1000 || importe == 300 || importe == 400) {
                separar();
                print(" Error en el proceso ");
                print("  Proceso cancelado  ");
                pago();
        }
    }
  }

 
}
    
   
