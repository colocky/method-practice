public class Format {
    // main
    public static void main(String[] args) {
        String formattedName = formatName("John", "Jones");
        System.out.println(formattedName);
    }

    // method to create the format
    public static String formatName(String first, String last) {
        return String.format("%s, %s", last, first);
    }
}


