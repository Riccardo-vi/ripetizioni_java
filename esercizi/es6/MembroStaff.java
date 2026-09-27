package esercizi.es6;

public class MembroStaff {
    private String nome;
    private String cognome;
    private int anniEsperienza;
    private String idAmbulatorio;

    public MembroStaff(String nome, String cognome, int anniEsperienza, String idAmbulatorio) {
        this.nome = nome;
        this.cognome = cognome;
        this.anniEsperienza = anniEsperienza;
        this.idAmbulatorio = idAmbulatorio;
    }

    public String getProfiloProfessionale() {
        return "--- PROFILO PROFESSIONALE ---\n" +
               "Nome: " + nome + " " + cognome + "\n" +
               "Anni di esperienza: " + anniEsperienza + "\n" +
               "Ambulatorio assegnato: " + idAmbulatorio;
    }

    // Getter di supporto
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public int getAnniEsperienza() { return anniEsperienza; }
    public String getIdAmbulatorio() { return idAmbulatorio; }
}
