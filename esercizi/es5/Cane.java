package esercizi.es5;

public class Cane extends Animale {
    private String razza;
    private boolean adattoBambini;

  
    public Cane(String nome, int eta, String dataArrivo, String razza, boolean adattoBambini) {
        super(nome, eta, dataArrivo);
        this.razza = razza;
        this.adattoBambini = adattoBambini;
    }

    // Messaggio di presentazione specifico per il cane
    public String getMessaggioPresentazione() {
        return "=== PRESENTAZIONE CANE ===\n" +
               "Nome: " + getNome() + "\n" +
               "Età: " + getEta() + " anni\n" +
               "Data arrivo: " + getDataArrivo() + "\n" +
               "Razza: " + this.razza + "\n" +
               "Adatto alla convivenza con bambini: " + (this.adattoBambini ? "Sì" : "No");
    }
}
