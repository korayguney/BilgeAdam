package com.bilgeadam.flighthomework;

public class Pilot {

	private long id;
	private String name;
	private int age;
	private int experienceInyears;
	private PilotStatus pilotStatus;
	
	public Pilot(long id, String name, int age, int experienceInyears, PilotStatus pilotStatus) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.experienceInyears = experienceInyears;
		this.pilotStatus = pilotStatus;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getExperienceInyears() {
		return experienceInyears;
	}

	public void setExperienceInyears(int experienceInyears) {
		this.experienceInyears = experienceInyears;
	}

	public PilotStatus getPilotStatus() {
		return pilotStatus;
	}

	public void setPilotStatus(PilotStatus pilotStatus) {
		this.pilotStatus = pilotStatus;
	}
	
	public String displayInformation() {
		return String.format("Pilot: name: %s, status: %s ", getName(), getPilotStatus());
	}
	
	
	
	
	
}
