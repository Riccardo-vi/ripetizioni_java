package src.esercizi.Prova1;

public class MaterialeBiblioteca {
    private String titolo;
    private String codice;
    private int annoPubblicazione;
    private boolean prestato;

    public MaterialeBiblioteca(String titolo, String codice, int annoPubblicazione) {
        this.titolo = titolo;
        this.codice = codice;
        this.annoPubblicazione = annoPubblicazione;
        this.prestato = false;
    }
    //getter e setter
    public String getTitolo() {
        return titolo;
    }

    public String getCodice() {
        return codice;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public boolean isPrestato() {
        return prestato;
    }
    public void setPrestato(boolean prestato) {
        this.prestato = prestato;
    }
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }
    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }
    //metodi:

    public void prestato(){
        try {
            if (this.prestato) {
                throw new Exception("Il materiale " + this.titolo + " è già stato prestato.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
           this.prestato = true;
            System.out.println("Il materiale " + this.titolo + " è stato prestato.");  
    }
    public void restituito(){
        try {
            if (!this.prestato) {
                throw new Exception("Il materiale " + this.titolo + " non è stato prestato.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        this.prestato = false;
        System.out.println("Il materiale " + this.titolo + " è stato restituito.");
    }

    public void getInfo(){
        System.out.println("Titolo: " + this.titolo);
        System.out.println("Codice: " + this.codice);
        System.out.println("Anno di pubblicazione: " + this.annoPubblicazione);
        System.out.println("Prestato: " + (this.prestato ? "Sì" : "No"));
    }


}