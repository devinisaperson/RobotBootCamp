public class Day3 {
    public static void main(String[] args) {
        int thisCanChange = 42;
        final String THIS_CANNOT_CHANGE = "The answer to the Great Question of Life, the Universe and Everything... is... ";
        System.out.print(THIS_CANNOT_CHANGE + thisCanChange);

        try {
            thisCanChange = -42;
            System.out.println("This code has run without issue, as expected.");
        } catch (Exception e) {
            System.out.println("Something has gone very wrong.");
        }

        //THIS_CANNOT_CHANGE = "You've met with a terrible fate, haven't you?";
        //The above code will refuse to even compile

        int x = 0;
        int y = 0;
        x++;
        y--;
        int z = x+y;
        System.out.println(z);
    }
}
