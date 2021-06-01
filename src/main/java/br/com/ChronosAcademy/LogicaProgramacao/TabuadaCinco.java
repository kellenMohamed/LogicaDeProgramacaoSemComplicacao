package br.com.ChronosAcademy.LogicaProgramacao;
    /*
        Criar uma tabuada do número 5, no intervalo de 1 a 10.
     */
public class TabuadaCinco {
    public static void main(String[] args) {
        int tabuada = 5;

        //Primeiro parâmetro é o contador e de onde inicia.
        //Segundo até quanto deve incrementar.
        //Terceiro é o incremento. Ex: i++, i+1 ou i+2.
        for (int i=0; i<11; i++){
            System.out.println("Valor da tabuada do " + tabuada + " na posição " + tabuada + "x" + i + " é " + (tabuada * i));
        }
    }
}
