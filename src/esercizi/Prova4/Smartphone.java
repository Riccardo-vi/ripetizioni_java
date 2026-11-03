
pkg esercizi.Prova4;
public class Smartphone extends DispositivoMobile {
    private String modello;
    private String sistemaOperativo;
    private int memoriaGB;

    public Smartphone(double prezzoBase, int capacitaBatteria, String modello, String sistemaOperativo, int memoriaGB) {
        super(prezzoBase, capacitaBatteria);
        this.modello = modello;
        this.setSistemaOperativo(sistemaOperativo);
        this.setMemoriaGB(memoriaGB);
    }

    public void effettuaChiamata(String numero) {
        System.out.println("Tentativo di chiamata in corso al numero: " + numero);
    }

    public void setMemoriaGB(int memoriaGB) {
        if (memoriaGB <= 0) {
            throw new IllegalArgumentException("La memoria deve essere maggiore di 0.");
        }
        this.memoriaGB = memoriaGB;
    }

    public void setSistemaOperativo(String so) {
        if (so == null || so.trim().isEmpty()) {
            throw new IllegalArgumentException("Il sistema operativo non può essere vuoto o nullo.");
        }
        this.sistemaOperativo = so;
    }
}