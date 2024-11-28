public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        // Check length
        if (password.length() < 5 || password.length() > 12) {
            return false;
        }

        boolean hasLower = false;
        boolean hasDigit = false;

        // Check for lowercase letters, digits, and invalid characters
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c) || !Character.isLetterOrDigit(c)) {
                return false; // Invalid character found
            }
        }

        // Check for at least one lowercase and one digit
        if (!hasLower || !hasDigit) {
            return false;
        }

        // Check for immediate repeated patterns
        for (int i = 0; i < password.length() - 1; i++) {
            if (password.charAt(i) == password.charAt(i + 1)) {
                return false; // Immediate repeated character found
            }
        }

        // Check for patterns of length 2 or more
        for (int i = 0; i < password.length() - 2; i++) {
            String pattern = password.substring(i, i + 2);
            if (password.indexOf(pattern, i + 2) != -1) {
                return false; // Immediate repeated pattern found
            }
        }

        return true; // Password is valid
    }

    public static void main(String[] args) {
        // Test cases
        String[] testPasswords = {
            "abcanan1", // Invalid: immediate pattern "an"
            "abc11se",  // Invalid: immediate pattern "11"
            "123sd123", // Valid
            "adfasdsdf", // Invalid: no digits
            "Aasdfasd12", // Invalid: has uppercase
            "abcde1",   // Valid
            "abcdefg1", // Valid
            "aa1bb"     // Invalid: immediate pattern "aa"
        };

        for (String password : testPasswords) {
            System.out.println("Password: " + password + " - Valid: " + isValidPassword(password));
        }
    }
}