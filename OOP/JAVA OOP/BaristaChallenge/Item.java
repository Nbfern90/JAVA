public class Item {

  //MEMBER VARIABLES
  private String name;
  private double price;


  //Constructor
  //Takes a name and price as arguments and sets them accordingly
  public Item(){
    
  }

  public Item(String name, double price){
    this.name = name;
    this.price = price;
  }

  //GETTERS AND SETTERS -for name and price
  //Getter
  public String getName() {
    return this.name;
  }

  public double getPrice() {
    return this.price;
  }

  //Setter
  public void setName(String name) {
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }
}