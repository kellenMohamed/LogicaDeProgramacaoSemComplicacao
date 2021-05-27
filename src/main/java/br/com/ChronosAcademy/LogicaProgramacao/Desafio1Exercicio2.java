package br.com.ChronosAcademy.LogicaProgramacao;

public class Desafio1Exercicio2 {
    /*
    Com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
    Dica:
    Fahrenheit = celsius x 1.8 + 32
     */

    public static void main(String[] args) {
        double tempCelsius = 25;
        double tempFinal = tempCelsius*1.80+32;

        System.out.println("A temperatura em graus Celsius é: " + tempFinal);
    }
}
