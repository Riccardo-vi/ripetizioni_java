package src.esercizi.Prova1;

public class Rivista extends MaterialeBiblioteca {
    private int numeroEdizione;
    private String mese;

    public Rivista(String titolo, String codice, int annoPubblicazione, int numeroEdizione, String mese) {
        super(titolo, codice, annoPubblicazione);
        this.numeroEdizione = numeroEdizione;
        this.mese = mese;
    }
    public int getNumeroEdizione() {
        return numeroEdizione;
    }
    public void setNumeroEdizione(int numeroEdizione) {
        this.numeroEdizione = numeroEdizione;
    }
    public String getMese() {
        return mese;
    }
    public void setMese(String mese) {
        this.mese = mese;
    }
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Numero di edizione: " + this.numeroEdizione);
        System.out.println("Mese: " + this.mese);   
    }    
}
