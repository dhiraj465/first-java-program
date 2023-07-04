class String_methods {
    public static void main(String[] args) {
        String name = "Dhiraj";
        int value = name.length(); // calculate length
        System.out.println(value);

        String lstring = name.toLowerCase(); // for lowercase
        System.out.println(lstring);

        String ustring = name.toUpperCase(); // for uppercase
        System.out.println(ustring);

        String nonTrimmedString = "    DHIRAJ    ";
        System.out.println(nonTrimmedString); // Trimmed string for remove spaces..use trim
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(1, 4)); // wrote bwtn them

        System.out.println(name.replace("D", "Z"));
        System.out.println(name.replace("D", "ABC")); // tareget and replacement replace

        System.out.println(name.startsWith("Dhi")); // check boolean true or false
        System.out.println(name.endsWith("Dhi"));

        System.out.println(name.charAt(1)); // write character

        // String modifiedName = "DhirajKumar";
        // System.out.println(modifiedName("Kumar"));

        System.out.println(name.equalsIgnoreCase("Dhiraj"));
    }
}