package task1;

class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class cat extends Animal {
  public void animalSound() {
    System.out.println("The cat says: meow meow");
  }
}

class lion extends Animal {
  public void animalSound() {
    System.out.println("The lion says:roars moans");
  }
}

class polymorphism {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal mycat = new cat();
    Animal mylion = new lion();
        
    myAnimal.animalSound();
    mylion.animalSound();
    mycat.animalSound();
  }
}



