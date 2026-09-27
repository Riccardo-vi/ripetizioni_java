================================================================================
Teoria utilizzata
================================================================================
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



================================================================================
8 scenari a difficoltà crescente
================================================================================

Per ogni scenario:
1. individua le classi coinvolte, i loro attributi (con il tipo: String, int, double, boolean...) e i loro metodi (con tipo di ritorno e parametri), motivando le scelte più dubbie;
2. se lo scenario lo richiede, individua la gerarchia di ereditarietà e quale metodo dovrà essere ridefinito (override) da ciascuna sottoclasse;
3. disegna il diagramma UML completo (i tre riquadri nome/attributi/metodi), con le frecce di ereditarietà se presenti, indicando per ciascun attributo e metodo anche la visibilità — per esempio — nome: String oppure + isAttivo(): boolean;
4. implementa tutte le classi in Java: costruttore compreso, e con il corpo completo di ogni metodo individuato (non solo la firma).

--------------------------------------------------------------------------------
1. La palestra ★★[cite: 3]
--------------------------------------------------------------------------------
Una palestra vuole informatizzare la gestione dei propri iscritti e dei corsi che offre. Di ogni iscritto interessa conoscere il nome, il cognome, un identificativo del corso a cui è attualmente abbonato, e il numero di mesi ancora coperti dall'abbonamento attualmente pagato[cite: 3]. Ci si aspetta di poter registrare il rinnovo dell'abbonamento (che aggiunge un mese a quelli ancora coperti), e di poter verificare in ogni momento se l'iscrizione risulta ancora attiva (cioè se restano mesi coperti) oppure scaduta[cite: 3]. Si vuole anche poter registrare un cambio di corso, aggiornando l'identificativo memorizzato[cite: 3].


--------------------------------------------------------------------------------
2. Il negozio online ★★[cite: 2]
--------------------------------------------------------------------------------
Un negozio online vuole tenere traccia dei prodotti in vendita e della loro gestione commerciale[cite: 2]. Per ogni prodotto servono un codice identificativo, una descrizione, il prezzo di listino e la quantità attualmente disponibile a magazzino[cite: 2]. Deve essere possibile applicare uno sconto percentuale al prezzo di listino (che resta memorizzato invariato, mentre viene calcolato un nuovo prezzo scontato), registrare una vendita che riduce la quantità disponibile (ma solo se ce n'è abbastanza), e sapere in qualsiasi momento se il prodotto risulta esaurito[cite: 2].


--------------------------------------------------------------------------------
3. L'aeroporto (due entità indipendenti) ★★★[cite: 2]
--------------------------------------------------------------------------------
Un aeroporto deve gestire due aspetti separati della propria attività, che non hanno relazioni dirette tra loro[cite: 2]. Da un lato i voli in partenza, di cui interessano il codice del volo, la destinazione e l'orario previsto di decollo, con la possibilità di segnalare un ritardo indicando i minuti di ritardo accumulati (un volo può accumulare più segnalazioni di ritardo nel corso della giornata, e si vuole sapere in ogni momento il ritardo totale attuale)[cite: 2]. Dall'altro i passeggeri registrati per l'imbarco, di cui interessano nome, cognome e il numero del posto assegnato, con la necessità di poter cambiare il posto assegnato in caso di richiesta e di verificare se un determinato posto coincide con quello di un passeggero specifico[cite: 1, 2].


--------------------------------------------------------------------------------
4. Il negozio di elettronica (prima gerarchia) ★★★[cite: 1]
--------------------------------------------------------------------------------
Un negozio di elettronica vende articoli di vario tipo[cite: 1]. Di ogni articolo, indipendentemente dal tipo, si vogliono sempre conoscere un codice, il nome e il prezzo di listino, oltre a poter applicare uno sconto percentuale come nell'esercizio 2[cite: 1]. Tra gli articoli venduti ci sono gli smartphone, per i quali serve anche sapere la capacità di memoria in gigabyte e il sistema operativo installato; e i televisori, per i quali serve anche la dimensione dello schermo in pollici e se supporta o meno la risoluzione 4K[cite: 1]. Ogni articolo, quando viene esposto sul sito, deve mostrare una scheda descrittiva che riporta le sue caratteristiche — ma il contenuto di questa scheda è ovviamente diverso a seconda che si tratti di uno smartphone o di un televisore[cite: 1].


--------------------------------------------------------------------------------
5. Il canile ★★★[cite: 1]
--------------------------------------------------------------------------------
Un canile ospita animali di specie diverse in attesa di adozione[cite: 1]. Di ogni animale, a prescindere dalla specie, si conoscono il nome, l'età e la data di arrivo al canile[cite: 1]. I cani, in particolare, hanno anche una razza e un'indicazione se sono adatti alla convivenza con bambini; i gatti hanno invece un'indicazione se sono soliti graffiare oppure no[cite: 1]. Il canile vuole, per ogni animale, poter produrre un messaggio di presentazione da mostrare ai visitatori, che lo descriva in modo appropriato alla specie a cui appartiene, includendo le informazioni specifiche di quella specie oltre a quelle comuni a tutti gli animali[cite: 1].


--------------------------------------------------------------------------------
6. Lo studio associato (gerarchia a tre livelli) ★★★★[cite: 1]
--------------------------------------------------------------------------------
Uno studio associato di professionisti sanitari vuole organizzare l'anagrafe del proprio personale[cite: 1]. Di ogni componente dello staff, senza distinzione di ruolo, interessano nome, cognome, anni di esperienza lavorativa e un identificativo dell'ambulatorio a cui sono assegnati[cite: 1]. Tra il personale ci sono dei medici, di cui interessa anche la specializzazione e l'albo professionale di appartenenza; e tra i medici, in particolare, ci sono i chirurghi, dei quali si vuole registrare anche il numero di interventi effettuati finora e se sono abilitati alla chirurgia d'urgenza[cite: 1]. Ogni componente dello staff, quando gli viene chiesto un riepilogo del proprio profilo professionale, fornisce una descrizione che tiene conto di tutte le informazioni pertinenti al proprio ruolo specifico, comprese quelle ereditate dai livelli superiori della gerarchia[cite: 1].


--------------------------------------------------------------------------------
7. La compagnia di trasporti ★★★★[cite: 1]
--------------------------------------------------------------------------------
Una compagnia di trasporti gestisce una flotta eterogenea di veicoli per le consegne[cite: 1]. Di ogni veicolo, qualunque esso sia, interessano la targa, l'anno di immatricolazione e i chilometri totali percorsi finora[cite: 1]. Nella flotta ci sono furgoni, per i quali va registrata anche la portata massima in chilogrammi; e ci sono motocicli, per i quali interessa la cilindrata[cite: 1]. La compagnia vuole poter calcolare, per ogni singolo veicolo, un costo di manutenzione annuale stimato — che per i furgoni dipende dalla portata massima (più è alta, più costa mantenerlo), mentre per i motocicli dipende dalla cilindrata — e vuole inoltre poter ottenere, per l'intera flotta, il costo di manutenzione complessivo, sommando quello di ogni singolo veicolo indipendentemente dal tipo, senza dover distinguere caso per caso nel punto in cui questa somma viene calcolata[cite: 1].


--------------------------------------------------------------------------------
8. La piattaforma didattica ★★★★★[cite: 4]
--------------------------------------------------------------------------------
Una piattaforma didattica online organizza le attività proposte ai propri utenti in un unico catalogo[cite: 4]. Ogni attività, di qualunque tipo sia, ha un titolo, un autore e una durata stimata in minuti; e per ognuna deve essere possibile registrare un voto assegnato da chi l'ha completata, tenendo traccia di tutti i voti ricevuti nel tempo e potendo in ogni momento sapere qual è la valutazione media ottenuta e quante valutazioni sono state raccolte[cite: 4]. Tra le attività proposte ci sono i video-corsi, per i quali interessa anche il numero di lezioni in cui sono suddivisi e se includono sottotitoli; e i quiz a tempo, per i quali interessa il numero di domande previste e il punteggio minimo richiesto per superarlo[cite: 4].

La piattaforma vuole poter confrontare due attività qualsiasi del catalogo in base alla loro durata, per poterle in futuro ordinare dalla più breve alla più lunga, e vuole anche poter individuare, tra tutte le attività presenti, quella con la valutazione media più alta, qualunque sia il suo tipo specifico[cite: 4].

Qui il testo lascia più lavoro di interpretazione a te: leggilo con calma più di una volta prima di iniziare a disegnare[cite: 4]. Quanti attributi e metodi trovi legati alla gestione dei voti[cite: 4]? Il confronto per durata e la ricerca della valutazione media più alta richiedono un metodo pensato apposta, oppure si possono ottenere combinando metodi che hai già individuato altrove[cite: 4]?