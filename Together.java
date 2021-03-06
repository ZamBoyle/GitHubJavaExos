import util.*;
//utiliser import util.* est un raccourcis pour éviter de devoir taper tous les imports suivants:
//import util.Identity;
//import util.UserInput;
//import util.Maths;
//import util.Menu;

public class Together {

	public static void main(String[] args) {

		String playerName = Identity.GetName();
		int playerAge = Identity.GetAge();
		System.out.println("Bonjour " + playerName + " ! Wow ! " + playerAge + " ans ! Tu n'es plus tout jeune !\n");
		String continueCalc = "oui";

		while (continueCalc.equals("oui")) {// Tant que continueCalc est égal à "oui" on exécute le bloc d'instructions
											// comprises entre les deux accolades
			Menu.AfficheMenu();
			int choix = UserInput.AskInt("Quel est ton choix ?");
			while (choix < 1 || choix > 5) {// Tant qu'on entre un mauvais choix, on redemande le choix à l'utilisateur
				choix = UserInput.AskInt("Quel est ton choix ?");
			}

			// Définir une variable number1 de type float dont la valeur sera égal au
			// résultat de Input.askFloat et dont le texte affiché à l'utilisateur sera
			// "Entrez un nombre:"

			float number1 = UserInput.AskFloat("Entrez un nombre:");

			if (choix == 5) {
				// Inspirez-vous du choix == 1 pour faire cette partie
				System.out.println(number1 + "² = " + Maths.square(number1));

			} else {
				// Définir une variable number2 de type float dont la valeur sera égal au
				// résultat de Input.askFloat et dont le texte affiché à l'utilisateur sera
				// "Entrez un second nombre"

				float number2 = UserInput.AskFloat("Entrez un second nombre :");

				if (choix == 1) { // Addition
					System.out.println(number1 + " + " + number2 + " = " + Maths.add(number1, number2));
				} else if (choix == 2) { // Soustraction
					System.out.println(number1 + " - " + number2 + " = " + Maths.substract(number1, number2));
				}
				if (choix == 3) { // Multiplication
					System.out.println(number1 + " * " + number2 + " = " + Maths.multiply(number1, number2));
				} else if (choix == 4) { // Division

					while (number2 == 0) {
						System.out.println("Erreur : division par 0 impossible");
						number2 = UserInput.AskFloat("Entrez un second nombre :");
					}
					System.out.println(number1 + " / " + number2 + " = " + Maths.divide(number1, number2));

					// Attention si number2 vaut 0 ! Soit vous affichez un message indiquant qu'on
					// ne peut pas diviser par zéro et le menu des opérations s'affiche. Soit si
					// vous êtes motivés et vous jouez avec un while.
				}
			}
			// La réponse est importante. Elle déterminera si le while continue grâce à la
			// valeur de continueCalc

			continueCalc = UserInput.AskStr("On continue de calculer ?");
		}
		UserInput.scanner.close();
	}
}