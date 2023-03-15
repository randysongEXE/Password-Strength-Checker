public class BruteForceCheck {

    //this variable stores every type of character
    private static final String CHARACTER_SET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()_+-=[]{}\\|;:'\",.<>/?";
    private static final int MAX_LENGTH = 20;

    //This method builds a randomly generated password based off of the character bank and compares it to the inputted password.
    public boolean bruteForceCheck(String password) {
        for (int length = 1; length <= MAX_LENGTH; length++) {
            long numCombinations = (long) Math.pow(CHARACTER_SET.length(), length);
            for (long i = 0; i < numCombinations; i++) {
                StringBuilder guess = new StringBuilder();
                long remaining = i;
                for (int j = 0; j < length; j++) {
                    guess.append(CHARACTER_SET.charAt((int) (remaining % CHARACTER_SET.length())));
                    remaining /= CHARACTER_SET.length();
                }
                if (password.equals(guess.toString())) {
                    return true;
                }
            }
        }
        return false;
    }

}
