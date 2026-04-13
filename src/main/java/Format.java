public class Format {
    public static void main(String[] args) {
        String formattedName = formatName("John", "Jones");
        System.out.println(formattedName);
    }

    public static String formatName(String first, String last) {
        return String.format("%s %s", last, first);
    }
}


