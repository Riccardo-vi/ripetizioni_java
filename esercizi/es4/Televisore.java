package esercizi.es4;

public class Televisore extends Articolo {
    private int polliciSchermo;
    private boolean supporta4K;

    // Costruttore
    public Televisore(String codice, String nome, double prezzoListino, int polliciSchermo, boolean supporta4K) {
        super(codice, nome, prezzoListino);
        this.polliciSchermo = polliciSchermo;
        this.supporta4K = supporta4K;
    }

    // Scheda descrittiva specifica per Televisore
    public String getSchedaDescrittiva() {
        return "=== SCHEDA TELEVISORE ===\n" +
               "Codice: " + getCodice() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Prezzo Listino: " + getPrezzoListino() + " €\n" +
               "Schermo: " + this.polliciSchermo + " pollici\n" +
               "Supporto 4K: " + (this.supporta4K ? "Sì" : "No");
    }
}