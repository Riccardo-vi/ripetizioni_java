import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import esercizi.Prova2.LimiteAssenzeSuperatoException;

public class RegistroStudente {
    private String nomeStudente;
    private double sommaVoti;
    private int numeroVoti;
    private int assenze;

    public RegistroStudente(String nomeStudente) {
        this.nomeStudente = nomeStudente;
        this.sommaVoti = 0;
        this.numeroVoti = 0;
        this.assenze = 0;
    }

    public void aggiungiAssenza() {
        assenze++;
    }

    public void aggiungiVoto(double voto) {
        if (voto < 1 || voto > 10) {
            throw new IllegalArgumentException("Voto non valido! Deve essere compreso tra 1 e 10.");
        }
        sommaVoti += voto;
        numeroVoti++;
    }

    public double calcolaMedia() {
        if (numeroVoti == 0) {
            throw new IllegalStateException("Non ci sono voti inseriti. Impossibile calcolare la media.");
        }
        return sommaVoti / numeroVoti;
    }

    public void salvaPagella(String nomeFile) throws LimiteAssenzeSuperatoException, IOException {
        if (assenze > 10) {
            throw new LimiteAssenzeSuperatoException(assenze);
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeFile))) {
            writer.println("Nome dello studente: " + nomeStudente);
            writer.println("Assenze: " + assenze);
            writer.println("Media voti: " + calcolaMedia());
        }
    }
}