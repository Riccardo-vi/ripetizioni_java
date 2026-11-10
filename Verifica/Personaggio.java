package Verifica;

public class Personaggio {
    protected String nome;
    protected int puntiVita;
    protected int livello;
    protected int attacco;

    public Personaggio(String nome, int attacco){
        this.nome = nome;
        this.puntiVita = 100;
        this.livello = 1;
        this.attacco = attacco;
    }
    public Personaggio(String nome, int attacco, int livello){
        this.nome = nome;
        this.puntiVita = 100;
        this.livello = livello;
        this.attacco = attacco;
    }
    public void attacca(Personaggio bersaglio){
        bersaglio.puntiVita--;                  // non tiene conto dell'attacco del personaggio correzione: bersaglio.riceviDanno(this.attacco); peccato
    }
    public void riceviDanno(int danno) {
        puntiVita = puntiVita - danno;
        if ((puntiVita - danno) < 0 ){          //fai la stessa cosa due volte, correzione: if (puntiVita < 0) { puntiVita = 0; }
          System.out.println("Non è valido");
        } 
        System.out.println("Il valore è valido");
    }
    public boolean isVivo(){ // corretto
    
        if(this.puntiVita > 0){
            return true;
        }
    return false;
    }

    public void livelloSu(){ // corretto
        this.livello++;
        System.out.println("Sei salito di livello!");
    }
    @Override
    public String toString(){ // corretto
            return "Il nome è: " + nome +"Il livello è: " + livello + "I puntiVita sono: " + puntiVita;
        }
    }

