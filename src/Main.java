import JUDO.Registrar_Municipio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nom= new Scanner(System.in);
        Scanner per=new Scanner(System.in);
        System.out.println("Ingrese el nombre del municipio");
        String nombre=nom.nextLine();
        System.out.println("Ingrese el codigo de personeria: ");
        String ci= per.nextLine();
        Registrar_Municipio r1= new Registrar_Municipio(nombre,ci);
        System.out.println(r1);
    }
}