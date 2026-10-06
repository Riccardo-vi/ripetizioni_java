package src.esercizi.es4;

public class Smartphone extends Articolo {
    private int memoriaGB;
    private String sistemaOperativo;

    // Costruttore: usa 'super' per passare i dati al padre e inizializza i propri
    public Smartphone(String codice, String nome, double prezzoListino, int memoriaGB, String sistemaOperativo) {
        super(codice, nome, prezzoListino);
        this.memoriaGB = memoriaGB;
        this.sistemaOperativo = sistemaOperativo;
    }

    // Scheda descrittiva specifica per Smartphone
    public String getSchedaDescrittiva() {
        return "=== SCHEDA SMARTPHONE ===\n" +
               "Codice: " + getCodice() + "\n" +
               "Nome: " + getNome() + "\n" +
               "Prezzo Listino: " + getPrezzoListino() + " €\n" +
               "Memoria: " + this.memoriaGB + " GB\n" +
               "Sistema Operativo: " + this.sistemaOperativo;
    }
}
