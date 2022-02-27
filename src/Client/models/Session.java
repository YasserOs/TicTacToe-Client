/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Session {

    public String p1 ;
    public String p2;
    public String p1Pick,p2Pick;
    public int turn ;
    boolean status; // 0 for paused session 1 for running
    public Board board;
    int numberOfPlays=0;
    public Session(String p1 , String p2){
        this.p1=p1;
        this.p2=p2;
        board = new Board();
    }
    public void play(int position , String pick){
        board.move(position, pick);
        
    }
    public void resetNumOfPlays(){
        numberOfPlays=0;
    }
    public void increasePlays(){
        numberOfPlays++;
    }
    public int getNumOfPlays(){
        return numberOfPlays;
    }
    
}
