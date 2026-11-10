package Verifica;

public class Guerriero extends Personaggio {
    protected int armatura;

    public Guerriero(String nome, int attacco, int armatura) {
        super(nome, attacco);
        this.armatura = armatura;
    }

    public Guerriero(String nome, int attacco, int armatura, int livello) {
        super(nome, attacco, livello);
        this.armatura = armatura;
    }
    /* Soluzione alternativa per riceviDanno() con calcolo del danno effettivo al netto dell'armatura:
    @Override
        public void riceviDanno(int danno) {
            // Calcola il danno effettivo al netto dell'armatura
            int dannoEffettivo = danno - armatura;
            
            // Evita che un danno negativo curi il personaggio
            if (dannoEffettivo < 0) {
                dannoEffettivo = 0;
            }

            super.riceviDanno(dannoEffettivo);
        }
    */ 
    @Override
    public void riceviDanno(int danno){ 
        armatura -= danno;   // qua fai il contrario, ovvero danno all'armatura            
        super.riceviDanno(danno-armatura);
    }
    public void urlaDiguerra(){ //corretto
        System.out.println("TU " + nome + livello + " AAAHHHHHHH");
    }
    @Override
    public String toString(){// corretto
        return "Valore armatura: " + armatura;
    }
}
