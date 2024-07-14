import java.util.*;
class GuessGame
{
public static void main(String args[])
{
    Random random =new Random();
    int min=1;
    int max =100;
    int secret =random.nextInt(max-min+1)-min;
    Scanner sc =new Scanner(System.in);
    System.out.println("welcome to number guessing game");
    System.out.println("enter a number between"+min+" and "+max+"number ");
    int attempts=0;
    boolean guessedcorrect=false;
   while(!guessedcorrect)
   {
    System.out.println("enter ur guess");
    int userguess=sc.nextInt();
    attempts++;
    if(secret==userguess)
    {
        guessedcorrect=true;
        System.out.println("congratulation!ur guess is correct" + attempts+ "attempts");
    }
    else if(userguess>secret)
    {
        System.out.println("too high,try lower number");
    }
    else{
    System.out.println("too low ,try higher number");
    }
   }
   sc.close();
}
}