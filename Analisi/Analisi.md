<hr>

# Analisi

Questa parte del progetto si occupa della gestione dell'inventario dei museo, permette di avere un catalogo completo di tutte le opere presenti all'interno di un museo, filtrabili per molteplici attributi, quali:
- Anno di creazione
- Autore
- Tecnica di pittura
- Corrente
- Nationalita' autore
- Posizione nel museo

<br>
<br>
<hr>


# Database
```mermaid
erDiagram
    Opera {
        int idOpera PK
        varchar(100) name
        date year
        int Author FK
        TEXT Description
        TEXT Material
        TEXT Room 
        double Height
        double Width 
        text linkImmagine
        int idMuseo FK
        TEXT Tags
        String corrente
        }

    Autore ||--|{ Opera:create

    Autore {
        int ID PK
        varchar(100) Name
        year bornDate
        year deathDate
        varchar(100) bornPlace
        varchar(100) deathPlace
        String corrente
        }
    
    Museo {
        int idMuseo PK
        varchar(100) nome
    }
   
   Opera }|--|| Museo:contiene

    
    Autore }|--|{ Corrente: autore_corrente
    Opera }| -- |{ Tag: OPERE_TAG


    Tag{
    int id_tag PK
    varchar name
    }

    Corrente{
    int id_corrente PK
    VARCHAR(100) Name
    TEXT Description
    TEXT period
    String author 
    }

    Stanza {
    int id_Stanza PK
    String corrente
    }

    Stanza || -- |{ Opera :Contiene
    Stanza || -- || Corrente: Associa
    Opera }| -- || Corrente: Appartiene
```





