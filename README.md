# michelin-transfo-port-adapter

## Port-Adapter (hexagonal)

*Port* (SPI) : contrat du domain définissant le comportement des services externes (repo, bus de message)   
*Adapter* : implémente le comportement définit par le domaine par une couche technique.

Séparation de la logique du domaine de la logique technique.

Ici deux artéfacts séparées : 
- backend : glue technique, ayant toutes les dépendances techniques (Srping, Postgres, Kafka). Le backend dépend du domaine et se conforme aux contracts du domaine.
- domain : pur artefact java, sans dépendance technique.

## Event Driven

Le domaine ne consomme que des commandes/requête (query). 
Le traîtement d'une commande produit un/des évènements 
