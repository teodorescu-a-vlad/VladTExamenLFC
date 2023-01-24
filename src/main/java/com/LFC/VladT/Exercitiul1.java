package com.LFC.VladT;

import java.util.*;

public class Exercitiul1 {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Daca doriti sa introduceti perechea X,Y apasati \"y\" si ENTER");
        char qbranch='y';
        if (scaner.next().charAt(0)=='y') {
            System.out.println("Introduceti primul numar!");
            int x = readNextValue();
            System.out.println("Introduceti al doilea numar!");
            int y = readNextValue();
            int z = ((int) Math.pow(2, x) * ((2 * y) + 1)) - 1;
            System.out.println(z);
        }
        else{
            System.out.println("Introduceti rezultatul lui <x,y>!");
            int z = 1 + readNextValue() ;
            int x = 0;
            while (z%2==0){
                z=z/2;
                x=x+1;
            }
            int y=(z-1)/2;

            System.out.println("<"+x+","+y+">");
        }
    }
    private static int readNextValue(){
        int x;
        while(true){
            try {
                Scanner scaner = new Scanner(System.in);
                x = scaner.nextInt();
                if (x<0) {
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

