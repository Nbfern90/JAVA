import java.util.ArrayList;

public class CafeUtil{

  public int getStreakGoal(){
    int sum = 0;
    for(int i = 0; i <=10; i++){
      sum +=i;
    }
    return sum;
  }

  public double printPriceChart(String productName,double price,int maxNumber){
    double sum = 0;
    System.out.println(productName);
    for(int i = 1; i <=maxNumber; i++){
      sum += price;
      System.out.println(i + " - $" + String.format("%.2f",sum));
    }
    return sum;
  }

  public double getOrderTotal(double[] arr){
    double sum = 0;
    for(double i : arr){
      sum +=i;
    }
    return sum;
  }

  public void displayMenu(ArrayList<String> arr,ArrayList<Double> num){
    for(int i = 0; i < arr.size(); i++){
      System.out.println(i + " " + num.get(i) + " " + arr.get(i));
    }
  }
  public void addCustomer(ArrayList<String>str){
    System.out.println("Please Enter Your Name");
    String userName = System.console().readLine();
    str.add(userName);
    System.out.println("Hello " + userName + ", the number of people ahead of you is " + str.size());
    

  }


  

}