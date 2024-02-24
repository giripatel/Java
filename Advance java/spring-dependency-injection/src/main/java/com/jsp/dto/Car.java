package com.jsp.dto;

public class Car {
	MusicPlayer musicplayer;
	public void setMusicplayer(MusicPlayer musicplayer) {
		this.musicplayer = musicplayer;
	}
	
	public Car(MusicPlayer muciMusicplayer) {
		this.musicplayer = muciMusicplayer;
	}
	public void carRide() {
		musicplayer.play();
	}
	
}
