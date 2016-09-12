import java.util.*;
public class RandomNumberGenerator {
public static void main(String[] args) {
      final int totalPoints = 4;
      Random r = new Random();
      Scanner in = new Scanner(System.in);
      ArrayList<Integer> poops = new ArrayList<Integer>(totalPoints);
      // poops are the random numbers that are generated
      ArrayList<Integer> userinputs = new ArrayList<Integer>(totalPoints);
      // userinputs are the numbers inputed by the user

      for (int i=0; i<totalPoints; i++) {
          int poop = (r.nextInt(10-1)+1);
          System.out.println("Random datapoints: " + poop);
          poops.add(poop);
      }

      for (int poto = 0, correct = 0; poto < 5; poto = poto + correct) {
    	  //poto is used for the for loop, as long as poto is less that 5 the code won't run. Used for 
    	 // measuring the user inputs. 
      System.out.println("Enter a number from 1-9");
      for (int i=0; i<4; i++) {
          int s = in.nextInt();	
          userinputs.add(s);
      }

      
      for (int i=0; i<4; i++) {
          if (poops.contains(userinputs.get(i))) {
              correct++;
              poto = 0;
        poto = poto + correct;    
          }
          
      }

      System.out.println("You have " + poto + " correct numbers!");
}}}