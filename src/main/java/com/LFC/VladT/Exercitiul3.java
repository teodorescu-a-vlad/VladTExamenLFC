package com.LFC.VladT;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;

public class Exercitiul3 {

    public static void main(String[] args) {

        System.out.println("Daca instructiunea are eticheta introduceti numarul etichetei L, altfel tastati 0!");
        int a = readNextValue();
        System.out.println("Daca instructiunea contine variabila de iesire tastati 0,");
        System.out.println("Daca instructiunea contine variabila de intrare tastati 1,");
        System.out.println("Daca instructiunea contine variabila intermediara tastati 2,");
        int  c = readNextValue();
        int i;
        int l;
        int b;
        while (!Arrays.asList(0,1,2).contains(c)) {
            if (!Arrays.asList(0,1,2).contains(c)){
                System.out.println("Va rog introduceti 0, 1 sau 2!");
                c = readNextValue();
            }

        }
        if (c==1) {
            System.out.println("Introduceti indicele variabilei!");
             i = readNextValue();
            c=(2*i)-1;
        }else if(c==2){
            System.out.println("Introduceti indicele variabilei!");
             i = readNextValue();
            c=2*i;
        }

        System.out.println("Alegeti instructiunea tastand numarul din dreptul ei:");
        System.out.println("0. v←v ");
        System.out.println("1. v←v+1 ");
        System.out.println("2. v←v-1 ");
        System.out.println("3. IF v≠0 goto L ");
        b = readNextValue();

        while (!Arrays.asList(0,1,2,3).contains(b)) {
            if (!Arrays.asList(0,1,2,3).contains(c)){
                System.out.println("Va rog introduceti 0, 1, 2 sau 3!");
                b = readNextValue();
            }

        }
        if (b==3) {
            System.out.println("Introduceti L!");
            l = readNextValue();
            b=2+l;
        }
        int z = ((int) Math.pow(2, b) * ((2 * c) + 1)) - 1;
         z = ((int) Math.pow(2, a) * ((2 * z) + 1)) - 1;
        System.out.println("#(I)="+z);
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
