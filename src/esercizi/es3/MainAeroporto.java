package src.esercizi.es3;

public class MainAeroporto {
    public static void main(String[] args) {
        System.out.println("=== TEST VOLI IN PARTENZA ===");
        Volo volo1 = new Volo("AZ-402", "Parigi Charles de Gaulle", "14:30");
        
        System.out.println("Volo: " + volo1.getCodiceVolo() + " -> Destinazione: " + volo1.getDestinazione());
        System.out.println("Orario previsto: " + volo1.getOrarioDecollo());
        
        
        volo1.aggiungiRitardo(20); 
        volo1.aggiungiRitardo(15); 
        System.out.println("Ritardo totale accumulato: " + volo1.getRitardoTotale() + " minuti.");

        System.out.println("\n=== TEST PASSEGGERI PER L'IMBARCO ===");
        Passeggero pass1 = new Passeggero("Luca", "Neri", "14B");
        
        System.out.println("Passeggero: " + pass1.getNome() + " " + pass1.getCognome());
        System.out.println("Posto assegnato iniziale: " + pass1.getPostoAssegnato());

      
        System.out.println("Il posto coincide con '14B'? " + pass1.verificaPosto("14B"));

      
        pass1.cambiaPosto("22A");
        System.out.println("Posto aggiornato con successo! Nuovo posto: " + pass1.getPostoAssegnato());
        System.out.println("Il posto coincide ancora con '14B'? " + pass1.verificaPosto("14B"));
    }
}