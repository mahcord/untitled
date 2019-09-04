package com.company;

import java.util.Scanner;

import static jdk.nashorn.internal.parser.TokenType.IF;

public class Main<totalpago, copias> {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int copias;
        System.out.println("Informe a quantidade de cópias");
        copias = sc.nextInt();
        double totalpago;
        if (copias <= 100)

            totalpago = copias * 0.25;
        else {
            totalpago = copias * 0.20;
        }
        System.out.println("O valor pago é R$"+totalpago);

    }
    }

