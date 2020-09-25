package com.capgemini;

public class SnakeAndLadders {
	//UC1 Snake and Ladder game played with single player at start position 0
	public static final int initial_pos =0;
	public static final int players =1;
	public static void main(String[] args) {
		System.out.println("Welcome to Snakes and Ladders Game!!!");
		System.out.println("Player starts at Initial position 0");
		int dice_roll= ((int) Math.floor(Math.random()*10)%6)+1;
		System.out.println("Number on the dice rolled: "+dice_roll);
	}
}
