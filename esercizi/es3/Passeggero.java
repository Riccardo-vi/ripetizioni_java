package esercizi.es3;

public class Passeggero {
    private String nome;
    private String cognome;
    private String postoAssegnato;

    // Costruttore
    public Passeggero(String nome, String cognome, String postoAssegnato) {
        this.nome = nome;
        this.cognome = cognome;
        this.postoAssegnato = postoAssegnato;
    }

    // Cambia il posto assegnato in caso di richiesta
    public void cambiaPosto(String nuovoPosto) {
        this.postoAssegnato = nuovoPosto;
    }

    // Verifica se un determinato posto coincide con quello del passeggero
    public boolean verificaPosto(String postoDaVerificare) {
        return this.postoAssegnato.equalsIgnoreCase(postoDaVerificare);
    }

    // Getter di supporto
    public String getNome() { return nome; }
    public String getCognome() { return cognome; }
    public String getPostoAssegnato() { return postoAssegnato; }
}