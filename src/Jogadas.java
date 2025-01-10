public enum Jogadas {
    PEDRA (1),
    PAPEL (2),
    TESOURA (3);

    private int numero;

    Jogadas(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public static Jogadas definirJogada(int numero) {
        for (Jogadas jogadas : values()) {
            if (jogadas.getNumero() == numero) {
                return jogadas;
            }
        }
        throw new IllegalArgumentException("Número Inválido: " + numero);
    }
}
