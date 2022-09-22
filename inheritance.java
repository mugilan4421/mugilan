
package task1;

public class inheritance {
	  protected String brand = "Ford";        // Vehicle attribute
	  public void honk() {                    // Vehicle method
	    System.out.println("Tuut, tuut!");
	  }
	}
	class Car extends inheritance  {
	  private String modelName = "Mustang";    // Car attribute
	  public static void main(String[] args) {

	    Car myCar = new Car();

	    myCar.honk();
	    System.out.println(myCar.brand + " " + myCar.modelName);
	  }
	}


