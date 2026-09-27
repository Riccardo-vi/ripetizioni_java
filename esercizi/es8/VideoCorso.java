package esercizi.es8;

public class VideoCorso extends Attivita {
    private int numeroLezioni;
    private boolean includeSottotitoli;

    public VideoCorso(String titolo, String autore, int durataStimataMinuti, int numeroLezioni, boolean includeSottotitoli) {
        super(titolo, autore, durataStimataMinuti);
        this.numeroLezioni = numeroLezioni;
        this.includeSottotitoli = includeSottotitoli;
    }

    public int getNumeroLezioni() { return numeroLezioni; }
    public boolean isIncludeSottotitoli() { return includeSottotitoli; }
}