package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner wyraz = new Scanner(System.in);//Tworzymy scanner.
        System.out.println("1.Start programu.");//Wywołujemy napis startu programu.
        System.out.println("2.Wpisz,wyraz ciągu Fibonacci'ego:");//Wywołujemy napis pomocniczy.
        int a = wyraz.nextInt();// Deklarujemy zmienną.
        wyraz.close();//Zamykamy Scanner.

        if(a<40) {//Podajemy warunek ograniczający zakres ciągu.
            System.out.print(a + "  wyraz ciagu uzyskany metodą iteracyjną, to : ");
            System.out.println(iteracja(a));
            System.out.println("Koniec programu.");
        }
        else
            System.out.println("Koniec programu");//Instrukcja do wykonania w przypadku niezgodności z warunkiem if .

    }
    public static int iteracja(int n){// Powoływanie metody liczącej nasz ciąg.
        if(n==0)
            return 0;//Dla zerowego wyrazu ciągu program zwraca zero .
        int a, b, c ; //Deklarujemy zmienne, które są wyrazami ciągu.
        a = 1;
        b = 1;
        if(n<=2)
            return a;

        for(int i=0; i < n-2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}


