/*
// Create a Main class
public class Main {
    int x;  // Create a class attribute
  
    // Create a class constructor for the Main class
    public Main() {
      x = 5;  // Set the initial value for the class attribute x
    }
  
    public static void main(String[] args) {
      Main myObj = new Main(); // Create an object of class Main (This will call the constructor)
      System.out.println(myObj.x); // Print the value of x
    }
  }
  
  // Outputs 5
  */

  /*
  public class Main {
    int x;
  
    public Main(int y) {
      x = y;
    }
  
    public static void main(String[] args) {
      Main myObj = new Main(5);
      System.out.println(myObj.x);
    }
  }
  
  // Outputs 5
*/

  public class Main {
    int modelYear;
    String modelName;
  
    public Main(int year, String name) {
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) {
      Main myCar = new Main(1969, "Mustang");
      System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
  }
  
  // Outputs 1969 Mustang