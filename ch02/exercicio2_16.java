package ch02;

import java.util.Scanner;

public class exercicio2_16 {

    public static void main(String[] args){

        int firstNum, secondNum;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        firstNum = input.nextInt();

        System.out.print("Insira o segundo número: ");
        secondNum = input.nextInt();

        if(firstNum == secondNum){
            System.out.println("Os números são iguais!");
        }else if(firstNum > secondNum){

            System.out.printf("%d%s", firstNum, " is larger.");
        } else {System.out.printf("%d%s", secondNum, " is larger.");}


    }
}
