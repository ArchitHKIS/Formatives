import java.util.*;
import java.lang.Math;

public class RandomNumberGenerator {
public static void main(String[] args) {
      final int totalPoints = 4;
      Random r = new Random();
      Scanner in = new Scanner(System.in);
      ArrayList<Integer> poops = new ArrayList<Integer>(totalPoints);
      ArrayList<Integer> userinputs = new ArrayList<Integer>(totalPoints);

      for (int i=0; i<totalPoints; i++) {
          int poop = (r.nextInt(10-1)+1);
          System.out.println("Random datapoints: " + poop);
          poops.add(poop);
      }

      for (int poto = 0, correct = 0; poto < 5; poto = poto + correct) {
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