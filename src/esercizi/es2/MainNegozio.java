package src.esercizi.es2;

public class MainNegozio {
    public static void main(String[] args) {
        
        Prodotto p1 = new Prodotto("P-100", "Tastiera Meccanica Gaming", 79.99, 4);

        System.out.println("--- PRODOTTO CREATO ---");
        System.out.println("Articolo: " + p1.getDescrizione() + " (Cod: " + p1.getCodice() + ")");
        System.out.println("Prezzo di listino: " + p1.getPrezzoListino() + " €");
        System.out.println("Disponibili in magazzino: " + p1.getQuantitaDisponibile());

        System.out.println("\n--- TEST SCONTO ---");
        double prezzoScontato = p1.calcolaPrezzoScontato(15);
        System.out.println("Prezzo con sconto 15%: " + prezzoScontato + " €");
        System.out.println("Il listino originale è rimasto invariato? " + p1.getPrezzoListino() + " € (Sì!)");

        
        System.out.println("\n--- TEST VENDITA ---");
        boolean venditaRiuscita = p1.registraVendita(2);
        System.out.println("Vendita di 2 pezzi riuscita? " + venditaRiuscita);
        System.out.println("Pezzi rimasti: " + p1.getQuantitaDisponibile());
        System.out.println("Il prodotto è esaurito? " + p1.isEsaurito());

       
        boolean venditaEccessiva = p1.registraVendita(10);
        System.out.println("\nTentativo di vendere 10 pezzi riuscito? " + venditaEccessiva);

        // Svuotiamo il magazzino comprando gli ultimi 2 pezzi
        p1.registraVendita(2);
        System.out.println("Acquistati gli ultimi pezzi. Il prodotto è esaurito ora? " + p1.isEsaurito());
    }
}