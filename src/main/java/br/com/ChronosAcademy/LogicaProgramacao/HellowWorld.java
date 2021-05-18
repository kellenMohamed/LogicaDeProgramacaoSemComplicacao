package br.com.ChronosAcademy.LogicaProgramacao;

import java.sql.SQLOutput;

public class HellowWorld {

    // Classe que cria o exe do Java:
    public static void main(String[] args) {
        //println quebra uma linha.
        System.out.println("Hello World");

        //Teste tipos de variáveis;
        boolean encontrado = false;
        encontrado = true;
        System.out.println(encontrado);

        char varChar = 'A';
        System.out.println("Char: " + varChar);

        float varFloat = 12.5f;
        System.out.println("Float: " + varFloat);

        double varDouble = 12.5;
        System.out.println("Double: " + varDouble);

        byte varByte = 127;
        System.out.println("Byte: " + varByte);

        short varShort = 32767;
        System.out.println("Short: " + varShort);

        int varInt = 2147483647;
        System.out.println("Int: " + varInt);

        long varLong = 922337206854775806L;
        System.out.println("Long: " + varLong);

    }
}
