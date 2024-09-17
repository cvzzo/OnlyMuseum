<hr>

# Analisi

Questa parte del progetto si occupa della gestione dell'inventario dei museo, permette di avere un catalogo completo di tutte le opere presenti all'interno di un museo, filtrabili per molteplici attributi, quali:
- Anno di creazione
- Autore
- Tecnica di pittura
- Corrente
- Nationalita' autore
- Posizione nel museo
- Se in prestito

<br>
<br>
<hr>

# Classi
Ogni opera avra' i seguenti attributi:
- Titolo
- Anno di creazione
- Autore
- Descrizione
- Materiale/Tecnica
- Posizione all'interno del museo
- Museo di appartenenza
- Altezza
- Larghezza
- Tag

Ogni Autore avra' i seguenti attributi:
- Nome Cognome
- Data di nascita
- Luogo di nascita
- Data di morte
- Luogo di morte
- Nazionalita'
- Corrente

Museo classe singleton:
- Lista posizioni

<hr>

# Database
```mermaid
erDiagram
    Opera {
        int idOpera PK
        varchar(100) Name
        date Anno_di_creazione
        int idAutore FK
        varchar(100) Descrizione
        varchar(100) Materiale
        varchar(100) Posizione
        double Altezza
        double Larghezza
        double AltezzaImmagine
        double LarghezzaImmagine
        text linkImmagine
        int idMuseo FK
        }
    Autore ||--|{ Opera:create
    Autore {
        int ID PK
        varchar(100) Nome
        varchar(100) Cognome
        Date Data_di_Nascita
        Date Data_di_Morte
        varchar(100) Luogo_di_Nascita
        varchar(100) Luogo_di_Morte
        varchar(100) Corrente
        }
    
    Museo {
        int idMuseo PK
        varchar(100) nome
    }
   
   Opera }|--|| Museo:contiene

    
    TagMap{
        int ID PK
        int idOpera FK
        int idTag FK
    }

    TagMap || -- |{ Tag: associa

    TagMap || -- |{ Opera: associa


    Tag{
    int idTag PK
    varchar name
    }

    
```





