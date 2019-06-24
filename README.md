# DoctorWhoProject

**SPRING Démarrage**

Créer quelques routes à l'aide d'un contrôleur :

Crée un projet Spring, et transforme l'application en contrôleur.
Choisis 4 personnes qui ont incarné le personnage du Docteur (voir ici pour la liste complète).
Pour chacune des 4 incarnations que tu as choisies, crée une route /doctor/<numéro> qui retourne le nom correspondant au numéro.

**Par exemple :**

pour l'url /doctor/1 : la méthode retourne "William Hartnell".
pour l'url /doctor/10 : la méthode retourne "David Tennant".
pour l'url /doctor/13 : la méthode retourne "Jodie Whittaker".
la racine / renvoie une liste des urls pour lesquelles tu as fourni des mappings, sous forme de liens HTML -- pense aux balises <ul> et <li> pour contenir tes balises <a>.
Pousse le contenu de ton projet dans un dépôt GitHub et poste le lien de ton dépôt en guise de solution.

**Critères de validation**

Le contrôleur contient 5 routes.
Les 4 premières routes retournent le nom d'une incarnation mappé sur son numéro.
La racine retourne les liens vers les autres mappings.
