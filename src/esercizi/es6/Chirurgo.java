package src.esercizi.es6;

public class Chirurgo extends Medico {
    private int numeroInterventi;
    private boolean abilitatoUrgenza;

    public Chirurgo(String nome, String cognome, int anniEsperienza, String idAmbulatorio, 
                    String specializzazione, String alboProfessionale, int numeroInterventi, 
                    boolean abilitatoUrgenza) {
        super(nome, cognome, anniEsperienza, idAmbulatorio, specializzazione, alboProfessionale);
        this.numeroInterventi = numeroInterventi;
        this.abilitatoUrgenza = abilitatoUrgenza;
    }

    @Override
    public String getProfiloProfessionale() {
        // Chiama il metodo del Medico (che a sua volta chiama MembroStaff) e aggiunge i dati del chirurgo
        return super.getProfiloProfessionale() + "\n" +
               "Numero interventi effettuati: " + numeroInterventi + "\n" +
               "Abilitato chirurgia d'urgenza: " + (abilitatoUrgenza ? "Sì" : "No");
    }

    public int getNumeroInterventi() { return numeroInterventi; }
    public boolean isAbilitatoUrgenza() { return abilitatoUrgenza; }
}
