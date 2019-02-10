package com.bilgeadam.generics;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

	private String league_name;
	private ArrayList<T> teams = new ArrayList<>();
	
	public League(String league_name) {
		super();
		this.league_name = league_name;
	}
	
	public boolean addTeam(T team) {
		if(teams.contains(team)) {
			System.out.println(team.getName() +  " is already exist");
			return false;
		}
		System.out.println(team.getName() +  " is added to the " +  this.getLeague_name());
		teams.add(team);
		return true;
	}
	
	public void showLeagueTable() {
		Collections.sort(teams);
		for (T t : teams) {
			System.out.println(t.getName() + " : " + t.ranking());
		}
	}
	
	public String getLeague_name() {
		return league_name;
	}
	
	
	
}
