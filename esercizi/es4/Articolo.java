package esercizi.es4;


public class Articolo {
    // Attributi comuni a tutti gli articoli
    private String codice;
    private String nome;
    private double prezzoListino;

    // Costruttore della superclasse
    public Articolo(String codice, String nome, double prezzoListino) {
        this.codice = codice;
        this.nome = nome;
        this.prezzoListino = prezzoListino;
    }

    // Metodo per calcolare il prezzo scontato (ereditato da tutti i prodotti)
    public double calcolaPrezzoScontato(double percentualeSconto) {
        if (percentualeSconto < 0 || percentualeSconto > 100) {
            return this.prezzoListino;
        }
        return this.prezzoListino - (this.prezzoListino * percentualeSconto / 100.0);
    }

    // Getter 
    public String getCodice() { return codice; }
    public String getNome() { return nome; }
    public double getPrezzoListino() { return prezzoListino; }
}
