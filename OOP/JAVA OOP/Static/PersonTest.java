public class PersonTest{
  public static void main(String[] args){
    Person person1 = new Person(10, "Nick");
    Person person2 = new Person(15,"John");
    Person person3 = new Person(12,"Mike");

    System.out.println(Person.peopleCount());
  }
}