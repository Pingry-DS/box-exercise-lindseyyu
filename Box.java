//The <T> is a generic type 

public class Box<T> {

  private T contents;
  private boolean isFull;

  // Make a new empty box
  public Box(){
    super();
    this.isFull = false;
  }

  // Make a new box pre-filled with contents
  public Box( T contents) {
    super(); 
    this.isFull =  true;
    this.contents = contents;
  }

  /**
   * Check the contents of the box
   */
  public T getContents(){
    return contents;
  }

  /**
   * Tell whether the box is full or not
   */
  public boolean isFull(){
    return this.isFull;
  }

  /**
   * Empty out the box, and give back hatever was in it
   */
  public T empty(){
      T junk = contents;
      contents = null;
      isFull = false; 
      return junk;

  }

  public String toString(){
    if (isFull)
      return contents.toString();
    else
      return "Is Empty";
  }

  public static void main(String[] args){

    // Make two boxes
    Box<String> stringBox = new Box<String>();
    //TODO start the second box with contents inside
    Box<Integer> intBox   = new Box<Integer>();

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Add something to a box



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Empty a boxes



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
