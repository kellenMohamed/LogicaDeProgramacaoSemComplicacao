package br.com.ChronosAcademy.LogicaProgramacao;

public class Media {
    /*
        Calcular a média dos alunos:
        MEDIA = (P1 + 2P2) / 3
    */
    public static void main(String[] args) {
        float p1 = 5;
        float p2 = 8;
        float media = (p1 + 2 * p2)/3;

        if (media>=5){
            System.out.println("Aluno aprovado");
        }else{
            System.out.println("Aluno Reprovado");
        }
    }
}
