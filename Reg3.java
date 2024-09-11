// Extract all the digits from a string.

public class Reg3 {
    // Method to extract all digits from a string
    public static String extractDigits(String input) {
        // Use replaceAll to remove all non-digit characters
        return input.replaceAll("\\D", "");  // \D matches any non-digit character
    }

    public static void main(String[] args) {
        // Test strings
        String[] testStrings = {
            "abc123xyz", 
            "phone: 555-1234",
            "No digits here!",
            "Digits: 9876543210"
        };

        for (String test : testStrings) {
            String extractedDigits = extractDigits(test);
            System.out.println("Input: \"" + test + "\"");
            System.out.println("Extracted Digits: " + extractedDigits);
            System.out.println();
        }
    }
}

