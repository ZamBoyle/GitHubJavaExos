import util.Identity;
import util.UserInput;
import util.Maths;
import util.Menu;

public class Together {

	public static void main(String[] args) {

		String playerName = Identity.GetName();
		int playerAge = Identity.GetAge();
		System.out.println("Bonjour " + playerName + " ! Wow, "+playerAge +" ans tu n'es plus tout jeune !\n");
		String continueCalc = "oui";

		while (continueCalc.equals("oui")) {//Tant que continueCalc est égal à "oui" on exécute le bloc d'instructions comprises entre les deux accolades
			Menu.AfficheMenu();
			int choix = UserInput.AskInt("Quel est ton choix ?");
			while (choix < 1 || choix > 5) {//Tant qu'on entre un mauvais choix, on redemande le choix à l'utilisateur
				choix = UserInput.AskInt("Quel est ton choix ?");
			}

			// Définir une variable number1 de type float dont la valeur sera à égal au résultat de Input.askFloat et le
			// texte "Entrez un nombre:"
			// Exemple: float numberToEat = Input.AskFloat("Donne-moi un nombre à manger:");
			if (choix == 5) {
				// Inspirez-vous du choix == 1 pour faire cette partie
			} else {
				// Définir une variable number2 de type float qui utilisera Input.askFloat et le
				// texte "Entrez un second nombre"

				if (choix == 1) {
					System.out.println(number1 + " + " + number2 + " = " + Maths.add(number1, number2));
				}
				if (choix == 2) {
					// Inspirez-vous du choix == 1 pour faire cette partie
				}
				if (choix == 3) {
					// Inspirez-vous du choix == 1 pour faire cette partie
				}
				if (choix == 4) {
					// Inspirez-vous du choix == 1 pour faire cette partie
					// Attention si number2 vaut 0 !
				}
			}
			continueCalc = UserInput.AskStr("On continue de calculer ?");//La réponse est importante. Elle déterminera si le while continue grâce à la valeur de continueCalc
		}
	}
}