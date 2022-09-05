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
                        System.out.println("Il manque des paramètres");
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
        System.out.println("Veuillez fournir en paramètre une des fonctions suivantes:");
    }
}
