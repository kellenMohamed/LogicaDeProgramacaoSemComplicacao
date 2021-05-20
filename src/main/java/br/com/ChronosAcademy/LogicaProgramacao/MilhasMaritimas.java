package br.com.ChronosAcademy.LogicaProgramacao;

public class MilhasMaritimas {

    public static void main(String[] args) {

        /* Sabendo q uma milha vale 1852 metros.
         E 1km possui 1000 metros.
         Fazer um propgrama para converter milhas marítimas em quilômetros.
        */

        int qtdeMilhas = 4;
        float milha = 1852; // valor de uma milha em metros.
        milha = milha / 1000; // mudando a milha acima para Km pois está em metros.

        float Km = milha * qtdeMilhas;

        System.out.println("O valor de quatro milhas em Km, sabendo que uma milha tem 1.852 metros é: " + Km + "Km");

    }
}
