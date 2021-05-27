package br.com.ChronosAcademy.LogicaProgramacao;

    /*
      Verificar o tipo do triângulo.
      E para existir um triângulo é necessário que a soma de dois lados quaisquer seja maior que o outro,
      isto é para os três lados.
     */

public class Triangulo {
    public static void main(String[] args) {
        int ladoA = 5;
        int ladoB = 5;
        int ladoC = 5;

        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoC && ladoB + ladoC > ladoA) {
            System.out.println("Esta figura é um triângulo!!!");
            if (ladoA == ladoB && ladoA == ladoC) {
                System.out.println("Este triângulo é equilátero: ");
            } else if (ladoA != ladoB && ladoA != ladoC && ladoB != ladoC) {
                System.out.println("Este triângulo é escaleno!!!");
            } else if ((ladoA == ladoB && ladoA != ladoC) ||
                    (ladoA == ladoC && ladoA != ladoB) ||
                    (ladoB == ladoC && ladoB != ladoA)) {
                System.out.println("Este triângulo é isósceles!!!");
            } else {
                System.out.println("Esta figura não é um triângulo !!!");
            }

        }
    }
}
