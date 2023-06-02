package com.edu.contabancaria;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroConta;
        String agenciaCliente;
        String nomeCliente;
        float saldoCliente;
        
        System.out.println("|====[Banco Java]====|"); 

        System.out.println("Nome Cliente");
        nomeCliente = sc.nextLine();
        System.out.println("Agencia");
        agenciaCliente = sc.nextLine();
        System.out.println("Conta");
        numeroConta = sc.nextInt();
        System.out.println("Saldo Inicial");
        saldoCliente = sc.nextFloat();

        System.out.println("Olá, Cliente:"
        + nomeCliente 
        + " Seja bem vindo!" 
        +"\nAgencia:"+ agenciaCliente 
        + " Conta:"+numeroConta 
        + "\nSeu saldo inicial de abertura de conata R$:"+ saldoCliente);
    
    }
     

    
}
