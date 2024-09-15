# Java Test Solutions

This repository contains the solutions for the Java test provided by Analytic-Company GmbH.

## 1. Regular Expressions

### Problem Statement:
Define a regular expression that matches the phrases:
- "damage"
- "minor damages"
- "heavy damage"

But not the phrase "no damages".

### Solution:
The `RegexTest` class defines a regular expression to match the specified phrases while excluding "no damages".

- **Regular Expression Used:** `^(damage|minor damages|heavy damage)$`

### Code Explanation:
- The `isMatch` method takes a string as an argument and checks if it matches the regular expression. It returns `true` if the string matches any of the valid phrases and `false` otherwise.
- This method is tested with sample inputs in the `main` method.

## 2. Objects

### Problem Statement:
Define a `Student` class with reference variables `studentId` and `name`, and create a method that reads student data from a CSV file, sorts the students by name, and prints their IDs and names.

### Solution:
The `Student` class defines two reference variables: `studentId` and `name`. It uses a constructor to initialize these variables and a `toString` method to format the output.

### Code Explanation:
- The `Student` class reads the `students.csv` file using `BufferedReader`.
- Each line from the CSV is parsed into a `Student` object and added to a list.
- The list of students is sorted by name using `Collections.sort` with a custom comparator.
- The sorted list is printed to the console.

## 3. Design Patterns

### Problem Statement:
Explain the Singleton and Dependency Injection design patterns, and provide examples of each.

### Singleton Pattern

**Definition:**
The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.

**Usage:**
It is used when you need exactly one instance of a class to coordinate actions across the system, such as a configuration manager, logger, or database connection pool.

**Example:**
The `Singleton` class demonstrates the Singleton pattern by creating a single instance of the class that can be accessed globally.

### Code Explanation:
- A private static variable holds the single instance.
- The constructor is private to prevent direct instantiation.
- The `getInstance` method checks if the instance exists; if not, it creates one. This ensures that only one instance of the class is ever created.

### Dependency Injection

**Definition:**
Dependency Injection (DI) is a design pattern that allows the creation of dependent objects outside of a class and provides those objects to a class in various ways (e.g., through a constructor, a setter method, or an interface).

**Usage:**
It is used to promote loose coupling and enhance testability by injecting the dependencies into the class from an external source rather than creating them within the class.

**Example:**
The `Consumer` class demonstrates Dependency Injection by accepting a `Service` object through its constructor.

### Code Explanation:
- The `Service` class provides a method `serve` which is used by the `Consumer` class.
- The `Consumer` class receives an instance of `Service` through its constructor, making it loosely coupled and easier to test.

## 4. Inheritance

### Problem Statement:
Create a subclass `Clothing` that extends the `Product` class, adding new attributes for size and material.

### Solution:
The `Clothing` class extends the `Product` class by adding two new attributes: `size` (an integer) and `material` (a string).

### Code Explanation:
- The `Clothing` class inherits from `Product` and adds additional attributes for size and material.
- The constructor initializes all attributes, including those inherited from the `Product` class.
- The `toString` method is overridden to include the new attributes in the output.

## 5. Threads

### Problem Statement:
Create two thread classes, `HorizontalThread` and `VerticalThread`, to simulate the movement of a robot in different directions.

### Solution:
The `HorizontalThread` class handles the robot's left and right movement, while the `VerticalThread` class handles forward and backward movement.

### Code Explanation:
- Both classes extend `Thread` and override the `run` method to print the robot's movements.
- The `Robot` class starts both threads to simulate concurrent movement.

## 6. Code Correction

### Problem Statement:
Identify and correct the errors in the `carThread` class.

### Solution:
The corrected version of the `carThread` class ensures that it properly implements the `Runnable` interface and correctly creates and starts threads.

### Code Explanation:
- The `carThread` class is renamed to `CarThread` and correctly implements the `Runnable` interface.
- The `run` method is fixed to properly reference the `brand` variable and handle exceptions.

## 7. Bonus

### Problem Statement:
Write a method with a single boolean parameter that returns "a", "b", or "c" depending on the parameter's value.

### Solution:
The `BonusMethod` class contains a method `chooseOption` that uses the boolean parameter to return different values.

### Code Explanation:
- If the parameter is `true`, it returns "a"; otherwise, it returns "b".
- This demonstrates simple conditional logic in Java.

## Conclusion

Each part of the test has been implemented in the corresponding Java class file. The solutions are designed to be simple, efficient, and easy to understand.

Please refer to the individual Java files in this repository for the full code.
