package ripetizioni_java.Prova3;

public class Nave extends VeicoloMarino {
    private String nome;
    private int capacitaPasseggeri;
    private double stazza;

    public Nave(double velocitaMassima, double capacitaGalleggiamento, String nome) {
        super(velocitaMassima, capacitaGalleggiamento);
        this.nome = nome;
    }

    public void attivaSOS() {
        System.out.println("MAYDAY MAYDAY! Segnale SOS attivato dalla nave " + nome);
    }

    public int getCapacitaPasseggeri() {
        return capacitaPasseggeri;
    }

    public void setCapacitaPasseggeri(int capacita) {
        if (capacita <= 0) {
            throw new IllegalArgumentException("La capacità passeggeri deve essere maggiore di 0.");
        }
        this.capacitaPasseggeri = capacita;
    }

    public void setStazza(double stazza) {
        if (stazza <= 0) {
            throw new IllegalArgumentException("La stazza deve essere maggiore di 0.");
        }
        this.stazza = stazza;
    }

    @Override
    public void accelerare(double incremento) {
        this.velocitaAttuale += incremento;
        if (this.velocitaAttuale > this.velocitaMassima) this.velocitaAttuale = this.velocitaMassima;
    }

    @Override
    public void decelerare(double decremento) {
        this.velocitaAttuale -= decremento;
        if (this.velocitaAttuale < 0) this.velocitaAttuale = 0;
    }
}