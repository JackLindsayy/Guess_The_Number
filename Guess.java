public class Guess
{
  private String playerName;
  private String gameChoice;
  private int randomNumber;
  private int guess;
  Random randomGenerator = new Random();
    
    public Guess()
    {
        playerName = "";
  }
  
  public void display_message()
  {
      system.out.println("Welcome to the Guessing Game");
  }
}
