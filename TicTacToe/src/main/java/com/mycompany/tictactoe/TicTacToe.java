package com.mycompany.tictactoe;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TicTacToe {
    static ArrayList<Integer>playerPositions = new ArrayList<Integer>();
    static ArrayList<Integer>cpuPositions = new ArrayList<Integer>();
    public static void main(String[] args) {
       
        char[][] gameBoard = {{' ','|',' ','|',' '},//[0][0],[0][2],[0][4]
                              {'-','+','-','+','-'},
                              {' ','|',' ','|',' '},//[2][0],[2][2],[2][4]
                              {'-','+','-','+','-'},      
                              {' ','|',' ','|',' '}};//[4][0],[4][2],[4][4]
        
        printGameBoard(gameBoard);
        
        while(true){
            
        Scanner input = new Scanner(System.in);
        System.out.print("Enter placement: ");
        int playerPos = input.nextInt();
        System.out.println("Your placement: "+playerPos);
        
        while(playerPositions.contains(playerPos)||cpuPositions.contains(playerPos)){
        System.out.println("Position taken");
        System.out.print("Enter another placement: ");
        playerPos = input.nextInt();
        }
         
        piecePlacement(gameBoard, playerPos,"player");
        
        String result = checkWinner();
        if(result.length()>0){
        System.out.println(result);
        break;}
        
        Random rand = new Random();
        int cpuPos = rand.nextInt(9)+1;    
        while(playerPositions.contains(cpuPos)||cpuPositions.contains(cpuPos)){
        cpuPos = rand.nextInt(9)+1;
        }
        
        piecePlacement(gameBoard, cpuPos,"cpu");      
        printGameBoard(gameBoard);           
        result = checkWinner();
        if(result.length()>0){
        System.out.println(result);
        break;}
        
        }
    }
    public static void printGameBoard(char[][] gameBoard){
        for(char[] row: gameBoard){
            for(char column: row){
            
                System.out.print(column);            
            }
                System.out.println();
        }       
    }
    public static void piecePlacement(char[][] gameBoard, int playerPos, String user){
        char symbol = ' ';
        if(user.equals("player")){
            symbol = 'X';
            playerPositions.add(playerPos);
        }else if(user.equals("cpu")){
            symbol = 'O';
            cpuPositions.add(playerPos);
            }
        
        switch (playerPos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break;
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        } 
    }
    public static String checkWinner(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List rightCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List leftCol = Arrays.asList(3,6,9);
        List crossRight = Arrays.asList(1,5,9);
        List crossLeft = Arrays.asList(3,5,7);
        
        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(rightCol);
        winning.add(midCol);
        winning.add(leftCol);
        winning.add(crossRight);
        winning.add(crossLeft);
        
        for(List l: winning){
            if(playerPositions.containsAll(l)){
            return "Player Won";}
            else if(cpuPositions.containsAll(l)){
            return "Cpu Won";}
            else if(playerPositions.size()+cpuPositions.size()==9){
            return "Draw";}
        }     
         return "";
    }
}
