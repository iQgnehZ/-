package eu.telecomsudparis.csc4102.wang_yuw_zheng_qi;

import eu.telecomsudparis.csc4102.util.Console;
import eu.telecomsudparis.csc4102.util.OperationImpossible;

/**
 * Menu d'utilisation de l'application.
 */
public class SqueletteInterfaceTextuelle {

	/**
	 * Reference sur l'instance.
	 */
	private static SqueletteFacade facade = null;

	/**
	 * Fonction main.
	 */
	public static void main(final String[] args) {
		facade = new SqueletteFacade();
		try {

			int choix;
			while ((choix = menu()) > 0) {
				switch (choix) {
				case 1:
					casUtilisation1();
					break;
				case 2:
					casUtilisation2();
					break;
				case 3:
					casUtilisation3();
					break;
				case 4:
					casUtilisation4();
					break;
				case 5:
					casUtilisation5();
					break;
				case 6:
					casUtilisation6();
					break;
				default:
					break;
				}
			}
		} catch (OperationImpossible op) {
			System.out.println("Erreur Menu : " + op);
		}
	}

	/**
	 * Affichage d'un menu.
	 * 
	 * @return code du menu (0 ==> quit)
	 */
	static int menu() {
		System.out.println("\n" + ": Menu");
		System.out.println("  1- cas utilisation 1");
		System.out.println("  2- cas utilisation 2");
		System.out.println("  3- cas utilisation 3");
		System.out.println("  4- cas utilisation 4");
		System.out.println("  5- cas utilisation 5");
		System.out.println("  6- cas utilisation 6");
		System.out.println("  0- quitter");
		int choix = 0;
		try {
			choix = Console.readInt("\nEntrer le choix :");
			switch (choix) {
			case 0:
				System.exit(0);
				break;
			case 1:
				casUtilisation1();
				break;
			case 2:
				casUtilisation1();
				break;
			case 3:
				casUtilisation1();
				break;
			case 4:
				casUtilisation1();
				break;
			case 5:
				casUtilisation1();
				break;
			case 6:
				casUtilisation1();
				break;
			default:
				System.out.println("Choix non fourni");
			}
		} catch (Exception e) {
			System.err.println("Erreur de saisie");
		}
		return choix;
	}

	private static void casUtilisation1() throws OperationImpossible {
		// saisie des données en entrée
		facade.casUtilisation1();
	}

	private static void casUtilisation2() throws OperationImpossible {
		// saisie des données en entrée
		facade.casUtilisation2();
	}

	private static void casUtilisation3() throws OperationImpossible {
		// saisie des données en entrée
		facade.casUtilisation3();
	}

	private static void casUtilisation4() throws OperationImpossible {
		// saisie des données en entrée
		facade.casUtilisation4();
	}

	private static void casUtilisation5() throws OperationImpossible {
		// saisie des données en entrée
		facade.casUtilisation5();
	}

	private static void casUtilisation6() throws OperationImpossible {
		// saisie des données en entrée
		facade.casUtilisation6();
	}
}
