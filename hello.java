class HelloWorld {
    public static void main(String[] args) {
        if (args.length > 0) {
            switch (args[0]) {
                case "hello":
                    helloWorld();
                    break;

                case "add":
                    if (args.length == 3) {
                        int p1 = Integer.parseInt(args[1]);
                        int p2 = Integer.parseInt(args[2]);
                        int somme = add(p1, p2);
                        System.out.println(p1 + "+" + p2 + "=" + somme);
                    } else {
                        System.out.println("Il manque des paramètres pour effectuer l'addition");
                    }
                    break;
                case "help":
                    help();
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

    public static int add(int p1, int p2) {
        return p1 + p2;
    }

    public static void help() {
        System.out.println("AIDE DU PROGRAMME<br>");
        System.out.println("<ul>");
        System.out.println("<li>- hello() = affiche Hello World.</li>");
        System.out.println("<li>- add(p1, p2) = affiche la somme de p1+p2</li>");
        System.out.println("<li>- help() = affiche l'aide du programme</li>");
        System.out.println("</ul>");

    }
}
