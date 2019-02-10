package com.bilgeadam.generics;

public class MainLeague {

	public static void main(String[] args) {
		
		League<Team<FootballPlayer>> superlig = new League<>("Ýlhan Cavcav Süper Ligi");
		
		Team<FootballPlayer> galatasaray = new Team<>("Galatasaray");
		Team<FootballPlayer> fenerbahce = new Team<>("Fenerbahçe");
		Team<FootballPlayer> besiktas = new Team<>("Beþiktaþ");
		Team<FootballPlayer> trabzonspor = new Team<>("TrabzonSpor");
		
		galatasaray.matchScore(fenerbahce, 0, 6);
		galatasaray.matchScore(trabzonspor, 3, 2);
		besiktas.matchScore(fenerbahce, 1, 1);
		trabzonspor.matchScore(fenerbahce, 1, 4);
		trabzonspor.matchScore(besiktas, 4, 4);
		
		
		superlig.addTeam(trabzonspor);
		superlig.addTeam(fenerbahce);
		superlig.addTeam(besiktas);
		superlig.addTeam(galatasaray);
		
		System.out.println("********* RANKING ************");
		superlig.showLeagueTable();
		
	}
	
	
}
