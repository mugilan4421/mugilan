package task1;

public class encap {
	   private String name;

	   // Getter
	   public String getName() {
	     return name;
	   }

	   // Setter
	   public void setName(String newName) {
	     this.name = newName;
	   }
	   public static void main (String args[]) {
		    encap myObj = new encap();
		    myObj.setName("mugilan");
		    System.out.println(myObj.getName());
		  }
		}

	                