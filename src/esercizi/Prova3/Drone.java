package ripetizioni_java.Prova3;

public class Drone extends VeicoloAereo {
    private String marca;
    private double autonomia;
    private double altezzaMaxSorvolo;

    public Drone(double velocitaMassima, double altezzaMassimaStrutturale, String marca) {
        super(velocitaMassima, altezzaMassimaStrutturale);
        this.marca = marca;
    }

    public void attivaModalitaScatto() {
        System.out.println("Modalità scatto fotografico attivata per il drone " + marca);
    }

    public double getAutonomia() {
        return this.autonomia;
    }

    public void setAutonomia(double autonomia) {
        if (autonomia <= 0) {
            throw new IllegalArgumentException("L'autonomia deve essere maggiore di 0.");
        }
        this.autonomia = autonomia;
    }

    public void setAltezzaMaxSorvolo(double altezza) {
        if (altezza <= 0) {
            throw new IllegalArgumentException("L'altezza massima di sorvolo deve essere maggiore di 0.");
        }
        this.altezzaMaxSorvolo = altezza;
    }

    @Override
    public void accelerare(double incremento) {
        this.velocitaAttuale += incremento;
        if (this.velocitaAttuale > this.velocitaMassima) this.velocitaAttuale = this.velocitaMassima;
    }

    @Override
    public void decelerare(double decremento) {
        this.velocitaAttuale -= decremento;
        if (this.velocitaAttuale < 0) this.velocitaAttuale = 0;
    }
}