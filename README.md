# Phonebook Program

This program is a simple Java console application that allows users to create and display a phonebook. Users can input multiple entries in the format `name: phone number`, and the program will store and display these entries in an organized way.

## Features
- Allows the user to specify the number of phonebook entries.
- Accepts input in the format `name: phone number`.
- Validates user input to ensure proper formatting.
- Displays the phonebook in a clean and organized format.

## Requirements
- Java Development Kit (JDK) version 8 or higher.
- An Integrated Development Environment (IDE) such as IntelliJ IDEA, Eclipse, or a simple terminal with `javac` and `java` commands.

## How to Run
1. Clone or download the project source code.
2. Open the source code in your IDE or terminal.
3. Compile the program:
   ```bash
   javac Main.java
   ```
4. Run the program:
   ```bash
   java Main
   ```

## Usage
1. **Specify the number of entries:**
   The program prompts the user to enter the number of phone numbers they wish to input.

2. **Input phonebook entries:**
   For each entry, input the data in the format `name: phone number`. For example:
   ```
   John Doe: 123456789
   Alice Smith: 987654321
   ```

3. **View the phonebook:**
   Once all entries are added, the program displays the phonebook in an organized format:
   ```
   Here is your phonebook:
   Name: John Doe, Phone Number: 123456789
   Name: Alice Smith, Phone Number: 987654321
   ```

## Input Validation
- The program checks that each entry contains a colon (`:`) to separate the name and phone number.
- If the input format is incorrect, the program prompts the user to re-enter the data.

## Example Output
```
Enter the amount of phone numbers: 2
Enter the numbers under format (name: phone number): John Doe: 123456789
Enter the numbers under format (name: phone number): Alice Smith: 987654321

Here is your phonebook:
Name: John Doe, Phone Number: 123456789
Name: Alice Smith, Phone Number: 987654321
```

## Enhancements
You can extend the functionality of this program by:
- Adding functionality to edit or delete phonebook entries.
- Saving the phonebook to a file for later use.
- Adding more robust validation (e.g., checking for valid phone number formats).
- Implementing a graphical user interface (GUI).

## License
This project is open-source and free to use. You can modify and distribute it as needed.