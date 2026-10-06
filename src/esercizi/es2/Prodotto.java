package src.esercizi.es2;


public class Prodotto {
    // 1. Attributi privati (Incapsulamento)
    private String codice;
    private String descrizione;
    private double prezzoListino;
    private int quantitaDisponibile;

    // 2. Costruttore
    public Prodotto(String codice, String descrizione, double prezzoListino, int quantitaDisponibile) {
        this.codice = codice;
        this.descrizione = descrizione;
        this.prezzoListino = prezzoListino;
        this.quantitaDisponibile = quantitaDisponibile;
    }

    // 3. Calcola il prezzo scontato in percentuale (senza modificare il listino originale)
    public double calcolaPrezzoScontato(double percentualeSconto) {
        if (percentualeSconto < 0 || percentualeSconto > 100) {
            System.out.println("Errore: Percentuale non valida.");
            return this.prezzoListino;
        }
        return this.prezzoListino - (this.prezzoListino * percentualeSconto / 100.0);
    }

    // 4. Registra una vendita riducendo la quantità (se ce ne sono abbastanza)
    public boolean registraVendita(int quantitaVenduta) {
        if (quantitaVenduta > 0 && quantitaVenduta <= this.quantitaDisponibile) {
            this.quantitaDisponibile -= quantitaVenduta;
            return true;
        }
        return false;
    }

    // 5. Verifica se il prodotto è esaurito
    public boolean isEsaurito() {
        return this.quantitaDisponibile == 0;
    }

    // Getter di supporto
    public String getCodice() { return codice; }
    public String getDescrizione() { return descrizione; }
    public double getPrezzoListino() { return prezzoListino; }
    public int getQuantitaDisponibile() { return quantitaDisponibile; }
}