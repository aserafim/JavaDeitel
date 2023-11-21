package ch02;

import java.util.Scanner;

public class exercicio2_6 {

    public static void main(String[] args){

       Scanner input = new Scanner(System.in);
       int x, y, z;

       System.out.print("Insira o primeiro inteiro: ");
       x = input.nextInt();

       System.out.print("Insira o segundo inteiro: ");
       y = input.nextInt();

       System.out.print("Insira o terceiro inteiro: ");
       z = input.nextInt();

       int result = x * y * z;

       System.out.printf("%s%d", "Product is ", result);
    }

}
