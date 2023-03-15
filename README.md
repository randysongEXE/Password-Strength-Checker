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

