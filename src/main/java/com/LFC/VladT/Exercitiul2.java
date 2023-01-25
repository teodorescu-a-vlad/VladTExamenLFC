package com.LFC.VladT;

import java.util.Scanner;
import java.lang.Math;
import java.util.Stack;

public class Exercitiul2 {
    public static void main(String[] args) {
        int nrExpon;
        int rezultat = 1;
        Stack<Integer> primeList = new Stack<Integer>();
        Stack<Integer> lista = new Stack<Integer>();

        System.out.println("Introduceti lista de numere delimitata cu \",\" pentru a se calcula numarul lui Gödel. Pentru calcularea listei de numere introduceti doar un singur element!");
        lista=readNextValue();
        nrExpon=lista.size();
        if (nrExpon==1) {
            int rez= lista.pop();
            lista=genPrimeAfter(rez);
            System.out.println("Lista exponentilor este:");
            System.out.println(lista);
        }
        else{
            primeList = genPrimeNr(nrExpon);

            while (!lista.isEmpty()) {
                rezultat = rezultat * ((int) Math.pow(primeList.pop(), lista.pop()));
            }
            System.out.println("Numarul lui Gödel este:");
            System.out.println(rezultat);
        }


    }

    private static Stack<Integer> readNextValue(){
        Stack<Integer> x = new Stack<Integer>();
        while(true) {
            try {
                Scanner scaner = new Scanner(System.in);
                String line = scaner.nextLine();
                String[] arr = line.split(",");
                for (String s : arr) {
                    if (Integer.parseInt(s) < 0) {
                        throw new RuntimeException();
                    } else {
                        x.push(Integer.parseInt(s));
                    }
                }
                break;
            } catch (RuntimeException e) {
                System.out.println("Nu ati introdus un numar natural! Reincercati");
                x.clear();
            }
        }
        return x;
    }

    private static Stack<Integer> genPrimeNr(int nrExpon) {
        Stack<Integer> x = new Stack<Integer>();
        x.push(2);
        int number = 3 ;
        while ((nrExpon-1)>0){
            boolean isprim=true;


            for (Integer elm : x) {

                if (number%elm==0){
                    isprim=false;
                    break;
                }
            }
            if (isprim) {
                x.push(number);
                nrExpon = nrExpon - 1;
            }
            number=number+1;
            System.out.println(x);
        }

        return x;
    }

    private static Stack<Integer> genPrimeAfter(int rez) {
        Stack<Integer> primeList = new Stack<Integer>();
        Stack<Integer> expList = new Stack<Integer>();

        primeList.push(2);
        int number=3;
        while (number<=rez){

            boolean isprim=true;


            for (Integer elm : primeList) {

                if (number%elm==0){
                    isprim=false;
                    break;
                }
            }
            if (isprim) {
                primeList.push(number);
            }
            number=number+1;

        }

        while (rez>1){
            for (Integer elm : primeList) {
                expList.push(0);
                while (rez%elm==0){
                    expList.push(expList.pop()+1);
                    rez=rez/elm;
                }
            }
        }
        return expList;
    }




}
