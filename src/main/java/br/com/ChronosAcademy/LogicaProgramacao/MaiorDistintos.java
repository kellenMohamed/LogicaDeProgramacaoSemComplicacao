package br.com.ChronosAcademy.LogicaProgramacao;

public class MaiorDistintos {
    /*
        Com 3 valores distintos.
        Exibir o maior deles.
     */
    public static void main(String[] args) {
        /*
        int valorA = 77;
        int valorB = 77;
        int valorC = 77;
        */

        int valorA = 5;
        int valorB = 6;
        int valorC = 7;


        // Segunda Validação:
        if (valorA > valorB && valorA > valorC){
            System.out.println("O maior valor é o: "+ valorA);
        }else if(valorB > valorA && valorB > valorC){
            System.out.println("O maior valor é o: "+ valorB);
        }else if(valorA == valorB && valorA == valorC){
            System.out.println("Os valores são iguais: "+ valorB);
        }
        else{
            System.out.println("O maior valor é o: "+ valorC);
        }

    }
}
