
package bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class logic {
  protected ArrayList<Integer> list = new ArrayList<>();
  protected Random random = new Random();
  protected final int min = 1;
  protected final int max = 75;
  protected int count = 0;
  
  //bingoInt
  protected ArrayList<Integer> bingoInt(){
    
   for(int i =0; i<76; i++){
    list.add(i+1);
   }
   Collections.shuffle(list);
   return list;
  }
  
  //bingoChar
  protected char bingoChar(int rand){
    
    char bingoLetter ='\0';

    if(rand<16){
      return 'B';
    }
    else if(rand < 31 && rand > 15){
      return 'I';
    }
    else if(rand < 46 && rand > 30){
      return 'N';
    }
    else if(rand < 61 && rand > 45){
      return 'G';
    }
    else if(rand > 60){
      return 'O';
    }
    return bingoLetter; 
  }
 
  //returnList
  protected ArrayList returnList(){
    return list;
  }
  
  //Print
  protected void print(){
    Collections.sort(list);
    System.out.print(list);
  }

}
