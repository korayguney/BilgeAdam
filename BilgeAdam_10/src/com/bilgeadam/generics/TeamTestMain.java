package com.bilgeadam.generics;

import java.util.ArrayList;
import java.util.Collections;

public class TeamTestMain {

	public static void main(String[] args) {
		
		FootballPlayer sarbi = new FootballPlayer("Sarbi Sarýoðlu");
		BasketballPlayer jordan = new BasketballPlayer("Michael Jordan");
		VolleyballPlayer cansu = new VolleyballPlayer("Cansu Özbay");
		
		Team<FootballPlayer> galatasaray = new Team<>("Galatasaray");
		ArrayList<Team<FootballPlayer>> teams = new ArrayList<>();
		
		
		//galatasaray.addPlayer(sarbi);
//		galatasaray.addPlayer(jordan);
//		galatasaray.addPlayer(cansu);
		
//		System.out.println(galatasaray.numberOfPlayers());
//		
		Team<BasketballPlayer> bulls = new Team<>("Chicago Bulls");
//		bulls.addPlayer(jordan);
		//bulls.addPlayer(sarbi);
		
//		Team<String> fakeTeam = new Team<>("This is a fake team");
//		fakeTeam.addPlayer("This is not a real player");
		
		Team<FootballPlayer> fenerbahce = new Team<>("Fenerbahçe");
		Team<FootballPlayer> besiktas = new Team<>("Beþiktaþ");
		Team<FootballPlayer> trabzonspor = new Team<>("TrabzonSpor");
		
		galatasaray.matchScore(fenerbahce, 0, 6);
		galatasaray.matchScore(trabzonspor, 3, 2);
		besiktas.matchScore(fenerbahce, 1, 1);
		trabzonspor.matchScore(fenerbahce, 1, 4);
		trabzonspor.matchScore(besiktas, 4, 4);
		//trabzonspor.matchScore(bulls, 5, 4);
		
		System.out.println("======= RANKINGS ========");
//		System.out.println(galatasaray.getName() + ":" + galatasaray.ranking());
//		System.out.println(fenerbahce.getName() + ":"+ fenerbahce.ranking());
//		System.out.println(trabzonspor.getName()+":"+trabzonspor.ranking());
//		System.out.println(besiktas.getName()+":"+besiktas.ranking());
		
		teams.add(besiktas);
		teams.add(galatasaray);
		teams.add(trabzonspor);
		teams.add(fenerbahce);
		
		
		Collections.sort(teams);
		
		for (Team<FootballPlayer> team : teams) {
			System.out.println(team.getName()+":"+team.ranking());
		}
		
	}

}
