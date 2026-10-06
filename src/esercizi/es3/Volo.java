package src.esercizi.es3;

public class Volo {
    private String codiceVolo;
    private String destinazione;
    private String orarioDecollo;
    private int ritardoTotaleMinuti; // Tiene traccia del ritardo accumulato

    // Costruttore
    public Volo(String codiceVolo, String destinazione, String orarioDecollo) {
        this.codiceVolo = codiceVolo;
        this.destinazione = destinazione;
        this.orarioDecollo = orarioDecollo;
        this.ritardoTotaleMinuti = 0; // Parte senza ritardo
    }

    // Metodo per accumulare ulteriori minuti di ritardo nel corso della giornata
    public void aggiungiRitardo(int minuti) {
        if (minuti > 0) {
            this.ritardoTotaleMinuti += minuti;
        }
    }

    // Restituisce il ritardo totale attuale
    public int getRitardoTotale() {
        return this.ritardoTotaleMinuti;
    }

    // Getter di supporto
    public String getCodiceVolo() { return codiceVolo; }
    public String getDestinazione() { return destinazione; }
    public String getOrarioDecollo() { return orarioDecollo; }
}
