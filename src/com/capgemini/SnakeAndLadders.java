package com.capgemini;

public class SnakeAndLadders {
	// UC6 The number of times die was rolled to win the game and also the position
	// of player after very roll.
	public static final int initial_pos = 0;
	public static final int players = 1;
	public static final int no_play = 0;
	public static final int Ladder = 1;
	public static final int Snake = 2;

	public static void main(String[] args) {
		System.out.println("Welcome to Snakes and Ladders Game!!!");
		System.out.println("Player starts at Initial position 0");
		int moves = 0;
		int dice_count = 0;
		// curr_pos is the current position of player during game
		int curr_pos = initial_pos;
		while (curr_pos != 100) {
			int dice_roll = ((int) Math.floor(Math.random() * 10) % 6) + 1;
			dice_count++;
			int check_status = (int) Math.floor(Math.random() * 10) % 3;
			if (check_status == no_play) {
				// position of player remains unaltered.
			} else if (check_status == Ladder) {
				// current position of player = (current position + dice_roll) for ladder
				curr_pos += dice_roll;
				if (curr_pos > 100)
					curr_pos -= dice_roll;
			} else {
				// current position of player = ( current postion dice_roll) for snake
				curr_pos -= dice_roll;

				if (curr_pos < initial_pos)
					curr_pos = initial_pos;
			}
			moves++;
			System.out.println("Updated Position after every dice roll is : " + curr_pos);
		}
		System.out.println("The Player reaches exactly 100 in " + moves + " moves!");
		System.out.println("Die has been rolled " + dice_count + " times too reach 100!");
	}
}
