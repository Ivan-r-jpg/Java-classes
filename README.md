# Classes, Arrays, and Maven

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)

This repository contains a project demonstrating the use of basic Object-Oriented Programming (OOP) principles in Java, exception handling, working with object arrays, and configuring the Maven build system.

## Author Information
- **Student:** Ivan Orekhov
- **Group:** IN-41/1
- **University:** Sumy State University (SumDU)

## Goals and Objectives
Create a console application for the `Clothes` domain area, implementing:
1. Field encapsulation and check delegation in the constructor.
2. Input data validation (protection against `null` and negative values).
3. Overriding `toString()` and `equals()` methods.
4. Safe user input via `Scanner` using `try-catch` blocks and `while` loops.
5. Project build and management using Maven.

## Main Features
- **`Clothes` class:** Contains clothing attributes (brand, material, size, price).
- **Strict validation:** Uses `Objects.requireNonNull()` and checks text via `trim().isEmpty()` to avoid empty values. Throws an `IllegalArgumentException` when attempting to set a negative price.
- **Fault-tolerant interface:** In the `Main` class, the program does not crash when text is entered instead of a number (`NumberFormatException`), but correctly reports the error and prompts the user to repeat the input for the specific item.

## 🛠 Project Structure
The project follows the standard Maven architecture:
```text
📦 oop-work
 ┣ 📂 src
 ┃ ┗ 📂 main
 ┃   ┗ 📂 java
 ┃     ┗ 📂 org
 ┃       ┗ 📂 example
 ┃         ┣ 📜 Clothes.java
 ┃         ┗ 📜 Main.java
 ┣ 📜 .gitignore
 ┗ 📜 pom.xml
