public class P35 {
    
   public static void main(String[] args) {
        
      // Create two objects to compare
      Person person1 = new Person("Alice", 25);
      Person person2 = new Person("Bob", 30);
        
      // Compare the two objects
      boolean areEqual = person1.equals(person2);
      System.out.println("Are the two objects equal? " + areEqual);
   }
}

class Person {
    
   private String name;
   private int age;
    
   public Person(String name, int age) {
      this.name = name;
      this.age = age;
   }
    
   @Override
   public boolean equals(Object obj) {
      if (obj == null) return false;
      if (!(obj instanceof Person)) return false;
      Person otherPerson = (Person) obj;
      return this.name.equals(otherPerson.name) && this.age == otherPerson.age;
   }
}