package esercizi.es8;

// Implementiamo Comparable per poter confrontare e ordinare le attività in base alla durata
public abstract class Attivita implements Comparable<Attivita> {
    private String titolo;
    private String autore;
    private int durataStimataMinuti;
    
    // Attributi per la gestione dei voti
    private double sommaVoti;
    private int numeroValutazioni;

    public Attivita(String titolo, String autore, int durataStimataMinuti) {
        this.titolo = titolo;
        this.autore = autore;
        this.durataStimataMinuti = durataStimataMinuti;
        this.sommaVoti = 0.0;
        this.numeroValutazioni = 0;
    }

    // Registra un nuovo voto assegnato da un utente
    public void registraVoto(double voto) {
        if (voto >= 0) {
            this.sommaVoti += voto;
            this.numeroValutazioni++;
        }
    }

    // Restituisce la valutazione media ottenuta
    public double getValutazioneMedia() {
        if (this.numeroValutazioni == 0) {
            return 0.0;
        }
        return this.sommaVoti / this.numeroValutazioni;
    }

    // Confronto per durata (richiesto per ordinare dalla più breve alla più lunga)
    @Override
    public int compareTo(Attivita altra) {
        return Integer.compare(this.durataStimataMinuti, altra.durataStimataMinuti);
    }

    // Getter comuni
    public String getTitolo() { return titolo; }
    public String getAutore() { return autore; }
    public int getDurataStimataMinuti() { return durataStimataMinuti; }
    public int getNumeroValutazioni() { return numeroValutazioni; }
}