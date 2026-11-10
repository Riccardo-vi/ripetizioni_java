package Verifica;

public class Mago extends Personaggio{
    protected int manaMassimo;
    protected int manaCorrente;

    public Mago(String nome, int attacco, int manaMassimo){ //brava 
        super(nome, attacco);
        this.manaMassimo = manaMassimo;
        this.manaCorrente = manaMassimo;
    }
    public void lanciaIncantesimo(Personaggio bersaglio) throws ManaInsufficienteException { 
        if(manaCorrente >= 20){
            bersaglio.puntiVita -= (attacco *2);
            manaCorrente -= 20;
        } // peccato manca l'else
        throw new ManaInsufficienteException("Il mana disponibile è" + manaCorrente);
    }
    public void meditazione(){ // corretto
        this.manaCorrente = this.manaMassimo;
        System.out.println("Attualmente manaCorrente corrisponde a manaMassimo");
    }
    @Override
    public String toString(){// corretto
       return "manaCorrente è: " + manaCorrente + "manaMassimo è: " + manaMassimo;
    }
}
