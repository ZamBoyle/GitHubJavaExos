# Exercice  de groupe
Cet exercice a pour but de vous faire utiliser git en petits groupes.
L'objectif est de modifier chacun sa partie et de pousser vos modifications sur GitHub.

Structure du programme:
- Together.java contient le point de démarrage du programme: le main
- util.Identity: classe contenant deux méthodes statiques qui demandent le nom et l'age de l'utilisateur.
- util.Maths: classe contenant vos méthodes statiques de mathématique.
- util.Menu: classe contenant la méthode statique qui affiche le menu.
- util.UserInput: classe contenant des méthodes statiques pour demander à l'utilisateur d'enter des string, int, float.

Ce programme devra demander:
- l'identité de l'utilisateur et son age.
- Saluer l'utilisateur.
- Afficher un menu d'opérations arithémtiques: à mettre dans la classe util.Menu
- Un nombre s'il veut calculer un nombre au carré.
- Deux nombres s'il veut faire une des 4 opérations de base: +,-,*,/
- Si on continue de calculer.

Lors du choix de l'opération arithmétique, le programme affichera le résultat de l'opération choisie.

- Mettez-vous dans le répertoire "mesdépos" ou "mesrepos".
- Clônez le dépôt avec la commande gh suivante:
    ```bash
    gh repo clone https://github.com/zamboyle/GitHubJavaExos
    ```
- Vous avez donc maintenant un répertoire clôné nommé GitHubJavaExos

N'oubliez pas l'ordre des opérations avec GitHub:
- Recevez les modifications des autres avec la commande git pull.
- Modifiez votre code.
- Ajoutez le/les fichiers dans la zone d'index avec la commande git add
- Commitez vos modifications avec la commande git commit
- Poussez vos modifications sur GitHub avec la commande git push