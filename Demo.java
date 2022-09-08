public class Demo {
    public static void main(String[] args) {
        // On vérifie qu'on le tableau a bien reçu des paramètres: c'est à dire est-ce
        // que notre tableau à plus que zéro élément ?
        if (args.length > 0) {
            switch (args[0]) {
                // Est-ce que le premier paramètre, c'est à dire args[0] est la chaîne "help" ?
                case "help":
                    help();
                    break;
                
                // Est-ce que le premier paramètre est la chaîne "helloworld" ?
                case "helloworld":
                    helloWorld();
                    break;

                // Est-ce que le premier paramètre est la chaîne "hi" ?
                case "hi":
                    // Avons-nous au total 2 paramètres: un pour "hi" et un autre avec le prénom de la personne à saluer'.
                    if (args.length == 2) {                
                        hi(args[1]);
                    }
                    // Sinon on affiche un message d'erreur.
                    // L'utilisation de .err à la place de .out permet au serveur web de savoir qu'il y a une erreur à afficher.
                    else{
                        System.err.println("Vous devez fournir le prénom. Ni plus, ni moins.");
                    }
                    break;

                // Est-ce que le premier paramètre est la chaîne "add"
                case "add":
                    // Avons-nous au total 3 paramètres: un pour "add" et les deux autres les termes à additionner.
                    if (args.length == 3) {
                        int p1 = Integer.parseInt(args[1]);
                        int p2 = Integer.parseInt(args[2]);
                        System.out.println(add(p1, p2));
                    } 
                    // Sinon on affiche un message d'erreur.
                    // L'utilisation de .err à la place de .out permet au serveur web de savoir qu'il y a une erreur à afficher.
                    else {
                        System.err.println("Vous devez fournir les deux termes à additionner. Ni plus, ni moins.");
                    }
                    break;

                case "tablemultiplication":
                    // Avons-nous au total 3 paramètres: un pour "tablemultiplication" et les deux autres les termes à additionner.
                    if (args.length == 3) {
                        int p1 = Integer.parseInt(args[1]);
                        int p2 = Integer.parseInt(args[2]);
                        tableMultiplication(p1, p2);
                    } 
                    // Sinon on affiche un message d'erreur.
                    // L'utilisation de .err à la place de .out permet au serveur web de savoir qu'il y a une erreur à afficher.
                    else {
                        System.err.println("Vous devez fournir des deux paramètre: un pour la table de multiplication que vous souhaitez (ex: table de 3) et un autre paramètre pour savoir jusqu'où aller (ex 300). Ni plus, ni moins.");
                    }
                    break;
                
                //Cas où le premier paramètre n'est pas repris dans les différents "case".
                default:
                    System.err.println("La fonction "+args[0]+" n'est pas implémentée dans ce programme.");
                    break;
            }
        } else {
            // l'utilisation de .err à la place de .out permet au serveur web de savoir qu'il y a une erreur à afficher.
            System.err.println("Vous devez fournir au moins un paramètre, c'est à dire le nom d'une fonction !");
        }
    }

    //fonction qui retourne la somme de p1 et p2
    public static int add(int p1, int p2) {
        return p1 + p2;
    }

    //fonction qui affiche la table de multiplication p1 jusqu'à p2
    public static void tableMultiplication(int table, int max) {
        System.out.println("<h1>Table de Multiplication de " + table + " jusqu'a " + max + "</h2>");
        for (int i = 0; i <= max; i += table) {
            System.out.println(i + "<br/>");
        }
    }

    //fonction affiche "hello World !"
    public static void helloWorld() {
        System.out.println("Hello, World!");
    }

    //fonction qui salue p1
    public static void hi(String firstname) {
        System.out.println("Hello "+firstname+" !");
    }

    //fonction qui affiche l'aide du programme
    public static void help() {
        System.out.println("<h1>AIDE DU PROGRAMME</h1>");
        System.out.println("<h2>Fonctions mathématiques</h2>");
        System.out.println("<ul>");
        System.out.println("<li>add (p1, p2) = affiche la somme de p1+p2</li>");
        System.out.println("<li>minus (p1, p2) = affiche l'aide du programme</li>");
        System.out.println("<li>tableMultiplication (p1, p2) = table de multiplication de p1 jusqu'a p2.</li>");
        System.out.println("</ul>");
        System.out.println("<h2>Fonctions diverses</h2>");
        System.out.println("<ul>");
        System.out.println("<li>help () = affiche l'aide.</li>");
        System.out.println("<li>helloWorld () = affiche hello World !");
        System.out.println("</ul>");
    }
}