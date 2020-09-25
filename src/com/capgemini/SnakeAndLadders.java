package com.capgemini;

public class SnakeAndLadders {
	//UC3 The player checks for options - No play , Ladder and Snake.
	public static final int initial_pos =0;
	public static final int players =1;
	public static final int no_play =0;
	public static final int Ladder = 1;
	public static final int Snake = 2;
	public static void main(String[] args) {
		System.out.println("Welcome to Snakes and Ladders Game!!!");
		System.out.println("Player starts at Initial position 0");
		int dice_roll= ((int) Math.floor(Math.random()*10)%6)+1;
		System.out.println("Number on the dice rolled: "+dice_roll);
		//curr_pos is the current position of player during game
		int curr_pos= initial_pos;
		int check_status = (int) Math.floor(Math.random()*10)%3;
		System.out.println("The check status is " + check_status);
		
		if(check_status == no_play) {
			//position of player remains unaltered. 
			System.out.println("No action taken!");
		}
		else if(check_status == Ladder) {
			//current position of player = (current position + dice_roll) for ladder
			curr_pos += dice_roll;
		}
		else {
			//current position of player = ( current postion dice_roll) for snake
			curr_pos -= dice_roll;
	
			if(curr_pos<initial_pos)
				curr_pos = initial_pos;
		}
		System.out.println("The updated position of player after die roll :"+curr_pos);
	}
}
