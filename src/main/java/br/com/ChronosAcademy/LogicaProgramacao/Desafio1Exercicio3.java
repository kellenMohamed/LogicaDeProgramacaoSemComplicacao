package br.com.ChronosAcademy.LogicaProgramacao;

public class Desafio1Exercicio3 {
    /*
    Com o valor da cotação do dólar e uma certa quantidade de dólares.
    Calcular e exibir o valor correspondente em Reais (R$).
     */
    public static void main(String[] args) {
        double valorDollar = 5.35;
        double qtdeDinheiro = 14.33;
        double TotalReais;

        TotalReais = qtdeDinheiro * valorDollar;

        System.out.println("Valor Total de Dinheiro em Reais é: " + TotalReais);


    }
}
