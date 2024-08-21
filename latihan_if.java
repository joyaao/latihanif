package latihan_if;

import java.util.Scanner;

public class latihan_if {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan sebuah bilangan");
        int bilangan = input.nextInt();


        if (bilangan == 0) {
            System.out.println("Bilangan tersebut NOL ");
        } 

        else if (bilangan % 2 == 0 ){
            System.out.println( "Bilangan tersebut adalah genap");
        }
        else {
            System.out.println("Bilangan tersebut ganjil");
        }
        if (bilangan % 2 == 0 ){
            System.out.println( "Bilangan tersebut adalah positif");
        }
        else {
            System.out.println("Bilangan tersebut negatif");
        }
    }
} 
