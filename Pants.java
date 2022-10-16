/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Janna Gilleman
 * @version 10 15 22
 */
public class Pants {

    /*
     * Method. Print ASCII Art Pants
     * @param n/a
     * @return Ascii pants
     */
    public void display() {
        System.out.println("        ---------------");
        System.out.println("        |              |");
        System.out.println("        |     ___      |");
        System.out.println("        |      |       |");
        System.out.println("        |      |       |");
        System.out.println("        |      |       |");
        System.out.println("        |      |       |");
        System.out.println("        |______|_______|");
    }

    /* main method (for testing) */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
