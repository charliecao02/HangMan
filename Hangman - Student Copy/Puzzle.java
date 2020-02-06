import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle{
    private String word;
    private int length, amountGuessed=0;
    private String guesses="";
    private ArrayList<String> wordOnScreen=new ArrayList<String>();
    
    public Puzzle(){
        word="test";
        length=word.length();
        for(int i=0;i<length;i++){
            wordOnScreen.add("_ ");
        }
    }
    
    public void show(){
        for(int i=0;i<wordOnScreen.size();i++){
            System.out.print(wordOnScreen.get(i));
        }
        System.out.println("");
        
        System.out.print("Your Guesses: ");
        System.out.print(guesses + "\n");
        System.out.println("Make Another Guess:");
    }
    
    public boolean isUnsolved(){
        if(amountGuessed<length) return true;
        else return false;
    }
    
    public boolean makeGuess(String guess){
        guesses=(guesses + guess + " ");
        boolean works=false;
        for(int i=0;i<length;i++){
            if(guess.equals(word.substring(i,i+1))){
                works=true;
                wordOnScreen.set(i,(guess+" "));
                amountGuessed++;
            }
        }
        return works;
    }
    
    public String getWord(){
        return word;
    }
}
