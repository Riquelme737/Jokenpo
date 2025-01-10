import java.util.Scanner;

public class Jogador {
    Scanner scanner = new Scanner(System.in);

    public Jogadas jogadasJogador() {
        System.out.println("Escolha: PEDRA(1), PAPEL (2), TESOURA(3) ");
        int suaJogada = scanner.nextByte();
        return Jogadas.definirJogada(suaJogada);
    }

}
