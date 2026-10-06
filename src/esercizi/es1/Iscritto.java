package src.esercizi.es1;

public class Iscritto {
    // 1. Attributi privati (Incapsulamento)
    private String nome;
    private String cognome;
    private String idCorso;
    private int mesiResidui;

    // 2. Costruttore
    public Iscritto(String nome, String cognome, String idCorso, int mesiResidui) {
        this.nome = nome;
        this.cognome = cognome;
        this.idCorso = idCorso;
        this.mesiResidui = mesiResidui;
    }

    // 3. Metodo per rinnovare l'abbonamento (+1 mese)
    public void rinnova() {
        this.mesiResidui++;
    }

    // 4. Metodo per cambiare corso
    public void cambiaCorso(String nuovoIdCorso) {
        this.idCorso = nuovoIdCorso;
    }

    // 5. Metodo per verificare se l'abbonamento è attivo
    public boolean isAttivo() {
        return this.mesiResidui > 0;
    }

    // Getter e Setter di supporto
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public String getIdCorso() { return idCorso; }
    public int getMesiResidui() { return mesiResidui; }
}