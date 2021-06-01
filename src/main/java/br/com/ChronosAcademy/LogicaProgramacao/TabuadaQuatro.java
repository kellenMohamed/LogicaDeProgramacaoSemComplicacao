package br.com.ChronosAcademy.LogicaProgramacao;
/*
    Criar uma tabuada do número 5, no intervalo de 10 a 1.
 */
public class TabuadaQuatro {
    public static void main(String[] args) {
        int tabuada = 4;

        //Primeiro parâmetro é o contador e de onde inicia.
        //Segundo até quanto deve incrementar.
        //Terceiro é o incremento. Ex: i++, i+1 ou i+2.
        for (int i = 10; i > 0; i--) {
            System.out.println("Valor da tabuada do " + tabuada + " na posição " + tabuada + "x" + i + " é " + (tabuada * i));
        }
    }
}
