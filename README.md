# PasswordStrengthChecker

This application takes in a user-inputted password and checks its strength. More specifically, several different factors are checked to identify a strong password:
- the password's length should be 8 characters or longer
- the password should contain a uppercase character
- the password should contain a lowercase character
- the password should contain a digit
- the password should contain a special character

On the other hand, this application also takes into account two kinds of "checks" that can potentially crack the inputted password, those being:
- Dictionary check
- Brute force check


Both checks are types of attacks that can be used to crack a password: 
- Dictionary checks involves an algorithm running a list of known words (i.e a "dictionary) to try and guess the password. However, this isn't completely reliable because the password may not contain a common word or a combination of common words. Generally, a longer list of words require more powerful computers to run efficiently.
- Brute force checks involve an algorithm running every possible combination of characters until the correct password is guessed. Although this method is generally reliable, it can be highly time-consuming and require more powerful computers.


In this example, a sample "dictionary.txt" file is included. It contains 500 common English words, which the application takes in and checks. 
Regardless of the password complexity or length, if either of these checks pass against the inputted password, the application will see the input as a weak password. However, the brute-force check will almost certaintly pass against any inputted password, as it will run every possible combination of characters. Still, if there is no output, that is an indication that the inputted password is strong.

It is also important to note that, in the real world, hackers may have access to more powerful and efficient computers that have the capability to run a brute-force attack efficiently, and also a dictionary-check attack with a longer list of words far larger than 500.

