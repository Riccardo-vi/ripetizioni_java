pkg esercizi.Prova4;

public class Server extends DispositivoFisso {
    private String nomeHost;
    private int numeroProcessori;
    private String indirizzoIP;

    public Server(double prezzoBase, int consumoEnergetico, String nomeHost, int numeroProcessori, String indirizzoIP) {
        super(prezzoBase, consumoEnergetico);
        this.nomeHost = nomeHost;
        this.setNumeroProcessori(numeroProcessori);
        this.indirizzoIP = indirizzoIP;
    }

    public void riavviaServizi() {
        System.out.println("Riavvio dei servizi del server in corso...");
    }

    public void setNumeroProcessori(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("Il numero di processori deve essere maggiore di 0.");
        }
        this.numeroProcessori = num;
    }

    // Il metodo setPrezzoBase è già presente ed ereditato dalla classe Dispositivo.
    // Viene eseguito l'override per rispettare la consegna specifica del Server,
    // richiamando la logica e l'eccezione centralizzata nella superclasse.
    @Override
    public void setPrezzoBase(double prezzo) {
        super.setPrezzoBase(prezzo);
    }
}