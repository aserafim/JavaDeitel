package ch02;

import java.util.Scanner;

public class exercicio2_17 {

    public static void main(String[] args) {

        int firstNum, secondNum, thirdNum;
        int soma, media, produto;
        int aux, menor =0;
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        firstNum = input.nextInt();

        System.out.print("Insira o segundo número: ");
        secondNum = input.nextInt();

        System.out.print("Insira o terceiro número: ");
        thirdNum = input.nextInt();

        soma = firstNum + secondNum + thirdNum;
        produto = firstNum * secondNum * thirdNum;
        media = (firstNum + secondNum + thirdNum) / 3;

        System.out.printf("%s%d%s%d%s%d%s","A soma dos números é ", soma, " o produto é ", produto," e a média é ", media, ".");

        //Ordena os números
        menor = firstNum;
        if(firstNum == secondNum && secondNum == thirdNum){
            System.out.println("Os números são iguais.");
        }else
        if(secondNum < menor){
            menor = secondNum;
        }
        if(thirdNum < menor){
            menor = thirdNum;
        }


    }
}
