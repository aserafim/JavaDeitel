package ch03;

import java.util.Scanner;

public class AccountTest {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        Account account1 = new Account("Alefe", 5740.0);
        Account account2 = new Account("Evilásio", -440.0);

        System.out.printf("The account 1 belongs to %s and it has an initial balance of %.2f%n", account1.getName(), account1.getBalance());

        System.out.printf("The account 2 belongs to %s and it has an initial balance of %.2f%n", account2.getName(), account2.getBalance());

    }

}
