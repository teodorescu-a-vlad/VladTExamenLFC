package com.LFC.VladT;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class Exercitiul1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Daca doriti sa introduceti perechea X,Y apasati \"y\" si ENTER");
        char qbranch='y';
        /*
        daca primul caracter introdus e y cerem de la tastatura x si y
         */
        if (scaner.next().charAt(0)=='y') {
            System.out.println("Introduceti primul numar!");
            int x = readNextValue();
            System.out.println("Introduceti al doilea numar!");
            int y = readNextValue();
            int z = ((int) Math.pow(2, x) * ((2 * y) + 1)) - 1;
            System.out.println(z);
        }
        else{
            // daca primul caracter introdus nu e y cerem de la tastatura rezultatul lui <x,y>
            System.out.println("Introduceti rezultatul lui <x,y>!");
            //citim rezultatul si adunam 1 (trecut peste egal -1)
            int z = 1 + readNextValue() ;
            int x = 0; // initializam x cu 0 (x determina de cate ori se imparte exact la 2 z(numarul introdus +1)
            while (z%2==0){
                z=z/2;//reducem puterea lui 2 prin impartire la 2
                x=x+1;// si incrementam x
            }
            int y=(z-1)/2;//determinam y in functie de z care acum este (numarinrodus+1)/2^x

            System.out.println("<"+x+","+y+">");
        }
    }
    private static int readNextValue(){
        int x;
        /*
        while the imput is negative or not a number retry
         */
        while(true){
            try {
                Scanner scaner = new Scanner(System.in);
                x = scaner.nextInt();
                if (x<0) {
                    /*
                    generate a new error for negative number
                     */
                    throw new RuntimeException();
                }
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("Nu ati introdus un numar natural! Reincercati");
            }
            catch(RuntimeException a) {
                System.out.println("Nu ati introdus un numar natural! Reincercati");
            }
        }
        return x;
    }
}

