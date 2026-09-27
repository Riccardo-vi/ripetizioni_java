package esercizi.es8;

public class QuizTempo extends Attivita {
    private int numeroDomande;
    private double punteggioMinimo;

    public QuizTempo(String titolo, String autore, int durataStimataMinuti, int numeroDomande, double punteggioMinimo) {
        super(titolo, autore, durataStimataMinuti);
        this.numeroDomande = numeroDomande;
        this.punteggioMinimo = punteggioMinimo;
    }

    public int getNumeroDomande() { return numeroDomande; }
    public double getPunteggioMinimo() { return punteggioMinimo; }
}
