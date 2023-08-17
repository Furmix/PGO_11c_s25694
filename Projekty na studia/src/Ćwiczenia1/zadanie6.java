package Ćwiczenia1;


import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class zadanie6 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for(int i=0; i<10; i++){
            arr[i] = ThreadLocalRandom.current().nextInt(100, 1000 + 1);
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}