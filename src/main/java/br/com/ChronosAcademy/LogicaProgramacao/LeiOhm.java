package br.com.ChronosAcademy.LogicaProgramacao;

import java.util.Arrays;

public class LeiOhm {

    public static void main(String[] args) {
        /*
        Calcular e exibir a tensão de um determinado circuito eletronico a partir de
            valores da resistência e corrente elétrica.
        Dica: Fórmula de Ohm (resistência = tensão / corrente elétrica.

        R = U / I
        R * I = U
        U = R * I

        */

        int r = 100;
        int i = 2;
        int u = r * i;

        System.out.println("O resultado da tensão é: " + u + " Volts");

    }
}

// Desafio: https://www.interviewzen.com/apply/Q8tM3x
