package src.esercizi.es5;

public class Animale {
    private String nome;
    private int eta;
    private String dataArrivo;

    // Costruttore della classe padre
    public Animale(String nome, int eta, String dataArrivo) {
        this.nome = nome;
        this.eta = eta;
        this.dataArrivo = dataArrivo;
    }

    // Getter comuni a tutti gli animali
    public String getNome() { return nome; }
    public int getEta() { return eta; }
    public String getDataArrivo() { return dataArrivo; }
}
