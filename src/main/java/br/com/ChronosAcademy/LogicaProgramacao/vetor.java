package br.com.ChronosAcademy.LogicaProgramacao;

import java.sql.SQLOutput;

/*
Criar um vetor que receba dez valores e exiba:
- O maior valor.
- A soma dos valores.
- A média aritmética

O método deverá ser executado através de uma aplicação.

 */
public class vetor {

    public static void main(String[] args) {

        //Vetor é uma coluna com várias linhas, similar à planilha.
        int vetor[] = {2,10,5,7,3,1,6,8,9,11};
        exibirResultado(vetor);
    }

    //Método que exibirá os valores do vetor criado no psvm:
    public static void exibirResultado(int[] vetor) {
        int maior = 0;
        int soma = 0;
        float media = 0f;

        //Criar um loop para passar por todo o vetor:
        //for (int i =0; i< vetor.length; i++){
        //Usaremos o for each neste exemplo:
        for (int valor : vetor){
            if (valor > maior) {
                maior = valor;
            }

            //Somar soma + soma anterior.
            soma += valor;
        }

        media = soma / (float)vetor.length;

        System.out.println("O maior valor é: " + maior);
        System.out.println("O valor da soma é: " + soma);
        System.out.println("O valor da média aritmética é: " + media);
    }
}
