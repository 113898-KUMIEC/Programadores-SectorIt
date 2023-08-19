package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner s = new Scanner(System.in);

        System.out.println("Ingresar tamaño de fila y columna");
        int tamaño = s.nextInt();

        char[][] tablero = new char[tamaño][tamaño];

        for (int i=0; i<tamaño;i++){
            for (int z=0; z<tamaño;z++){
                if ((i + z) % 2 == 0){
                    tablero[i][z] = 'R';
                }else {
                    tablero[i][z] = 'A';
                }
            }
            System.out.println();
        }

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}