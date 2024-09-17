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
- Tag Semantici

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
        string Name
        date Anno_di_creazione
        int idAutore FK
        string Descrizione
        string Materiale
        string Posizione
        int idMuseo FK
        string[] Tag_Semantici
        }
    Autore ||--|{ Opera:create
    Autore {
        int ID PK
        String Nome
        String Cognome
        Date Data_di_Nascita
        Date Data_di_Morte
        string Luogo_di_Nascita
        string Luogo_di_Morte
        string Corrente
        }
    
    Museo {
        int idMuseo PK
        string nome
    }
   
   Opera }|--|| Museo:contiene  
```





