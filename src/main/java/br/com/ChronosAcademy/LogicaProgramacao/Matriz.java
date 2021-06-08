package br.com.ChronosAcademy.LogicaProgramacao;

/*
Criar uma matriz com três nomes e sexos.
Exibir o nome e sexo de cada item da matriz.
 */
public class Matriz {

    public static void main(String[] args) {
        //Criando a Matriz (linha e coluna):
        String[][] matriz = {
                                {"Kellen","Gabriel","Gabriela"},
                                {"feminino","masculino","feminino"}
                             };

        for (int i = 0; i < matriz[0].length; i++){
            System.out.println("Nome: " + matriz[0][i]);
            System.out.println("Sexo: " + matriz[1][i]);
            System.out.println("");
        }
    }
}


















