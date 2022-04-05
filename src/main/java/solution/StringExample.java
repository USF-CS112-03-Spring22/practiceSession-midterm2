package solution;

public class StringExample {
    /**
     * Takes the string as a parameter and splits it into words using a comma as a delimeter.
     * Prints each word to the console on a separate line. See Canvas for an example.
     *
     * @param string
     */
    public static void splitText(String string) {
        String[] words = string.split(",");
        for (String word: words) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String text = "spring,summer,fall,winter";
        splitText(text);
		/* Should print:
		spring
		summer
		fall
		winter

		*/
    }
}
