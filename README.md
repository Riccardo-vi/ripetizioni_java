Teoria implicata nell'esecuzione della libreria di esercizi java


1. ANALISI E PROGETTAZIONE (METODO A PASSI)
--------------------------------------------------
Prima di scrivere codice, si parte dall'analisi della traccia per identificare:
- Le entità (classi): i "sostantivi" principali dello scenario (es. Iscritto, Prodotto, Volo, ecc.).
- Gli attributi: le caratteristiche dell'entità associandone i tipi corretti (String, int, double, boolean).
- I metodi: le azioni o i comportamenti che l'oggetto può compiere o subire.


2. L'INCAPSULAMENTO E LA VISIBILITÀ
--------------------------------------------------
- Attributi privati (private): proteggono lo stato interno dell'oggetto. Nessuna classe esterna può modificarli direttamente, garantendo la validità dei dati.
- Metodi pubblici (public): espongono l'interfaccia verso l'esterno (metodi di business, getter per leggere i dati e setter o metodi di modifica controllata).


3. COSTRUTTORI E LA KEYWORD "THIS"
--------------------------------------------------
- Il Costruttore: un metodo speciale che ha lo stesso nome della classe e serve a inizializzare lo stato dell'oggetto al momento della sua creazione (new).
- La keyword "this": serve a distinguere gli attributi della classe dai parametri passati ai metodi o al costruttore quando hanno lo stesso nome (es. this.nome = nome;).


4. L'EREDITARIETÀ (EXTENDS E SUPER)
--------------------------------------------------
Applicata per collegare classi con relazioni di tipo "è un/a":
- Superclasse (Classe Padre): raggruppa attributi e metodi comuni a più entità (es. Articolo, Animale, MembroStaff, Veicolo).
- Sottoclasse (Classe Figlia): estende la classe padre tramite la parola chiave "extends", ereditandone le caratteristiche e aggiungendone di specifiche.
- Gerarchie a più livelli: una classe può figliare da un'altra classe a sua volta derivata (es. Chirurgo estende Medico che estende MembroStaff).
- La keyword "super": serve nel costruttore della classe figlia per richiamare il costruttore del padre, oppure per invocare i metodi ereditati.
- L'Override (@Override): permette a una sottoclasse di ridefinire o espandere un metodo ereditato dalla classe superiore.


5. CLASSI ASTRATTE E POLIMORFISMO
--------------------------------------------------
- Classi Astratte (abstract class): modelli generali che non possono essere istanziati direttamente con "new" (es. Veicolo o Attivita).
- Metodi Astratti (abstract): metodi dichiarati nella classe padre senza un corpo, che obbligano tutte le sottoclassi a implementarne una versione propria.
- Polimorfismo: la capacità di trattare oggetti di classi diverse attraverso un riferimento comune (ad esempio una List<Veicolo> o List<Attivita>). Permette di eseguire operazioni complesse scorrendo la collezione con un unico ciclo, senza dover distinguere il tipo specifico tramite if o controlli manuali.


6. INTERFACCE E CONFRONTO (COMPARABLE)
--------------------------------------------------
- L'interfaccia Comparable<T>: utilizzata per definire un ordinamento naturale tra gli oggetti (implementando il metodo compareTo), consentendo l'uso di metodi di utilità come Collections.sort().