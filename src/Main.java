public class Main {

    //region UI style
    //https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE
    //endregion

    public static void main(String[] args) {

        System.out.println(RED_BOLD + "Printing super interesting tweets:");

        //Add your Group tweet classes and call your tweets:
        System.out.println( BLACK_BOLD + new GroupTweet().tweet() );

        GroupGenZ ggz = new GroupGenZ();
        System.out.println(PURPLE_BOLD+ggz.tweet());
        System.out.println(RED_BOLD+ggz.tweet());

        GroupTweet gt = new GroupTweet();
        System.out.println(YELLOW_BOLD+gt.tweet());

        
        GroupBoomer gb = new GroupBoomer();
        System.out.println(YELLOW_BOLD+gb.tweet());


        GroupGenAlpha gga = new GroupGenAlpha();
        System.out.println(PURPLE_BOLD+gga.tweet());


    }
}