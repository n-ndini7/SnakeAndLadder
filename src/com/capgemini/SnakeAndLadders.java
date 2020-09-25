package com.capgemini;

public class SnakeAndLadders {
	//UC7 - Game bwtween two players:
	//1.Reporting the position of each player after each die roll.
	//2.Final position of both when the game ends.
	//3.Player won and its die roll count required to win the game.
	public static final int no_play=0;
	public static final int Ladder = 1;
	public static final int Snake = 2;
	public static int player1_pos= 0;
	public static int player2_pos=0;
	static int p1_turn = 1;  //p1_turn denotes if player 1 turn or not. 
	static int p2_turn = 2;   //p2_turn denotes if player 2 turn or not.
	public static int player1_turns = 0;
	public static int player2_turns = 0;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Snakes and Ladders Game!!!");
		System.out.println("Player 1 and Player 2 starts at Initial position 0");
		while((player1_pos<100)&&(player2_pos<100)) {
		int dice_roll = (int) Math.floor(Math.random()*10)%6 +1;
		int check_status= (int) Math.floor(Math.random()*10)%3;
		if(p1_turn==1) {
			player1_turns++;
		
			if(check_status == no_play) {
				System.out.println("Player 1 remains at same position.");
				p1_turn = 0;
				p2_turn = 2;
			}
			else if(check_status== Ladder) {
				if(player1_pos+dice_roll < 100) {
					player1_pos+=dice_roll;
				}
			}
			else if(check_status == Snake) {
				if(player1_pos-dice_roll > 0)
				 player1_pos-= dice_roll;
				else
					player1_pos = 0;
				p1_turn= 0;
				p2_turn = 2;
			}
			System.out.println("The position of player 1 is: " +player1_pos+ ".");
		}
		else if(p2_turn==2){
			player2_turns++;
			if(check_status == no_play) {
				System.out.println("The Player 2 remains at same position.");
				p1_turn= 1;
				p2_turn = 0;
			}
			else if(check_status== Ladder) {
				if(player2_pos+dice_roll <=100)
					player2_pos+= dice_roll;
			}
			else if(check_status == Snake) {
				if(player2_pos-dice_roll > 0)
				 player2_pos -= dice_roll;
				else
					player2_pos = 0;
				p1_turn= 1;
				p2_turn = 0;
			}
			System.out.println("The position of player 2 is: "+player2_pos+ ".");
		}
		}
		//final position of both after game ends.
		System.out.println("The Final Position of player 1 :"+player1_pos+ ".");
		System.out.println("The Final Position of player 2 :"+player2_pos+ ".");
		if(player1_pos == 100) {
			System.out.println("Player 1 won and his dice roll count is :"+player1_turns);
		}
		else {
			System.out.println("Player 2 won and his dice roll count is :"+player2_turns);
		}
	}
}
