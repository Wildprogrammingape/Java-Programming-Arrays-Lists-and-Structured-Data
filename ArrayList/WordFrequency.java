
/**
 * Write a description of WordFrequency here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.util.ArrayList;
public class WordFrequency {
    // instance variable
    private ArrayList<String> myWords;
    private ArrayList<Integer> myFreqs;
    
    public WordFrequency(){// constructor to initialize the instance variable
        myWords = new ArrayList<String>();
        myFreqs = new ArrayList<Integer>();
    }
    
    public void findUnique(){  // method to find the unique word and frequency
        FileResource fr = new FileResource(); // read resouce from any prompt file
        for (String s : fr.words()){  // .words() return every words with space
            s = s.toLowerCase();   // .toLowerCase()
            int index = myWords.indexOf(s); // find the index in "myWords"
            if (index == -1){  //  can't find
                myWords.add(s);
                myFreqs.add(1);
            }
            else{// the current string is in "myWords" with index known
                int value = myFreqs.get(index); // how many times exsisting for this string
                myFreqs.set(index,value+1);    // times plus 1
            }
        }
    }
    
    public void PrintWordFrequency(){
        findUnique();
        System.out.println("Total unique words " + myWords.size());
        for (int i =0; i<myWords.size(); i++){
            System.out.println("There are " + myFreqs.get(i) + " : " + myWords.get(i));
        }
    }
    

}
