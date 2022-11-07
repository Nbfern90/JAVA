import java.util.Date;
public class AlfredQuotes{

  public String basicGreeting(){
    return "Hello,lovely to see you. How are you?";
  }

  public String guestGreeting(String name){
    //Code Goes Here
    return String.format("Hello %s, Lovely to see you", name);
  }

  public String dateAnnouncement(){
    //Code Goes Here
    return String.format("It is %s",new Date());
  }

  public String respondBeforeAlexis(String conversation){
    //Code Goes Here
    return String.format("is this snarky enough?",conversation);
  }
}