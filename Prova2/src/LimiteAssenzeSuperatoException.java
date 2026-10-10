public class LimiteAssenzeSuperatoException extends Exception {
    private int assenze;

    public LimiteAssenzeSuperatoException(int assenze) {
        super("Impossibile scrutinare lo studente: limite di 10 assenze superato. (Assenze attuali: " + assenze + ")");
        if(assenze <= 10 || assenze < 0) {
            throw new IllegalArgumentException("Il numero di assenze deve essere maggiore di 10 e non negativo per lanciare questa eccezione.");
        }

        this.assenze = assenze;
    }

    public int getAssenze() {
        return assenze;
    }

}