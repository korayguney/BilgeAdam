package com.bilgeadam.collectionschallenge;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Album {

	private String albumname;
	private String artist;
	private ArrayList<Song> songs;
	
	public Album(String albumname, String artist) {
		super();
		this.albumname = albumname;
		this.artist = artist;
		this.songs = new ArrayList<>();
	}
	
	public boolean addSong(String title, double duration) {
		if(findSong(title) == null) {
			songs.add(new Song(title, duration));
			return true;
		}
		return false;
	}

	private Song findSong(String title) {
		for (Song song : songs) {
			if(song.getTitle().equals(title)) {
				return song;
			}
		}
		return null;
	}
	
	public boolean addToPlaylist(int tracknumber, LinkedList<Song> playlist) {
		int index = tracknumber-1;
		
		if((index>=0) && (index <= songs.size())) {
			System.out.println("ADDED : "+ this.songs.get(index));
			playlist.add(this.songs.get(index));
			return true;
		} else {
			System.out.println("Your track number is exceeded the playlist ");
			return false;
		}
	}
	
	public boolean addToPlaylist(String title, LinkedList<Song> playlist) {
		if(findSong(title) != null) {
			playlist.add(findSong(title));
			return true;
		}
		System.out.println(title + " has not exist in the album");
		return false;
	}
}
