package com.day8.movietime;

import java.time.LocalTime;

public class Movie{
	String name;
	LocalTime time;
	Movie(String name, LocalTime time){
		this.name = name;
		this.time = time;
	}
	@Override
	public String toString(){
		return "name -> " + name + " | time -> " + time + "";
	}
}
