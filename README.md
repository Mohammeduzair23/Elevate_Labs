# Java Calculator

A simple console-based calculator built using **Java**. This project performs basic arithmetic operations and demonstrates fundamental Java concepts such as methods, `switch` statements, user input handling, and error handling.

## Features

* Addition (`+`)
* Subtraction (`-`)
* Multiplication (`*`)
* Division (`/`)
* Modulus (`%`)
* Supports decimal numbers using `double`
* Handles division by zero
* Simple command-line interface
* Uses separate methods for each arithmetic operation

## Technologies Used

* **Java**
* **Java Scanner** for user input

## Project Structure

```text
Elevate_Labs/
└── T1_Calculator.java
```

## How It Works

The program asks the user to enter:

1. First number
2. Arithmetic operator
3. Second number

It then uses a `switch` statement to determine which operation to perform.

### Example

```text
Enter first number: 20
Enter operator (+, -, *, /, %): *
Enter second number: 5

Result: 100.0
```

### Another Example

```text
Enter first number: 10
Enter operator (+, -, *, /, %): /
Enter second number: 4

Result: 2.5
```

## Error Handling

The calculator prevents division or modulus operations when the second number is zero.

```text
Enter first number: 10
Enter operator (+, -, *, /, %): /
Enter second number: 0

Error: Cannot divide by zero.
```

It also handles invalid operators:

```text
Enter first number: 10
Enter operator (+, -, *, /, %): &
Enter second number: 5

Invalid operator.
```

## How to Run

### 1. Clone the repository

```bash
git clone <your-repository-url>
```

### 2. Navigate to the project directory

```bash
cd Elevate_Labs
```

### 3. Compile the Java program

```bash
javac T1_Calculator.java
```

### 4. Run the program

```bash
java T1_Calculator
```

## Java Concepts Practiced

This project is designed as a beginner Java exercise and covers:

* Classes and objects
* `main()` method
* `Scanner`
* Variables and data types
* Methods
* Method parameters and return values
* `switch` statements
* Conditional statements
* Character input
* `double` data type
* Error handling
* Basic program structure

## Future Improvements

Possible improvements for future versions:

* Add a loop to perform multiple calculations without restarting the program
* Add a menu-based interface
* Add calculation history
* Add support for advanced mathematical operations
* Add input validation for invalid data types
* Build a GUI version using JavaFX

## Author

**Mohammed Uzair**

This project was created as part of my Java programming practice to strengthen fundamentals and improve problem-solving skills.
