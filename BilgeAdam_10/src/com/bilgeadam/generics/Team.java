package com.bilgeadam.generics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{

	private String name;
	private int played =0;
	private int won=0;
	private int lost=0;
	private int tied=0;
	
	ArrayList<T> members = new ArrayList<>();
	
	public Team(String teamName) {
		this.name = teamName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean addPlayer(T player) {
		if(members.contains(player)) {
			System.out.println(player.getName() + " is already exist in the team");
			return false;
		} else {
			members.add(player);
			System.out.println(player.getName() + " is added to the " + this.getName());
			return true;
		}
	}
	
	public int numberOfPlayers() {
		return this.members.size();
	}
	
	public void matchScore(Team<T> opponent, int ourScore, int theirScore) {
		String message = "";
		if(ourScore > theirScore) {
			won++;
			message = " won ";
		} else if(ourScore == theirScore) {
			tied++;
			message = " tied ";
		} else if(ourScore < theirScore) {
			lost++;
			message =" lost ";
		}
		played++;
		
		if(opponent != null) {
			opponent.matchScore(null, theirScore, ourScore);
			System.out.println(this.getName() + message + opponent.getName());
		}
	}
	
	public int ranking() {
		return (won * 2)+tied;
	}

	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking() > team.ranking()) {
			return -1;
		} else if(this.ranking() < team.ranking()) {
			return 1;
		} else {
			return 0;
		}
	}
}
