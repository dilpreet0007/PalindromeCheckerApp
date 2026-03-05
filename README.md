## 🌀 Palindrome Checker App
A Java console-based application that validates whether a given string is a palindrome under multiple conditions.
This project was designed to strengthen core programming fundamentals, explore data structures, and practice object-oriented design patterns.

📖 Overview
The Palindrome Checker App is built around 13 use cases, each demonstrating a different approach to palindrome validation.
From simple string reversal to advanced techniques like recursion, linked lists, and the Strategy Design Pattern, this project showcases how the same problem can be solved in diverse ways.

🚀 Use Cases Implemented
🔹 UC1: Application Entry
Displays welcome message and app details at startup.

Establishes clear startup flow.

🔹 UC2: Hardcoded Palindrome Result
Validates a predefined string.

Introduces basic comparison logic.

🔹 UC3: Reverse String Based Check
Reverses the string and compares with the original.

Demonstrates string immutability and concatenation.

🔹 UC4: Character Array Two-Pointer Check
Converts string to a char array.

Uses start and end pointers for efficient comparison.

🔹 UC5: Stack Based Check
Pushes characters into a stack (LIFO).

Pops them in reverse order to validate palindrome.

🔹 UC6: Queue + Stack Check
Demonstrates FIFO vs LIFO.

Compares queue dequeue with stack pop.

🔹 UC7: Deque Based Check
Uses Deque for front and rear comparisons.

Optimized bidirectional traversal.

🔹 UC8: Linked List Based Check
Stores characters in a linked list.

Compares ends using removeFirst() and removeLast().

🔹 UC9: Recursive Check
Uses recursion to compare characters from both ends.

Demonstrates divide-and-conquer logic.

🔹 UC10: Case-Insensitive & Space-Ignored Check
Normalizes input by removing spaces/symbols and converting to lowercase.

Example: "A man a plan a canal Panama" → Palindrome.

🔹 UC11: Object-Oriented Palindrome Service
Encapsulates palindrome logic in a service class.

Improves reusability and separation of concerns.

🔹 UC12: Strategy Pattern for Palindrome Algorithms
Defines a PalindromeStrategy interface.

🔹 UC13: Comparing time taken by different algorithms
Implements multiple strategies (Stack, Deque, etc.).
Allows dynamic selection of algorithm at runtime.
