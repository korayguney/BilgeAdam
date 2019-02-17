package com.bilgeadam.collectionschallenge;

import java.io.File;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javafx.application.Application;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class TestMain { //extends Application  {

	public static void main(String[] args) {
		
		//Application.launch(args);
		
		Album album1 = new Album("Mançoloji", "Barýþ Manço");
		album1.addSong("Daðlar Daðlar", 5.14);
		album1.addSong("Gülpembe", 5.04);
		album1.addSong("Ýþte Hendek Ýþte Deve", 4.14);
		album1.addSong("Sarý Çizmeli Mehmet Aða", 3.54);
		album1.addSong("Kara Sevda", 5.14);
		album1.addSong("Hal Hal", 5.14);
		
		Album album2 = new Album("Karma", "Tarkan");
		album2.addSong("Aþk", 4.44);
		album2.addSong("Ay", 5.49);
		album2.addSong("Kuzu Kuzu", 3.49);
		album2.addSong("Gitti gideli", 6.19);
		album2.addSong("Uzak", 4.40);
		album2.addSong("Yandým", 3.49);
		album2.addSong("Hüp", 4.49);
		
		LinkedList<Album> albums = new LinkedList<>();
		albums.add(album1);
		albums.add(album2);
		
		LinkedList<Song> playlist = new LinkedList<>();
		
		albums.get(0).addToPlaylist(1, playlist);
		albums.get(0).addToPlaylist(2, playlist);
		albums.get(0).addToPlaylist(3, playlist);
		albums.get(0).addToPlaylist(4, playlist);
		albums.get(0).addToPlaylist(5, playlist);
		//albums.get(0).addToPlaylist("Ýþte Hendek Ýþte Deve", playlist);
		//albums.get(0).addToPlaylist("Olmayan Parça", playlist);
		albums.get(1).addToPlaylist(1, playlist);
		albums.get(1).addToPlaylist(2, playlist);
		albums.get(1).addToPlaylist(3, playlist);
		albums.get(1).addToPlaylist(4, playlist);
		albums.get(1).addToPlaylist(5, playlist);
		albums.get(1).addToPlaylist(6, playlist);
		//albums.get(1).addToPlaylist("Olmayan Diðer Parça", playlist);
		ListIterator<Song> iterator = playlist.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("SIZE : " + playlist.size());
		
		play(playlist);
		
	}

//	private static void sound() {
//		String bip = "./sample.mp3";
//		Media hit = new Media(new File(bip).toURI().toString());
//		MediaPlayer mediaPlayer = new MediaPlayer(hit);
//		mediaPlayer.play();
//	}
//	
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		sound();
//	}
	
	
	
	private static void play(LinkedList<Song> playlist) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		ListIterator<Song> iterator = playlist.listIterator();
		
		if(playlist.size() == 0) {
			System.out.println("There is no song in the playlist");
			return;
		} else {
			System.out.println("Now playing : " + iterator.next().toString());
			printMenu();
		}
		
		while (flag) {
			String choice = scanner.nextLine();
			
			switch (choice) {
			case "0":
				flag = false;
				break;
			case "1":
				playNextSong(iterator);
				break;
			case "2":
				playPreviousSong(iterator);
				break;
			case "3":
				printMenu();
				break;
			case "4":
				showPlaylist(iterator);
				break;
			}
		}
	}

	private static void showPlaylist(ListIterator<Song> iterator) {
		System.out.println("=========== PLAYLIST ===============");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("====================================");
	}

	private static void printMenu() {
		System.out.println("SELECT ONE OF THE CHOOSES");
		System.out.println("0- Quit from playlist ");
		System.out.println("1- Play next song ");
		System.out.println("2- Play previous song ");
		System.out.println("3- Show chooses ");
		System.out.println("4- List Playlist songs ");
	}
	
	private static void playNextSong(ListIterator<Song> iterator) {
		if(iterator.hasNext()) {
			iterator.next();
			System.out.println("Now playing : " + iterator.next());
		} else {
			System.out.println("The playlist is reached to the end");
		}
	}
	
	private static void playPreviousSong(ListIterator<Song> iterator) {
		if(iterator.hasPrevious()) {
			iterator.previous();
			System.out.println("Now playing : " + iterator.previous());
		} else {
			System.out.println("The playlist is at the beginning");
		}
	}

	
}
