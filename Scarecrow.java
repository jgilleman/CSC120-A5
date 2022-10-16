/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22)) + Janna Gilleman
 * @version 10 15 22
 */

class Scarecrow {

    /* Parts of the Scarecrow
     * @param n/a
     * @return n/a
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    //private Hat hat;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    private String message;

    /* Constructor. intialize parts of scarecrow (in order)
     * @param banner Strings: ASCII art
     * @param h Strings: ASCII art pumpkin head
     * @param b Strings: ASCII art shirt
     * @param l Strings: ASCII art pants
     * @param lbt Strings: ASCII art left boot
     * @param rbt Strings: ASCII art right boot
     * @return sign, head, body, legs, leftFoot, rightFoot
     */
    public Scarecrow(Banner banner, Pumpkin h, Shirt b, Pants l, Boot lbt, Boot rbt) {
        sign = banner;
        head = h;
        body = b;
        legs = l;
        leftFoot = lbt;
        rightFoot = rbt;
    }

    /* Displays the Scarecrow 
     * @param n/a
     * @return ASCII scarecrow
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        Scarecrow myScarecrow = new Scarecrow(new Banner("Get off my lawn!"), new Pumpkin(), new Shirt(), new Pants(), new Boot("left"),new Boot("right"));

        // If a message was passed in on the command line, extract and store it
       if (args.length > 0) {
           myScarecrow.message = args[0];
           System.out.println("-->" + args[0] + "<--");
        }
        else{
            System.out.println("Nothing found in command line. Proceed as usual.\n");
        }

        myScarecrow.display();
    }

}
