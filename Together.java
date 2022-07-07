import util.Identity;
import util.Input;
import util.Maths;
import util.Menu;

public class Together {

	public static void main(String[] args) {

		String playerName = Identity.GetName();
		System.out.println("Bonjour " + playerName + " !\n");
		String continueCalc = "oui";

		while (continueCalc.equals("oui")) {
			Menu.AfficheMenu();
			int choix = Input.AskInt("Quel est ton choix ?");
			while (choix < 1 || choix > 5) {
				choix = Input.AskInt("Quel est ton choix ?");
			}

			// Définir une variable number1 de type float qui utilisera Input.askFloat et le
			// texte "Entrez un nombre:"
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

			continueCalc = Input.AskStr("On continue de calculer ?");
		}
	}
}