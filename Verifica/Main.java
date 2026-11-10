package Verifica;
    import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {

            // --- Creazione personaggi (overloading costruttori) ---
            Guerriero thor  = new Guerriero("Thor", 25, 10);
            Guerriero ragnar = new Guerriero("Ragnar", 20, 8, 3);
            Mago    gandalf = new Mago("Gandalf", 15, 60);

            // --- toString() e polimorfismo (upcasting) ---
            // TODO 1: dichiara un ArrayList<Personaggio> di nome "gruppo"
            //         e aggiungi i tre personaggi creati sopra.

            ArrayList<Personaggio> gruppo = new ArrayList<Personaggio>();
            gruppo.add(thor);
            gruppo.add(ragnar);
            gruppo.add(gandalf);


            System.out.println("=== Gruppo (" + gruppo.size() + " membri) ===");
            for (Personaggio p : gruppo)
                System.out.println(p);   // chiama toString() polimorfico

            // --- Overriding riceviDanno (armatura Guerriero) ---
            System.out.println("\n=== Combattimento ===");
            gandalf.attacca(thor);       // danno attutito dall'armatura
            System.out.println("Dopo attacco di Gandalf: " + thor);

            // --- Mago: lanciaIncantesimo, mana ed eccezioni ---
            // TODO 2: lanciaIncantesimo() può lanciare ManaInsufficienteException.
            //         Racchiudi le quattro chiamate seguenti in un blocco try/catch:
            //         nel catch stampa il messaggio dell'eccezione con getMessage().
            try {
                gandalf.lanciaIncantesimo(ragnar);
                gandalf.lanciaIncantesimo(ragnar);
                gandalf.lanciaIncantesimo(ragnar);
                gandalf.lanciaIncantesimo(ragnar); // dovrebbe fallire per mana
                gandalf.meditazione();
                System.out.println("Gandalf dopo meditazione: " + gandalf);
            }
            catch(Exception e) {
            }
            // --- super() esplicito: livelloSu e urlaDiGuerra ---
            thor.livelloSu();
            thor.urlaDiguerra();
            System.out.println("Thor dopo level-up: " + thor);

            // --- isVivo ---
            System.out.println("\n=== Stato finale ===");
            for (Personaggio p : gruppo)
                System.out.println(p.nome + " vivo: " + p.isVivo());
        }
    }

