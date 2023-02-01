#@author: ATSIN David
--------------------------------------------------------------------------------------------------------

Lien Github: 

----------TP3: DM noté: REALISATION D'UNE APPLICATION WEB AVEC SPRING BOOT------------


Nous avons généré notre projet maven et avons ajouté les dépendances suivantes:
Web, JPA, Hibernate, H2, DevTools, Thymeleaf.

- Web:  permet de développer des applications web en utilisant des technologies telles que le protocole HTTP, 
les pages HTML et les contrôleurs REST. Cette dépendance inclut les bibliothèques nécessaires pour créer des
 applications web avec Spring Boot et facilite la gestion des dépendances grâce à Maven.

- JPA: fournit un cadre pour mapper les objets Java aux tables de bases de données relationnelles, 
ce qui permet de gérer les opérations CRUD (Create, Read, Update, Delete) sur les données de manière transparente.

- Hibernate: implémente la spécification JPA (Java Persistence API) pour mapper les objets Java aux tables de bases de données relationnelles, 
ce qui permet de gérer les opérations CRUD (Create, Read, Update, Delete) sur les données de manière transparente. 
Hibernate fournit également des fonctionnalités supplémentaires telles que la gestion des sessions, 
la gestion des transactions et l'optimisation des requêtes en base de données

- H2:  bibliothèque de base de données relationnelle en mémoire pour Java. Elle peut être utilisée pour le développement et 
les tests dans un projet Spring Boot en raison de sa rapidité et de sa facilité d'utilisation

- DevTools: inclut un certain nombre d'outils et de fonctionnalités qui peuvent accélérer et simplifier le développement d'applications. 
Par exemple, elle permet de redémarrer automatiquement l'application lorsqu'un fichier source est modifié, 
ce qui peut économiser beaucoup de temps 

- Thymeleaf : permet de générer du HTML en utilisant des modèles et des données provenant du serveur,
 ce qui facilite la séparation du code HTML et du code Java.

-------------------------------------------------------------------------------------------------------------

Etape 13:

1- L'URL d'appel "/greeting" est paramétrée avec l'annotation "@GetMapping("/greeting")" qui se trouve sur la méthode "greeting". 
Cette annotation définit une correspondance entre une requête HTTP GET et la méthode "greeting"

2- Le fichier HTML à afficher est choisi avec la ligne de code "return "greeting";". 
Cette ligne de code retourne le nom de la vue "greeting". 

3-  Le nom à qui nous disons bonjour est envoyé en tant que paramètre dans l'URL lorsque le second lien est cliqué

-------------------------------------------------------------------------------------------------------------

Etape 17:

Après avoir ajouté notre première classe et relancé notre application, on constate que la table Address a été créé et
est présente sur notre console. Ceci est possible grâce à la dépendance Hibernate de spring qui permet d'associer les
classes à des tables d'une base de données relationnelle et de gerer la persistance des données.

------------------------------------------------------------------------------------------------------------

Etape 20

Lorsque l'on fait un select sur la table adress, on peut bien voir le contenu du data.sql

------------------------------------------------------------------------------------------------------------

Etape 22

L'annotation "@Autowired" utilisée dans le code précédent permet d'effectuer une injection de dépendance automatique à
partir de la classe AddressRepository

-------------------------------------------------------------------------------------------------------------

Etape 30

Pour rajouter boostsrap, nous  telechargeons les fichiers boostrap (sur le site de boostrap) et on les ajoute dans les fichiers static de notre projet.
Ensuite nous ajoutons cela dans le head de notre template html  
   <link rel="stylesheet" th:href="/@{/bootstrap.min.css}">
    <script th:src="/@{/jquery-3.5.1.min.js}"></script>
    <script th:src="/@{/bootstrap.min.js}"></script>


----------TP4: DM noté: UTILISATION D'API WEB AVEC SPRING BOOT------------

Etape 6 

1-Oui, pour appeler l'API de MétéoConcept, nous avons besoin d'une clé API valide.

2-L'url de base pour l'appeler est :  https://api.meteo-concept.com/api/

3-GET: pour récupérer des données à partir de l'API

4-Dans l'URL: Les paramètres peuvent être inclus dans l'URL de la requête en tant que paramètres de query string. Par exemple, pour une requête GET, l'URL est: "https://api.meteoconcept.com/data?api_key=YOUR_API_KEY&location=Paris".

5-La réponse est un objet contenant une clé nommée city associée à une collection d'objet de type city.

L'API retournera les données météorologiques en format JSON ou XML, l'information se trouve dans l'objet forecast-map au niveau de l'attribut 'temp2m'

Pour afficher les previsions meteo à, il faut utiliser la requete suivante GET /forecast/daily/{day}/map cette requete aura pour reponse un fichier json ou xml avec 2 objets à l'interieur city et forecast. L'objet forecast contient toutes les données de previsions.











