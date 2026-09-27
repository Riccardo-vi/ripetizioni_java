package esercizi.es7;

import java.util.ArrayList;
import java.util.List;

public class MainTrasporti {
    public static void main(String[] args) {
        // Creiamo una flotta eterogenea sfruttando il polimorfismo (lista di tipo Veicolo)
        List<Veicolo> flotta = new ArrayList<>();
        
        flotta.add(new Furgone("AB123CD", 2021, 50000, 1200)); // Furgone con portata 1200kg
        flotta.add(new Motociclo("EF456GH", 2023, 8000, 600));   // Moto cilindrata 600
        flotta.add(new Furgone("ZZ999YY", 2019, 110000, 2500)); // Furgone con portata 2500kg

        
        double costoTotaleFlotta = 0;
        
        System.out.println("=== DETTAGLIO FLOTTA ===");
        for (Veicolo v : flotta) {
            double costoSingolo = v.getCostoManutenzione();
            costoTotaleFlotta += costoSingolo;
            
            System.out.println("Veicolo targa: " + v.getTarga() + " | Costo manutenzione: " + costoSingolo + " €");
        }

        System.out.println("\n-----------------------------------");
        System.out.println("Costo di manutenzione COMPLESSIVO della flotta: " + costoTotaleFlotta + " €");
    }
}
