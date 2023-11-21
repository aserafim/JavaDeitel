package ch02;

import java.util.Scanner;

public class exercicio2_15 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int x, y;

        System.out.print("Insira o primeiro número: ");
        x = input.nextInt();

        System.out.print("Insira o segundo número: ");
        y = input.nextInt();

        System.out.printf("%s%d%s%d%s%d%s%d","Soma: ", (x+y), "   Produto: "
        , (x*y), "   Diferença: ", (x-y), "   Quociente: ", x/y);

    }
}
