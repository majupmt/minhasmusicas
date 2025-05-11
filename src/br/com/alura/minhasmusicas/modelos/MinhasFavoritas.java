package br.com.alura.minhasmusicas.modelos;

import java.util.ArrayList;
import java.util.List;

public class MinhasFavoritas {

    private List<Audio> lista = new ArrayList<>();

    public void inclui(Audio audio) {
        lista.add(audio); // Agora só adiciona à lista, sem imprimir nada
    }

    public void mostrarFavoritas() {
        System.out.println("📌 Lista de favoritos:");
        for (Audio audio : lista) {
            int estrelas = audio.getClassificacao();
            StringBuilder avaliacao = new StringBuilder();
            for (int i = 0; i < estrelas; i++) {
                avaliacao.append("★");
            }
            System.out.println(audio.getTitulo() + " - " + estrelas + "/10 " + avaliacao);
        }
    }
}
