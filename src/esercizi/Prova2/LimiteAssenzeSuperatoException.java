public class LimiteAssenzeSuperatoException extends Exception {
    private int assenze;

    public LimiteAssenzeSuperatoException(int assenze) {
        if(assenze <= 10) {
            throw new IllegalArgumentException("Il numero di assenze deve essere maggiore di 10 per lanciare questa eccezione.");
        }
        super("Limite di assenze superato: " + assenze);
        this.assenze = assenze;
    }

    public int getAssenze() {
        return assenze;
    }

}