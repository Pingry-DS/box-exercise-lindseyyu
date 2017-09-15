/**
* Represents a Box Class, in which we can store different types of contents
*/  

public class Box<T> {

  private T contents;
  private boolean isFull;

/**
* Primary box constructor, takes no arguments
*/
  public Box(){
    super();
    this.isFull = false;
  }

/**
* Box constructor with given contents
* @param contents The contents to be put in box 
*/ 
  public Box( T contents) {
    super(); 
    this.isFull =  true;
    this.contents = contents;
  }

  /**
   *  Checks and returns the contents of the box
   * @return the contents of the box 
   */
  public T getContents(){
    return this.contents;
  }

  /**
   * Tests whether the box is full or not 
   * @return whether the box is full or not (true or false)
   */
  public boolean isFull(){
    return this.isFull;
  }

  /**
   * Empty out the box, and gives back the contents that were in in it (if possible) 
   * @return the contents in it before emptying 
   */
  public T empty(){
      T junk = contents;
      contents = null;
      isFull = false; 
      return junk;
  }
  /**
  * Fills box with object of choice
  * @return whether it was possible or not to fill the box 
  */ 
  public boolean store(T contents) { 
    if (!isFull) {
      this.contents = contents;
      isFull = true; }
    return isFull;
  }
  
  /** 
  * Returns a string representation of the contents 
  * @return the string 
  */ 

  public String toString(){
    if (isFull)
      return contents.toString();
    else
      return "No contents";
  }

  /** 
  * Main method, tests previous methods and creates boxes!
  */ 

  public static void main(String[] args){

    //Make empty String box 
    Box<String> stringBox = new Box<String>();
    //Make full Integer box 
    Box<Integer> intBox   = new Box<Integer>(18);


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    stringBox.store("Puppy");



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
    
    //Test "peek" method
    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox.getContents() + ", " + intBox.getContents());

    stringBox.empty();
    intBox.empty();


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);


    //For fun, I'm just testing what happens when you store boxes inside of boxes 

    Box<Double> doubBox = new Box<Double>(18.18);
    Box<Box> boxBox = new Box<Box>(doubBox);
    Box<Box> boxBox2 = new Box<Box>(boxBox);

    System.out.println("This box contains " +  boxBox2); //Adding shell of box around a shell of box of box of double, just adopts double into contents

}



}
