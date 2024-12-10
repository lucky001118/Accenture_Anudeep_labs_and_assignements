package ClassTests.solutionFromSir;

import ClassTests.WeakPasswordException;

public class UserRegistration {

    public void registerUser(String username, String password) throws WeakPasswordException {
        if (!isValidPassword(password)) {
            throw new WeakPasswordException("Password is too weak. It must be at least 8 characters long, " +
                    "contain at least one number, and one special character.");
        }
        System.out.println("User " + username + " registered successfully!");
    }

    private boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        String specialCharacters = "!@#$%^&*(),.?\":{}|<>";

        for (char ch : password.toCharArray()) {
            // isDigit checks the array has digit then return true else false
            if (Character.isDigit(ch)) {
                hasDigit = true;

            } else if (specialCharacters.indexOf(ch) != -1) {  //specialCharacters.indexOf(ch) != -1
                hasSpecialChar = true;
            }

            // If both conditions are met, we can return true early
            if (hasDigit && hasSpecialChar) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();

        // Test Cases
        try {
            registration.registerUser("Alice", "password123");
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }

        try {
            registration.registerUser("Bob", "Pass@123");
        } catch (WeakPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}