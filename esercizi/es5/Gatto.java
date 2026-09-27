package esercizi.es5;

public class Gatto extends Animale {
    private boolean solitoGraffiare;

    // Costruttore
    public Gatto(String nome, int eta, String dataArrivo, boolean solitoGraffiare) {
        super(nome, eta, dataArrivo);
        this.solitoGraffiare = solitoGraffiare;
    }

    // Messaggio di presentazione specifico per il gatto
    public String getMessaggioPresentazione() {
        
        return "=== PRESENTAZIONE GATTO ===\n" +
               "Nome: " + getNome() + "\n" +
               "Età: " + getEta() + " anni\n" +
               "Data arrivo: " + getDataArrivo() + "\n" +
               "Solito graffiare: " + (this.solitoGraffiare ? "Sì" : "No");
    }
}