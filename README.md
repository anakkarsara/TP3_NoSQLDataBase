# TP3_NoSQLDataBase

  The project's main purpose is to understand the pros and cons of a NoSQL database, also to discover the different types of the NoSQL databases.
Here, we're going to develop an application that uses Morphia to map our Java objects into a document-oriented database like MongoDB.
Then, we will compare it with a key-value database like Redis.

## Lancer le projet :

Téléchargez le projet et importez le en tant que projet Maven dans un IDE.

```MongoDB``` : Lancez la classe ProgMongoDB dans le package fr.istic.miage.main.

```Redis``` : Lancez la classe ProgRedis dans le package fr.istic.miage.main.

## Questions
### Les limites d'une base de données orientée documents :
 - Le schéma des donnée n'est pas difinie ce qui influence la pertinence des données fournie par un élément.
 - Moins de conltrole sur les requêtes.
 
 ### Les types de données stockés dans Redis et les types de requêtes :
Redis est orienté (clé,valeur), donc on peut stocker des couples de valeurs dont la clé peut avoir plusieurs valeurs.
Ces valeurs peuvent être String, Hash, Sets ou Listes.
Types de requêtes :
 - ```GET``` : Consulter les valeur d'une clé,
 - ```SET``` : Ajouter une valeur,
 - ```DEL``` : supprimer une valeur.
