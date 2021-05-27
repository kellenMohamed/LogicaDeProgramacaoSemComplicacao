package br.com.ChronosAcademy.LogicaProgramacao;

    /*
    Verificar o tempo, se está: nevando, ensolarado ou chovendo.

     */

public class Tempo {
    public static void main(String[] args) {
        String tempo = "nevando";

        switch (tempo){
            case "ensolarado":
                System.out.println("Ir para a praia!");
                break;
            case "chovendo":
                System.out.println("Fique em casa!");
                break;
            case "Nevando":
                System.out.println("Boa sorte");
                break;
        }

    }
}
