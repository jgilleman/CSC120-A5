/*
 * Boot class (template)
  * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Janna Gilleman
 * @version 10 15 22
 */
public class Boot {
  
    private String direction;
  
    /* Constructor makes direction 
     * @param direction String: left or right
     * @return n/a
    */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * Method. Print ASCII Art Boot
     * @param direction String: chooses which boot to print
     * @return ASCII boot
     */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.print("        |_____|");
        } else if (this.direction.equals("right")) {
          System.out.println(" |_____|");
         
        } else {
          System.out.println("Which boot?");
        }
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
