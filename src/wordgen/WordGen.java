/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordgen;

/**
 *
 * @author user
 */
public class WordGen {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
        int words = 5;
        int minWordLength = 3;
        int maxWordLength = 8;
        
        
        
        String[] konsonanten = new String[20];
        for (int i=0; i<20; i++)
        {
            switch (i)
            {
                case 0: konsonanten[i]= "m";break;
                case 1: konsonanten[i]= "q";break;
                case 2: konsonanten[i]= "w";break;
                case 3: konsonanten[i]= "r";break;
                case 4: konsonanten[i]= "t";break;
                case 5: konsonanten[i]= "z";break;
                case 6: konsonanten[i]= "p";break;
                case 7: konsonanten[i]= "s";break;
                case 8: konsonanten[i]= "d";break;
                case 9: konsonanten[i]= "f";break;
               case 10: konsonanten[i]= "g";break;
               case 11: konsonanten[i]= "h";break;
               case 12: konsonanten[i]= "j";break;
               case 13: konsonanten[i]= "k";break;
               case 14: konsonanten[i]= "l";break;
               case 15: konsonanten[i]= "x";break;
               case 16: konsonanten[i]= "c";break;
               case 17: konsonanten[i]= "v";break;
               case 18: konsonanten[i]= "b";break;
               case 19: konsonanten[i]= "n";break;
            }
        }
        String[] vokale = new String[9];
        for (int i=0; i<9; i++)
        {
            switch (i)
            {
                case 0: vokale[i]= "e";break;
                case 1: vokale[i]= "u";break;
                case 2: vokale[i]= "i";break;
                case 3: vokale[i]= "o";break;
                case 4: vokale[i]= "ü";break;
                case 5: vokale[i]= "a";break;
                case 6: vokale[i]= "ö";break;
                case 7: vokale[i]= "ä";break;
                case 8: vokale[i]= "y";break;
            }
        }
        word(words, konsonanten, vokale, minWordLength, maxWordLength);
    }
    
    public static void word(int words, String[] konsonanten, String[] vokale, int minLength,  int maxLength)
    {
        while(words>0)
        {
            String word = "";
            int wordLength = randomBetween(minLength, maxLength);
            while(wordLength>0)
            {
                if(wordLength%randomBetween(1,3)==0)
                {
                    word = word+vokale[randomBetween(0, 8)];
                    wordLength--;
                }
                else
                {
                    word = word+konsonanten[randomBetween(0, 19)]; 
                    wordLength--;
                }
            }
            System.out.println(word);
            words--;
        }
    }
    
    public static int randomBetween(int min, int max) 
    {
        return (int) Math.round(Math.random() * (max - min)+ min);
    }
   
    
}
