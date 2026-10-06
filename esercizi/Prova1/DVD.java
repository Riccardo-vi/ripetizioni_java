package esercizi.Prova1;

public class DVD extends MaterialeBiblioteca {
    private String regista;
    private int durata;

    public DVD(String titolo, String codice, int annoPubblicazione, String regista, int durata) {
        super(titolo, codice, annoPubblicazione);
        this.regista = regista;
        this.durata = durata;
    }

    //getter e setter
    public String getRegista() {
        return regista;
    }

    public void setRegista(String regista) {
        this.regista = regista;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Regista: " + this.regista);
        System.out.println("Durata: " + this.durata + " minuti");
    }
    
}
