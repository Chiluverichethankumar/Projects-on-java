# Projects-on-java

1 Projects:

Topic of the project: Calculator
  Documentation:
Calculator:
The Calculator program is designed to perform a variety of mathematical operations based on user input. It utilizes the Scanner class to read user input from the console.
User Input:
1.	The program prompts the user to enter the first number.
2.	The user enters a numeric value, which is stored in the variable num1.
3.	The program prompts the user to enter the second number.
4.	The user enters a numeric value, which is stored in the variable num2.
5.	The program displays a menu of available operations.
Available Operations:
1.	Addition (+): Adds num1 and num2 and displays the result.
2.	Subtraction (-): Subtracts num2 from num1 and displays the result.
3.	Multiplication (*): Multiplies num1 and num2 and displays the result.
4.	Division (/): Divides num1 by num2 and displays the result. If num2 is zero, it displays an error message.
5.	Modulo (%): Computes the remainder of num1 divided by num2 and displays the result. If num2 is zero, it displays an error message.
6.	Square root of the first number (√): Calculates the square root of num1 and displays the result.
7.	Square of the first number (^2): Computes the square of num1 and displays the result.
8.	Cube of the first number (^3): Computes the cube of num1 and displays the result.
9.	Raise the first number to the power of the second number (a^b): Calculates num1 raised to the power of num2 and displays the result.
10.	Calculate the average of the two numbers: Computes the average of num1 and num2 and displays the result.
11.	Log Value: Calculates the natural logarithm of num1 and displays the result.
12.	Exponential Logarithm: Computes various trigonometric values for num1 and displays the results.
Trigonometric Values:
If the user selects option 12 (Exponential Logarithm), the program calculates and displays the following trigonometric values for num1:
•	Sine
•	Cosine
•	Tangent
•	Cotangent
•	Secant
•	Cosecant
Output:
After performing the selected operation, the program displays the result or any error messages that may occur.
Summary:
The Calculator program allows users to perform various mathematical operations on two input numbers. It supports basic arithmetic operations, square roots, powers, logarithms, and trigonometric calculations. It provides a menu-based interface and utilizes the Scanner class for user input. The program displays the calculated results or appropriate error messages based on the user's choices.
Code and Outputs Photos:


2. Projects:


Topic of the project: Password Generator Code
      Document for the Password Generator Code:
This document provides an overview and explanation of the code for a Password Generator program. The code is written in Java and consists of several classes that work together to generate random passwords and evaluate their strength.
1.Generator Class:
This class represents the main functionality of the Password Generator program.
It contains a main method that initializes the program and starts the main loop.
The main loop displays a menu of options and prompts the user to choose an option until they select the "Quit" option.
Available options include generating a password, checking password strength, displaying useful information, and quitting the program.
The class also includes methods to generate passwords, print useful information, and handle user input.
2.Password Class:
This class represents a password and provides methods to calculate its strength and provide a score.
The class takes a password string as input and calculates the strength based on various criteria, such as the presence of uppercase letters, lowercase letters, numbers, and symbols.
The PasswordStrength method calculates the score of the password based on these criteria and returns an integer value.
The calculateScore method uses the score to provide a description of the password's strength, ranging from very good to weak.
3.Alphabet Class:
This class represents the character pool for generating passwords.
It contains constant strings for uppercase letters, lowercase letters, numbers, and symbols.
The class allows the user to customize the character pool by including or excluding different types of characters when generating passwords.
4.GeneratorTest Class:
This class contains JUnit tests to verify the functionality of the Generator, Password, and Alphabet classes.
The tests validate the correctness of password creation, alphabet customization, and other functionalities.
5.Main Class:
•	This class serves as the entry point of the program.
•	It creates an instance of the Generator class and starts the main loop.


Overall, the Password Generator program provides a user-friendly interface to generate random passwords based on user preferences and evaluate their strength. It follows password security best practices by encouraging the use of a variety of character types and avoiding common password pitfalls. The code is modular and well-structured, allowing for easy maintenance and extensibility.

