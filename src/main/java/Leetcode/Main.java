package Leetcode;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();

        double n = 3.14159;

        double area = n * (raio * raio);

        System.out.printf("A=%.4f", area);
        System.out.println();

        sc.close();
    }

}
