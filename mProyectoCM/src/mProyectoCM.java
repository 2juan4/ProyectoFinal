package mensaje_morse;

import java.util.Scanner;

public class mProyectoCM {

    // Imprimir  
    static void print(String indicaciones) {
        System.out.println(indicaciones);
    }

    static void separador() {
        print("--------------------------------------------------");
    }

    static void separador2() {
        print("");
    }

    public static void main(String[] args) {

        menu();
    }
    //Menu

    static void menu() {
        separador();
        Scanner teclado = new Scanner(System.in);
        print("Bienvenido(a) a nuestro sistema de mensajeria");
        separador2();
        print("--1.Enviar Mensaje");
        separador2();
        print("--2.Salir");
        separador2();
        print("INGRESE EL NUMERO DE LA OPCION QUE DESEA");
        int Nmenu = teclado.nextInt();
        menu2(Nmenu);
        separador();
    }
    //Menu2

    static void menu2(int Nmenu) {
        if (Nmenu == 1) {
            //Ingresar un mensaje
            int precio = 0;
            String mensaje;
            Scanner teclado = new Scanner(System.in);
            print("Ingrese su mensaje: ");
            mensaje = teclado.nextLine();
            String frase = mensaje;
            String[] fraseArr = frase.split(" ");
            for (String cadaPalabra : fraseArr) {//Aqui tienes cada palabra individual de cadaPalabra
                int numeroLetras = cadaPalabra.length();//Cuenta las letras de cada palabra
                //Con un If para ir sumando el precio de cada palabra
                if (numeroLetras <= 3) {
                    precio = precio + 10;
                } else {
                    precio = precio + 15;
                }

            }

            System.out.println("El precio del mensaje es de $" + precio);

        }

    }

}

