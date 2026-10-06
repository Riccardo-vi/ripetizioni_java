package esercizi.Prova1;

public class Libro extends MaterialeBiblioteca {
    private String autore;
    private int numeroPagine;

    public Libro(String titolo, String codice, int annoPubblicazione, String autore, int numeroPagine) {
        super(titolo, codice, annoPubblicazione);
        this.autore = autore;
        this.numeroPagine = numeroPagine;
    }

    //getter e setter
    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Autore: " + this.autore);
        System.out.println("Numero di pagine: " + this.numeroPagine);
    }
    
}
