package eu.telecomsudparis.csc4102.wang_yuw_zheng_qi;

import java.time.Instant;
import java.time.LocalDate;

import eu.telecomsudparis.csc4102.util.Datutil;

public class ExempleManipulationsDatesInstants {

	public static void main(String[] args) {
		manipulationsDates();
		manipulationsInstants();
	}

	private static void manipulationsDates() {
		LocalDate hier = Datutil.ajouterJoursADate(Datutil.dateDuTest(), -1);
		LocalDate aujourdhui = Datutil.aujourdhui();
		LocalDate demain = Datutil.ajouterJoursADate(aujourdhui, 1);
		System.out.println("hier / aujourd'hui / demain                = "
				+ Datutil.dateToString(hier) + " / "
				+ Datutil.dateToString(aujourdhui) + " / "
				+ Datutil.dateToString(demain));
		System.out.println("hier avant date du test                    = "
				+ Datutil.dateEstAvantAujourdhui(hier));
		System.out.println("hier avant ou même jour que date du test   = "
				+ Datutil.dateEstAvantOuAujourdhui(hier));
		System.out.println("aujourd'hui même jour que date du test     = "
				+ Datutil.dateEstAujourdhui(aujourdhui));
		System.out.println("demain apres date du test                  = "
				+ Datutil.dateEstApresAujourdhui(demain));
		System.out.println("demain apres ou même que jour date du test = "
				+ Datutil.dateEstApresOuAujourdhui(demain));
		System.out.println("aujourd'hui + 1 même jour que demain       = "
				+ Datutil.memeJour(aujourdhui,
						Datutil.ajouterJoursADate(hier, 1)));
		System.out.println("aujourd'hui - 1 même jour qu'hier          = "
				+ Datutil.memeJour(aujourdhui,
						Datutil.ajouterJoursADate(demain, -1)));
		System.out.println("ajout d'un jour à la date du test");
		Datutil.ajouterJoursALaDateDuTest(1);
		System.out.println("nouvelle date du test                      = "
				+ Datutil.dateDuTest());
		System.out.println("hier avant date du test                    = "
				+ Datutil.dateEstAvantAujourdhui(hier));
		System.out.println("aujourd'hui avant date du test             = "
				+ Datutil.dateEstAvant(aujourdhui, Datutil.dateDuTest()));
		System.out.println("demain meme date que date du test          = "
				+ Datutil.memeJour(Datutil.dateDuTest(), demain));
	}

	private static void manipulationsInstants() {
		Instant maintenant = Datutil.instantDuTest();
		System.out.println("maintenant / instant du test = "
				+ Datutil.instantToString(maintenant) + " / "
				+ Datutil.instantToString(Datutil.instantDuTest()));
		Instant hiermemeheure = Datutil.ajouterJoursAInstant(maintenant, -1);
		Instant demainmemeheure = Datutil.ajouterJoursAInstant(maintenant, 1);
		System.out.println(
				"hier même heure / instant du test / demain même heure = "
						+ Datutil.instantToString(hiermemeheure) + " / "
						+ Datutil.instantToString(maintenant) + " / "
						+ Datutil.instantToString(demainmemeheure));

		System.out.println(
				"hier avant instant du test                           = "
						+ Datutil.instantEstAvant(hiermemeheure, maintenant));
		System.out.println(
				"maintenant même instant que instant du test          = "
						+ Datutil.memeInstant(maintenant,
								Datutil.instantDuTest()));
		System.out.println(
				"demain apres instant du test                         = "
						+ Datutil.instantEstAvant(maintenant, demainmemeheure));

		Datutil.ajouterJoursAInstant(hiermemeheure, 1);
		System.out.println(
				"maintenant - 1 jour même instant qu'hier meme heure  = "
						+ Datutil.memeInstant(maintenant, Datutil
								.ajouterJoursAInstant(demainmemeheure, -1)));
		System.out.println("ajout d'un jour à l'instant du test");
		Datutil.ajouterJoursALInstantDuTest(1);
		System.out
				.println("nouvel instant du test                             = "
						+ Datutil.instantToString(Datutil.instantDuTest()));
		System.out
				.println("hier meme heure avant instant du test              = "
						+ Datutil.instantEstAvant(hiermemeheure,
								Datutil.instantDuTest()));
		System.out
				.println("maintenant avant instant du test                   = "
						+ Datutil.instantEstAvant(maintenant,
								Datutil.instantDuTest()));
		System.out
				.println("demain meme heure meme instant que instant du test = "
						+ Datutil.memeInstant(Datutil.instantDuTest(),
								demainmemeheure));
	}
}
