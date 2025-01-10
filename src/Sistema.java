public class Sistema {
    Jogador jogador = new Jogador();
    Robo robo = new Robo();

    public void iniciarJogo() {
        Jogadas jogadasRobo = robo.jogadasRobo();
        Jogadas jogadasJogador = jogador.jogadasJogador();

        System.out.println("Você escolheu: " + jogadasJogador);
        System.out.println("Robo escolheu: " + jogadasRobo);

        if (jogadasJogador == jogadasRobo) {
            System.out.println("EMPATE!");
        } else if ((jogadasJogador == Jogadas.PEDRA && jogadasRobo == Jogadas.TESOURA) ||
                (jogadasJogador == Jogadas.PAPEL && jogadasRobo == Jogadas.PEDRA) ||
                (jogadasJogador == Jogadas.TESOURA && jogadasRobo == Jogadas.PAPEL)){
            System.out.println("Você venceu!");
        } else {
            System.out.println("Robô venceu!");
        }
    }


}
