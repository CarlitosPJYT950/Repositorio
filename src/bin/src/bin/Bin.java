package bin;

import java.util.Scanner;

public class Bin {
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre[] = new String[8];
        Scanner teclado = new Scanner (System.in);
        
        for (int i = 0; i < nombre.length; i++){
            System.out.println("Ingrese el nombre que quiere guardar");
            nombre[i] = teclado.nextLine();
        }
        for(int i = 0; i < nombre.length; i++){
            System.out.print("El nombre: " + nombre[i] + " ");
            System.out.println("Esta guardado en el indice " + i);
        }
    }
}