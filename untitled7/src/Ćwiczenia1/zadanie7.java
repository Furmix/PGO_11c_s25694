package Ćwiczenia1;

import java.util.Scanner;


public class zadanie7 {

    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);

            int n = scan.nextInt();
            String dwa = "*";
            if (n < 5 || n % 2 == 0) {
                System.out.println("Spróbuj ponownie, liczba powinna byc równa co najmniej 5 i być liczbą nieparzystą");
            } else {


                for (int i = 1; i < n + 1; i++) {
                    if (i == 1 || i == n) {
                        for (int j = 1; j < n + 1; j++) {
                            System.out.print("*");
                        }
                    } else {
                        System.out.print("*");
                        for (int k = 1; k <= i - 2; k++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                        for (int k = 1; k <= n - i - 1; k++) {
                            System.out.print(" ");
                        }
                        System.out.print("*");
                    }
                    System.out.println();
                }

            }


        }
    }
}
