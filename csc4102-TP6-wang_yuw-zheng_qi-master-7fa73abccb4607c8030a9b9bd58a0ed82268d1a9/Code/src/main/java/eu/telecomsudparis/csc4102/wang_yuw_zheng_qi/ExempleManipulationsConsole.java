package eu.telecomsudparis.csc4102.wang_yuw_zheng_qi;

import java.time.LocalDate;

import eu.telecomsudparis.csc4102.util.Console;

public class ExempleManipulationsConsole {

	public static void main(String[] args) {
		try {
			String ligne = Console
					.readLine("\nEntrer une chaîne de caractères :");
			System.out.println("Chaîne de caractère saisie = " + ligne);
			Integer entier = Console.readInt("\nEntrer un entier :");
			System.out.println("Entier saisi = " + entier);
			Double d = Console.readDouble("\nEntrer un double :");
			System.out.println("Double saisi = " + d);
			LocalDate date = Console
					.readDate("\nEntrer une date (format aaaa-mm-jj):");
			System.out.println("Date saisie = " + date);
		} catch (Exception e) {
			System.err.println("Erreur de saisie");
		}
	}
}
