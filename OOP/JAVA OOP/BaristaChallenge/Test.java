import java.util.ArrayList;

public class Test{
  public static void main(String[] args){

  
    //Orders
    Order order1 = new Order();
    Order order2 = new Order();

    Order order3 = new Order("Nick");
    Order order4 = new Order("Bill");
    Order order5= new Order("John");

  //Items
    Item item1 = new Item("Drip Coffee",1.50);
    Item item2 = new Item("Capuccino",3.50);
    Item item3 = new Item("Latte", 2.50);


//Add Items to Orders
    order1.addItem(item1);
    order1.addItem(item2);
    order2.addItem(item1);
    order2.addItem(item3);
    order3.addItem(item1);
    order3.addItem(item2);
    order4.addItem(item1);
    order4.addItem(item3);
    order5.addItem(item1);
    order5.addItem(item2);

//Tests
    System.out.println(order1.getStatusMessage());

    order2.setReady(true);
    System.out.println(order2.getStatusMessage());

    System.out.println(order2.getOrderTotal());

   order2.display();









  }
}