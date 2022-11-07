
//File name must be the same as the class name 
public class Test{



  //The file or class with the exact method signature below is always the lauching point of the application, You cannot run a Java program without it.
  public static void main(String[] args){
//For now, all code goes here

    System.out.println("Hello World!");
  }
}

public class Variables {
  public static void main(String[] args){
      int ourInt; // we can declare a variable without setting its value

//An int holds integers, like 4 or -51. It is limited to numbers between -2147483648 and 2147483647, or around 2 billion.

      ourInt = 400; // we can assign a value to the variable later in our code


      double pi = 3.14159265; // we can also declare and assign on the same line

      //Doubles are for floating point numbers like 3.14159265. We will use double rather than float almost exclusively, because they are far more precise.

      boolean bool = true;
      //A boolean represents one of two values: true or false.


      char singleCharacter = 'A';

      //The char data type is used to store a single character, like '$' or 'A'.
      
      String multipleCharacters = "ABC";
      //Holds Multiple Characters
  }
}

String a = new String( "Dojo" );
System.out.println( a.equals("Dojo") );
// this actually will print out `true`

//STRINGS 
    //Length
public class StringDemo {
      public static void main(String[] args) {
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length(); //need the ()
        System.out.println( "String Length is : " + length );
      }
}

//Concatenate: A String method that allows two strings to be squashed together. Since each string is immutable, this results in a brand new string.

String string1 = "My name is ";
String string2 = "Michael";
String string3 = string1.concat(string2);
System.out.println(string3);
// will output My name is Michael.  OR

String ninja = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
System.out.println(ninja);
// Will print out Hi Jack, you owe me $25.00 !
// Where %s is expecting a string
// And %.2f is expecting a float data type. The value 2 will just place two values to right of the decimal point.

//indexOf()-IndexOf: The indexOf method searches left-to-right inside the given string for a "target" string. The indexOf() method returns the index number where the target string is first found or -1 if the target is not found.

String ninja = "Welcome to Coding Dojo!";
int a = ninja.indexOf("Coding"); class="operator from-rainbow">// a is 11
int b = ninja.indexOf("co"); // b is 3
int c = ninja.indexOf("pizza"); ="operator from-rainbow">// c is -1, "pizza" is not found

//trim()- removes any trailing or leading white spaces from the string.
String sentence = "   spaces everywhere!   ";
System.out.println(sentence.trim())

//Uppercase and Lowercase: The String class provides methods to lowercase and uppercase strings.
String a = "HELLO";
String b = "world";
System.out.println(a.toLowerCase()); // hello
System.out.println(b.toUpperCase()); // WORLD

//Equality: We can compare the equality of a string in two ways. Do they refer to the exact same object, or do they have the same exact sequence of characters.

String a = new String("word");
String b = new String("word");
System.out.println(a == b); // false. not the same exact object.
System.out.println(a.equals(b)); // true. same exact characters.

//ARRAYS
  //adding in seperate steps
int[] numbers;           // Variable Declaration
numbers = new int[5];    // Initialization
numbers[0] = 4;          // Setting the value at index 0 to 4 (the default value was 0)
numbers[1] = 8;
numbers[2] = 8;
numbers[3] = 5;
numbers[4] = 9;
//Adding all at once
String[] snacks = {
    "Almonds",
    "Carrots",
    "Pretzels",
    "Yogurt"
};
//Must print with Join() method
System.out.println( String.join(", ", snacks) );
// this should print out something like
// Almonds, Carrots, Pretzels, Yogurt

//ArrayList-used to add a larger array
import java.util.ArrayList; // we need to include this line at the top of the file
    
ArrayList<Integer> myArray = new ArrayList<Integer>();



import java.util.ArrayList;
ArrayList<Object> list = new ArrayList<Object>();
list.add(10);
list.add("Hello");
list.add(new ArrayList<Integer>());
list.add(new Double(12.0)); // adding a Double of value 12.0
        
System.out.println(list); // [10, "Hello", [], 12.0]













