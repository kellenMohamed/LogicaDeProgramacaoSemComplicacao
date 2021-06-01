package br.com.ChronosAcademy.LogicaProgramacao;
/*
    Criar uma tabuada do número 5, no intervalo de 10 a 1.
 */
public class TabuadaQuatro {
    public static void main(String[] args) {
        int valor = 4;
        tabuada(valor);
    }

    // Criando um método:
    public static void tabuada(int valor){
            for (int i = 10; i > 0; i--) {
                System.out.println("Valor da tabuada do " + valor + " na posição " + valor + "x" + i + " é " + (valor * i));
            }
    }
}
