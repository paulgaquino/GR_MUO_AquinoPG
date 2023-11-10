/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex04_muo_aquinopg;

/**
 *
 * @author AquinoPG
 */

import java.util.Scanner;

public class RockPaperScissors{

    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in); //for welcome page choice 
        int roundsToWin = 2, userScore = 0, compScore = 0;  
        String firstChoice;
        int pointsToWin = roundsToWin - 1;
        
        Move playerChoice = new Move ("Wala");
        Move compChoice = new Move ("Wala");
        
        int randomNum; //computer choice for game
        
        Move rock = new Move("Rock");
        Move paper = new Move("Paper");
        Move scissors = new Move("Scissors");
        
        rock.setStrongAgainst(scissors);
        paper.setStrongAgainst(rock);
        scissors.setStrongAgainst(paper);
        
        do {
            System.out.println("""
                Welcome to Rock, Paper, Scissors. Please choose an option:
                1. Start game
                2. Change number of rounds
                3. Exit application
            """);
            
            firstChoice = scanner.nextLine();
            
            if (firstChoice.equals("3")) {
                System.out.println("Thanks for playing!");
            }
            else if (firstChoice.equals("1")) {
                System.out.println("This will be a first to " + pointsToWin +
                " wins."
                );
                
                System.out.println("What is your first move?");
                System.out.println("""
                    1: Rock
                    2: Paper
                    3: Scissors
                """);
                Scanner rockPaperScissors = new Scanner (System.in);
                int rps = rockPaperScissors.nextInt();
                
                while (userScore < pointsToWin && compScore < pointsToWin) {
                    randomNum = (int) Math.floor(Math.random()*3) + 1;
                
                    switch (rps) {
                        case 1:
                            playerChoice = rock;
                        case 2:
                            playerChoice = paper;
                        case 3:
                            playerChoice = scissors;
                    }
                
                    switch(randomNum) {
                        case 1:
                            compChoice = rock;
                        case 2:
                            compChoice = paper;
                        case 3: 
                            compChoice = scissors;
                    }
                
                    switch(Move.compareMoves(playerChoice, compChoice)) {
                        case 0: //player wins
                            System.out.println("Player chose " + playerChoice.getName()
                            + " and Computer chose " + compChoice.getName() +
                            ". Player wins round!");
                            userScore ++;
                        case 1: //comp wins
                            System.out.println("Player chose " + playerChoice.getName()
                            + " and Computer chose " + compChoice.getName() +
                            ". Player wins round!");
                            compScore ++;
                        case 2: //tie
                            System.out.println("Tie.");
                    }
                }
                if (userScore == pointsToWin) {
                        System.out.println("Player Wins!");
                }
                else if (compScore == pointsToWin) {
                    System.out.println("Computer Wins!");
                }
                else {
                    System.out.println("Tie!");
                }
            }
            else if (firstChoice.equals("2")) {
                System.out.println("How many rounds do you want?");
                roundsToWin = scanner.nextInt();
                System.out.println("Setting saved!");
            }
            
        } while (!firstChoice.equals("3"));
        
    }
    
}