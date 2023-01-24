package com.LFC.VladT;

import java.util.*;

public class Exercitiul2 {
    public static void main(String[] args) {
        int nrExpon;
        int rezultat = 1;
        Stack<Integer> primeList = new Stack<Integer>();
        Stack<Integer> lista = new Stack<Integer>();

        lista=readNextValue();
        nrExpon=lista.size();
        primeList=genPrimeNr(nrExpon);

        while (lista.isEmpty()==false){
            rezultat=rezultat *((int) Math.pow(primeList.pop(), lista.pop()));
        }


        System.out.println(rezultat);

    }

    private static Stack<Integer> readNextValue(){
        Stack<Integer> x = new Stack<Integer>();
        Scanner scaner = new Scanner(System.in);
        String line = scaner.nextLine();
        String[] arr= line.split(",");
         for(int i = 0;i < arr.length;i++)
        {
            x.push(Integer.parseInt(arr[i]));
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
                }
            }
            if (isprim==true) {
                x.push(number);
                nrExpon = nrExpon - 1;
            }
            number=number+1;
            System.out.println(x);
        }

        return x;
    }


}
