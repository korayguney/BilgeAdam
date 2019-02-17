package com.bilgeadam.collectionschallenge;

public class Song {

	private String title;
	private double duration;
	
	public Song(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
		//System.out.println(this.hashCode());
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Song [title=" + title + ", duration=" + duration + "]";
	}

	@Override
	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((title == null) ? 0 : title.hashCode());
//		System.out.println(result);
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Song other = (Song) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	
	
	
}
