import java.util.Random;

public class Robo {
    Random jogar = new Random();

    public Jogadas jogadasRobo() {
        int numero = jogar.nextInt(3) + 1;
        return Jogadas.definirJogada(numero);
    }

}
