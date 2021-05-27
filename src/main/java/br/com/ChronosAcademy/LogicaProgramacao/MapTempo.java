package br.com.ChronosAcademy.LogicaProgramacao;

import java.util.LinkedHashMap;

public class MapTempo {
    public static void main(String[] args) {
        String tempo = "ensolarado";
        LinkedHashMap<String, String> mapTempo = new LinkedHashMap<String, String>();
        mapTempo.put("ensolado", "ir pra praia");
        mapTempo.put("chovendo", "Fique em casa!");
        mapTempo.put("Nevando", "Boa sorte");

        //map é a ordem que inseriu o valor, senão usar o map fica ordem aleatória.
        //HashMap especifica que tipo de dados vai trabalhar e ele busca a classe tempo criada no pacote.
    }
}
