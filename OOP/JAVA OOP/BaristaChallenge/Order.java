import java.util.ArrayList;

public class Order{

  //Member Variables
  private String name;
  private boolean ready;
  private ArrayList<Item> items = new ArrayList<Item>();

  //CONSTRUCTOR
  //No arguments, sets name to "Guest", initializes items as an empty list.
  public Order(){
    this.name = "Guest";
    this.ready = false;
    
  }


  //OVERLOADED CONSTRUCTOR
  //Takes a name as an argument, sets name to this custom name.
  //initializes items as an empty list.

  public Order(String name){
    this.name = name;
    this.ready = false;

  }

  //Order Methods

  public void addItem(Item item){
    this.items.add(item);
  }

  public String getStatusMessage(){
    if(this.ready == true){
      return "Your order is ready";
    } else {
      return "Thank you for waiting. Your order will be ready soon.";
    }
  }

  public double getOrderTotal(){
    double sum = 0.0;
    for(Item i : this.items){
      sum += i.getPrice();
    }
    return sum;

  }

  public void display(){
    System.out.printf("Customer's Name : %s \n", this.name);
    for(Item i :this.items){
      System.out.println(i.getName() + " - $" + i.getPrice());
    }
    System.out.println("Total: $" + this.getOrderTotal());

  }



  //Most of your code will go here, so implement the getters and settters first!
  //Getters & Setters

  //Getter
  public String getName(){
    return this.name;
  }

  public boolean getReady(){
    return this.ready;
  }

  public ArrayList<Item> getItems(){
    return items;
  }
//Setter

public void setName(String name){
  this.name = name;
}

public void setReady(boolean ready){
  this.ready = ready;
}

public void setItems(ArrayList<Item> items){
  this.items = items;
}

  }

