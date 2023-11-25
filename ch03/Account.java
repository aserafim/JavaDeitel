package ch03;

public class Account {

    private String name; //nome atrelado a conta
    private int cpf;
    private double balance;

    //construtor que exige nome e saldo
    public Account(String name, double initialBalance){
        this.name = name;
        if(initialBalance > 0.0){
            this.balance = initialBalance;
        }
    }
    public void setName(String name){
        this.name = name;
    }

    public void setCPF(int cpf){
        this.cpf = cpf;
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }
    public String getName(){
        return this.name;
    }
    public int getCPF(){
        return this.cpf;
    }
    public double getBalance(){
        return balance;
    }
}
