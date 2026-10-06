package src.esercizi.es8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainPiattaforma {
    public static void main(String[] args) {
        // Creazione del catalogo unificato tramite polimorfismo
        List<Attivita> catalogo = new ArrayList<>();

        VideoCorso vc1 = new VideoCorso("Corso Java Base", "Mario Rossi", 180, 12, true);
        QuizTempo q1 = new QuizTempo("Quiz di Programmazione ad Oggetti", "Luigi Bianchi", 30, 15, 18.0);
        VideoCorso vc2 = new VideoCorso("Corso Avanzato di Algoritmi", "Anna Verdi", 240, 20, false);

        // Aggiungiamo voti alle attività
        vc1.registraVoto(9.5);
        vc1.registraVoto(8.5);

        q1.registraVoto(7.0);
        q1.registraVoto(8.0);
        q1.registraVoto(9.0); // Media = 8.0

        vc2.registraVoto(10.0); // Media = 10.0

        catalogo.add(vc1);
        catalogo.add(q1);
        catalogo.add(vc2);

        // 1. Ricerca dell'attività con la valutazione media più alta (indipendentemente dal tipo)
        Attivita migliore = catalogo.get(0);
        for (Attivita a : catalogo) {
            if (a.getValutazioneMedia() > migliore.getValutazioneMedia()) {
                migliore = a;
            }
        }
        System.out.println("=== ATTIVITÀ CON LA VALUTAZIONE MEDIA PIÙ ALTA ===");
        System.out.println("Titolo: " + migliore.getTitolo() + " | Media: " + migliore.getValutazioneMedia());

        // 2. Ordinamento del catalogo per durata (dalla più breve alla più lunga) grazie a Comparable
        Collections.sort(catalogo);

        System.out.println("\n=== CATALOGO ORDINATO PER DURATA (CRESCENTE) ===");
        for (Attivita a : catalogo) {
            System.out.println("- " + a.getTitolo() + " (" + a.getDurataStimataMinuti() + " minuti)");
        }
    }
}
