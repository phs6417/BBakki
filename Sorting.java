import java.util.Arrays;

public class Sorting {
  public static void main(String args[]) {

    String string[] = { "±â¿ª" , "µð±Ú" , "´ÏÀº" , "±¸¿Í¾Ç" };
    		

    Arrays.sort(string);
    System.out.println(Arrays.toString(string));
  
    
    double number[] = { 5 , 3 , 7 , -1 , 0.5 ,0};

    Arrays.sort(number);
    System.out.println(Arrays.toString(number));
  }
}