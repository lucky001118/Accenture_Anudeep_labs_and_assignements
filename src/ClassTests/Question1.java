package ClassTests;

/*
User Registration with WeakPasswordException
Task:
Create a custom exception class WeakPasswordException.
Write a UserRegistration class that checks the strength of a password.
If the password does not meet certain criteria (e.g., at least 8 characters, contains a number and a special character), throw the custom exception.
Test the class with both valid and invalid passwords.
These questions will help students get hands-on experience with creating, throwing, and handling custom exceptions in Java.
 */
public class Question1 {

        // Method to check password strength
        public void registerUser(String username, String password) throws WeakPasswordException {
            if (!isStrongPassword(password)) {
                throw new WeakPasswordException("Password is weak. It must be at least 8 characters long, contain at least one number, and one special character.");
            }
            System.out.println("User registered successfully: " + username);
        }

        // Helper method to validate password
        private boolean isStrongPassword(String password) {
            if (password.length() < 8) {
                return false;
            }
            // Password must contain at least one numeric character (\d).
            boolean hasNumber = password.matches(".*\\d.*");
            // Password must contain at least one special character from the set [!@#$%^&*(),.?\":{}|<>].
            boolean hasSpecialChar = password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");
            return hasNumber && hasSpecialChar;
        }

        public static void main(String[] args) {
            Question1 userRegistration = new Question1();
            try {
                // Test cases
                userRegistration.registerUser("JohnDoe", "password123!"); // Valid password
                userRegistration.registerUser("JaneDoe", "weakpass");    // Weak password
            } catch (WeakPasswordException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }

    }
