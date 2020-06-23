package Morse;

import java.util.Scanner;

public class MproyectoCM {
     public static void main(String[] args) {
        informacion();
        menu();
    }
    static void informacion() { //Datos
        print("Universidad Autonoma de Campeche.");
        print("Facultad de Ingenieria");
        print("Ingenieria en Sistemas Computacionales");
        print("Lenguaje de Programacion 1");
        print("Avilez Miss Juan Carlos\n");
        
    }   
    static void print(String indicaciones) { // Imprimir
        System.out.println(indicaciones);
    }

    static void separador() {
        print("=========================================");
    
    }
    static void separador2() {
        print("");
    }
    static void menu() { //Menu
        separador();
        Scanner teclado = new Scanner(System.in);
        print("\nBienvenido aqui podra redactar un mensaje");
        separador2();
        print(" 1.- Redactar Mensaje");
        separador2();
        print(" 2.- Salir");
        separador2();
        print("Seleccione una opción para continuar...");
        int Nmenu = teclado.nextInt();
      menu2(Nmenu);
        separador();
        
        separador2();
        print("Si -> 1");
        print("No (Salir) -> 2");
        separador2();
        print("Ingrese el numero de la opcion que desea: ");
        print("Ingrese el numero de la opcion que desea: ");
        int menu1 = teclado.nextInt();
        menu2(menu1);
        separador();
    }

    private static void menu2(int Nmenu) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}