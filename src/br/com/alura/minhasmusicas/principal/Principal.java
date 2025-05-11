package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nomeUsuario = "Maria Júlia";

        System.out.println("🎵 Bem-vinda à sua conta, " + nomeUsuario + "!");
        System.out.println("O que você quer ouvir hoje?");
        System.out.println("1 - Ver favoritos");
        System.out.println("2 - Ouvir música");
        System.out.println("3 - Ouvir podcast");

        int opcao = leitura.nextInt();

        // Músicas
        Musica musica1 = new Musica();
        musica1.setTitulo("Right here");
        musica1.setArtista("Justin Bieber");

        Musica musica2 = new Musica();
        musica2.setTitulo("Need me");
        musica2.setArtista("Rihanna");

        Musica musica3 = new Musica();
        musica3.setTitulo("Horas Iguais");
        musica3.setArtista("Wiu - Oruam");

        Musica musica4 = new Musica();
        musica4.setTitulo("Doo Wop (That Thing)");
        musica4.setArtista("Ms. Lauryn Hill");

        // Podcasts
        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Afetos");
        podcast1.setApresentador("Gabidepretas");

        Podcast podcast2 = new Podcast();
        podcast2.setTitulo("Parentalidades");
        podcast2.setApresentador("Especialistas em Educação");

        Podcast podcast3 = new Podcast();
        podcast3.setTitulo("Mamilos");
        podcast3.setApresentador("Cris Bartis | Ju Wallauer");

        Podcast podcast4 = new Podcast();
        podcast4.setTitulo("Tricô de pais");
        podcast4.setApresentador("Thiago Queiroz");

        // Favoritas
        MinhasFavoritas favoritas = new MinhasFavoritas();
        favoritas.inclui(musica1);
        favoritas.inclui(musica3);
        favoritas.inclui(podcast1);
        favoritas.inclui(podcast3);

        switch (opcao) {
            case 1:
                System.out.println("\n⭐ Seus favoritos:");
                favoritas.mostrarFavoritas();
                break;

            case 2:
                System.out.println("\n🎶 Qual música deseja ouvir?");
                System.out.println("1 - " + musica1.getTitulo() + " | " + musica1.getArtista());
                System.out.println("2 - " + musica2.getTitulo() + " | " + musica2.getArtista());
                System.out.println("3 - " + musica3.getTitulo() + " | " + musica3.getArtista());
                System.out.println("4 - " + musica4.getTitulo() + " | " + musica4.getArtista());
                int escolhaMusica = leitura.nextInt();
                Musica musicaEscolhida = switch (escolhaMusica) {
                    case 1 -> musica1;
                    case 2 -> musica2;
                    case 3 -> musica3;
                    case 4 -> musica4;
                    default -> null;
                };
                if (musicaEscolhida != null) {
                    System.out.println("Tocando: " + musicaEscolhida.getTitulo());
                    for (int i = 0; i < 1000; i++) {
                        musicaEscolhida.reproduz();
                    }
                } else {
                    System.out.println("Opção inválida.");
                }
                break;

            case 3:
                System.out.println("\n🎧 Qual podcast deseja ouvir?");
                System.out.println("1 - " + podcast1.getTitulo());
                System.out.println("2 - " + podcast2.getTitulo());
                System.out.println("3 - " + podcast3.getTitulo());
                System.out.println("4 - " + podcast4.getTitulo());
                int escolhaPodcast = leitura.nextInt();
                Podcast podcastEscolhido = switch (escolhaPodcast) {
                    case 1 -> podcast1;
                    case 2 -> podcast2;
                    case 3 -> podcast3;
                    case 4 -> podcast4;
                    default -> null;
                };
                if (podcastEscolhido != null) {
                    System.out.println("Reproduzindo: " + podcastEscolhido.getTitulo());
                    for (int i = 0; i < 5000; i++) {
                        podcastEscolhido.reproduz();
                    }
                    for (int i = 0; i < 1000; i++) {
                        podcastEscolhido.curte();
                    }
                } else {
                    System.out.println("Opção inválida.");
                }
                break;

            default:
                System.out.println("Opção inválida");
        }

        leitura.close();
    }
}