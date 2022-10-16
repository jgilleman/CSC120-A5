/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Janna Gilleman
 * @version 10 15 22
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;
    int l;

    /* Constructor passes in message when new Banner is made
     * @param m String: message
     * @return n/a
    */
    public Banner(String m) {
        this.message = m;
        l = this.message.length();
    }

    /*
     * Print a decorative banner, resized to fit the message
     * @param l Int: length of message
     * @return decorative banner
     */
    public void display() {
        System.out.print("  ");
        for (int i=0; i<l+4; i++){
            System.out.print("*");
        }
        System.out.println("  ");
        System.out.println("  * " + this.message + " *");
        System.out.print("  ");
        for (int i=0; i<l+4; i++){
            System.out.print("*");
        }
        System.out.println("  ");
        for (int i=0; i<l+4; i++){
            System.out.print(" ");
        }
        System.out.println("  *");
        for (int i=0; i<l+4; i++){
            System.out.print(" ");
        }
        System.out.println("   *");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}
