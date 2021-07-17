package proje1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Word { 

    private String word;
    private int length_word;
    private ArrayList<Character> CharArrayList; 
    private boolean isTrue; 
    
    public word(String word) {
        CharArrayList=new ArrayList<>();
        this.word = word;
        this.length_word = word.length();
        for(int k=0;k<this.length_word;k++){
          CharArrayList.add(word.charAt(k));
        }
        Collections.sort(CharArrayList);
       isTrue=false;
    }

    public boolean isIsTrue() {
        return isTrue;
    }

    public void setIsTrue(boolean isTrue) {
        this.isTrue = isTrue;
    }

    public String getword() {
        return word;
    }

    public ArrayList<Character> getCharArrayList() {
        return CharArrayList;
    }

    public void setword(String word) {
        this.word = word;
    }

    public int getlength_word() {
        return length_word;
    }

    @Override
    public String toString() {
        return "word= " + word + " length_word=" + length_word;
    }
    
    public boolean equals(word word2) { //check two word is equal
        if (!this.word.equalsIgnoreCase(word2.getword())) {
            return false;
        }
        return true;
    }

    public int singleTransposition(word word2) {
        StringBuilder copy = new StringBuilder(this.getword()); //single transposition 
        int check = 0; 
        for (int i = 0; i < this.getlength_word() - 1; i++) {
            char a = this.getword().charAt(i);
            char b = this.getword().charAt(i + 1);
            copy.setCharAt(i, b);
            copy.setCharAt(i + 1, a);
            if (copy.toString().equals(word2.getword())) {
                this.setword(copy.toString());
                System.out.println("Word changed : " + this.getword());
                check = 1;
                break;
            } else {
                copy = new StringBuilder(this.getword());
            }

        }
        return check ; 
    }

}
