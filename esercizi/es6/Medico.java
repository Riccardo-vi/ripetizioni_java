package esercizi.es6;

public class Medico extends MembroStaff {
    private String specializzazione;
    private String alboProfessionale;

    public Medico(String nome, String cognome, int anniEsperienza, String idAmbulatorio, 
                  String specializzazione, String alboProfessionale) {
        super(nome, cognome, anniEsperienza, idAmbulatorio);
        this.specializzazione = specializzazione;
        this.alboProfessionale = alboProfessionale;
    }

    @Override
    public String getProfiloProfessionale() {
        // Chiama il metodo del padre e aggiunge i dati specifici del medico
        return super.getProfiloProfessionale() + "\n" +
               "Specializzazione: " + specializzazione + "\n" +
               "Albo Professionale: " + alboProfessionale;
    }

    public String getSpecializzazione() { return specializzazione; }
    public String getAlboProfessionale() { return alboProfessionale; }
}