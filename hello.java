class HelloWorld {
    public static void main(String[] args) {
        if (args.length > 0) {
            switch (args[0]) {
                case "hello":
                    helloWorld();
                    System.out.println("<script>alert('Hello');document.title='Hello from JS';</script>");
                    break;

                case "bonjour":
                    bonjour(args[1]);
                    break;

                case "add":
                    if (args.length == 3) {
                        int p1 = Integer.parseInt(args[1].trim());
                        int p2 = Integer.parseInt(args[2].trim());
                        int somme = add(p1, p2);
                        // System.out.println(p1 + "+" + p2 + "=" + somme);
                        System.out.println(somme);
                    } else {
                        System.err.println("Il manque des parametres pour effectuer l'addition");
                    }
                    break;
                case "tablemultiplication":
                    if (args.length == 3) {
                        int table = Integer.parseInt(args[1].trim());
                        int max = Integer.parseInt(args[2].trim());
                        tableMultiplication(table, max);
                    } else {
                        System.err.println("Il manque des parametres pour effectuer la table de multiplication");
                    }
                    break;
                case "salutation":
                    if (args.length >= 2 && args[1].trim() != "") {
                        String who = args[1].trim();
                        salutation(who);
                    } else {
                        System.err.println("Il manque un paramètre pour saluer la personne.");
                    }
                    break;
                case "help":
                    help();
                    break;
                case "david":
                    if(args.length==2){
                        david(args[1]);
                    }
                    else{
                        System.err.println("La fonction david requière au moins 1 argument");
                    }
                    break;
                default:
                    help();
                    break;
            }
        } else {
            help();
        }
    }

    public static void helloWorld() {
        System.out.println("Hello, World!");
    }

    public static void david(String what){
        System.out.println("David est "+what+".");
    }

    public static void salutation(String who) {
        System.out.println("Hello " + who + " !");
    }

    public static void bonjour(String prenom) {
        System.out.println("<p>Bonjour " + prenom + " !</p>");
    }

    public static int add(int p1, int p2) {
        return p1 + p2;
    }

    public static void tableMultiplication(int table, int max) {
        System.out.println("<h1>Table de Multiplication de " + table + " jusqu'a " + max + "</h2>");
        for (int i = 0; i <= max; i += table) {
            System.out.println(i + "<br/>");
        }
    }

    public static void help() {
        System.out.println("<h1>AIDE DU PROGRAMME</h1>");
        System.out.println("<ul>");
        System.out.println("<li>hello() = affiche Hello World.</li>");
        System.out.println("<li>add(p1, p2) = affiche la somme de p1+p2</li>");
        System.out.println("<li>help() = affiche l'aide du programme</li>");
        System.out.println("<li>salutation(p1) = Salut p1</li>");
        System.out.println("<li>tableMultiplication (table, max) = table de multiplication de p1 jusqu'a p2.</li>");
        System.out.println("</ul>");
    }
}
