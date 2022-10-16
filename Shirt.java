/*
 * Shirt class
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Janna Gilleman
 * @version 10 15 22
 */
public class Shirt {

    /* Method. print ASCII Art Shirt
     * @param n/a
     * @return ASCII shirt
     */
    public void display() {
        System.out.println("        ----|____|----");
        System.out.println("      / |             | \\");
        System.out.println("     /__|             |__\\");
        System.out.println("      | |             | |");
        System.out.println("      | |             | |");
        System.out.println("      | |----|--|-----| |");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
