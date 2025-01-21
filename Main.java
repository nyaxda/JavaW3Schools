public class Main { // name of java file must match the class name
    public static void main(String[] args) { // every program must contain the main method
        System.out.println("Hello World"); // each code statement must end with a semicolon
        System.out.println("I am learning Java");
        System.out.print("Hello World! "); // print() does not add a new line
        System.out.print("I will print on the same line");
        System.out.println(32); // numbers can be printed without quotes
        System.out.println(3.14);
        System.out.println('A'); // characters are enclosed in single quotes
        System.out.println(3 + 2); // expressions can be evaluated
        /* Multiline Comments are this way
        so that we can have multiple lines of comments
        */
        // type variableName = value - syntax for declaring Variables
        String name = "John"; // String is a data type
        System.out.println(name);
        int myNum = 15;
        System.out.println(myNum);

        // you can declare a variable without the value, then assign the value later
        int myNum2;
        myNum2 = 20;
        System.out.println(myNum2);

        // final keyword is used to declare a constant
        final int myNum3 = 25;
        // myNum3 = 30; - this will generate an error
        // Other datatypes: byte, short, long, float, double, boolean, char
        int myNum4 = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        // To print both text and a variable, use a + sign
        System.out.println("I am " + myNum4 + " years old");
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        // For numerical operators, + works as a numerical operator
        int x = 5;
        int y = 3;
        System.out.println(x + y); // 8

        // When declaring multiple variables, you can use a comma-separated list
        int x1 = 5, y1 = 6, z = 50;
        System.out.println(x1 + y1 + z); // 61

        // One value to multiple variables
        int x2, y2, z1;
        x2 = y2 = z1 = 50;
        System.out.println(x2 + y2 + z1); // 150

        // Data are divided into two groups: Primitive Data Types and Reference/Object Data Types
        // Primitive Data Types: byte, short, int, long, float, double, boolean, char'
        // Reference Data Types: String, Arrays, Classes
        // Primitive data types specifies the type of a variable and the kind of values it can hold       


        // Primitive numbers are divided into two groups: Integer types and Floating-point types
        // Integer types include byte, short, int, long
        // Floating-point types include float, double

        // Java Non-Primitive Data Types
        // They refer to objects
        // String, Arrays, Classes, Interface
        // Primitive start with lowercase letters while non-primitive start with uppercase letters
        // Primitive types always hold a value, while non-primitive types can be null


        // Java Type Casting
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        // byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double
        System.out.println(myInt); // 9
        System.out.println(myDouble); // 9.0


        // Narrowing Casting (manually) - converting a larger type to a smaller size type
        // double -> float -> long -> int - > char -> short -> byte

        double myDouble1 = 9.78;
        int myInt1 = (int) myDouble1; // Manual casting: double to int
        System.out.println(myDouble1); // 9.78
        System.out.println(myInt1); // 9



        // Java Operators
        // Operators are used to perform operations on variables and values
        // Arithmetic Operators: +, -, *, /, %, ++, --
        // Addition (+) - x + y - Adds two numbers
        // Subtraction (-) - x - y - Subtracts one number from another
        // Multiplication (*) - x * y - Multiplies two numbers
        // Division (/) - x / y - Divides one number by another
        // Modulus (%) - x % y - Returns the division remainder
        // Increment (++) - ++x or x++ - Increases the value of a variable by 1
        // Decrement (--) - --x or x-- - Decreases the value of a variable by 1
        
        // Assignment Operators: =, +=, -=, *=, /=, %=, &=, ^=, |=, <<=, >>=, >>>=
        // =  Example x = 5 Same As x = 5
        // += Example x += 3 Same As x = x + 3
        // -= Example x -= 3 Same As x = x - 3
        // *= Example x *= 3 Same As x = x * 3
        // /= Example x /= 3 Same As x = x / 3
        // %= Example x %= 3 Same As x = x % 3
        // &= Example x &= 3 Same As x = x & 3 (NB: Bitwise AND operator - it compares each bit of the first operand to the corresponding bit of the second operand)
        // ^= Example x ^= 3 Same As x = x ^ 3 (NB: Bitwise XOR operator - it compares each bit of the first operand to the corresponding bit of the second operand)
        // |= Example x |= 3 Same As x = x | 3 (NB: Bitwise OR operator - it compares each bit of the first operand to the corresponding bit of the second operand)
        // <<= Example x <<= 3 Same As x = x << 3 (NB: Bitwise left shift operator - shifts the bits of the first operand to the left by the number of positions specified in the second operand)
        // >>= Example x >>= 3 Same As x = x >> 3 (NB: Bitwise right shift operator - shifts the bits of the first operand to the right by the number of positions specified in the second operand)
        // >>>= Example x >>>= 3 Same As x = x >>> 3 (NB: Bitwise zero fill right shift operator - shifts the bits of the first operand to the right by the number of positions specified in the second operand. Zeros are used for the empty positions)

        // Comparison Operators: ==, !=, >, <, >=, <=
        // == Equal to - x == y
        // != Not equal - x != y
        // > Greater than - x > y
        // < Less than - x < y
        // >= Greater than or equal to - x >= y
        // <= Less than or equal to - x <= y

        // Logical Operators
        // && Logical and - Returns true if both statements are true - x < 5 && x < 10
        // || Logical or - Returns true if one of the statements is true - x < 5 || x < 4
        // ! Logical not - Reverse the result, returns false if the result is true - !(x < 5 && x < 10)


        // Java Strings
        String greeting = "Hello";
        System.out.println(greeting);

        // String length - use the length() method
        String txt = "DanielNyakundiOtundo";
        System.out.println("The length of the text string is: " + txt.length());

        // toUpperCase() and toLowerCase()
        String txt2 = "Hello World";
        System.out.println(txt2.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(txt2.toLowerCase()); // Outputs "hello world"

        // Finding Character in a String - use indexOf() - returns the position of the first occurrence of the specified text in a string
        String txt3 = "Please locate where 'locate' occurs!";
        System.out.println(txt3.indeOf("locate")); // Outputs 7

        // String Concatenation - use the + operator
        String firstName1 = "John";
        String lastName1 = "Doe";
        System.out.println(firstName1 + " " + lastName1);
        // You can use the concat() method as well:
        String firstName2 = "John ";
        String lastName2 = "Doe";
        System.out.println(firstName2.concat(lastName2));

        // Java Special Characters
        // Use the backlash escape character (\) which turns special characters into string characters:
        // \' - Result: ' Description: single quote
        // \" - Result: " Description: double quote
        // \\ - Result: \ Description: backslash
        // \n - Result: New Line
        // \r - Result: Carriage Return - Carriage return is a control character that returns the cursor to the beginning of the current line for example System.out.println("Hello\rWorld") will output "World" since the cursor returns to the beginning of the line after "Hello" and overwrites "Hello" with "World"
        // \t - Result: Tab for example System.out.println("Hello\tWorld") will output "Hello World"
        // \b - Result: Backspace - Backspace is a control character that erases the character before it for example: System.out.println("Hello\bWorld") will output "HellWorld";
        // \f - Result: Form Feed - Form feed is a control character that forces the printer to jump to the next page for example: System.out.println("Hello\fWorld") will output "Hello" on one page and "World" on the next page;
        String txt4 = "It\'s alright.";
        String txt5 = "We are the so-called \"Vikings\" from the north.";
        String txt6 = "The character \\ is called backslash.";
        System.out.println(txt4);
        System.out.println(txt5);
        System.out.println(txt6);


        // Java Math
        // Math.max(x, y) and Math.min(x, y) - returns the highest and lowest value of x and y
        System.out.println(Math.max(5, 10)); // 10
        System.out.println(Math.min(5, 10)); // 5
        // Math.sqrt(x) - returns the square root of x
        System.out.println(Math.sqrt(64)); // 8
        // Math.abs(x) - returns the absolute (positive) value of x
        System.out.println(Math.abs(-4.7)); // 4.7
        // Math.random() - returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        System.out.println(Math.random()); // 0.0 <= x < 1.0


        // Java Booleans
        // Booleans represent one of two values: true or false
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun); // Outputs true
        System.out.println(isFishTasty); // Outputs false
        // Java Boolean Expressions:
        // it returns true or false, depending on the outcome of the expression
        int x3 = 10;
        int y3 = 9;
        System.out.println(x3 > y3); // returns true, because 10 is higher than 9
        System.out.println(x3 == y3); // returns false, because 10 is not equal to 9
        System.out.println(10 == 15); // returns false, because 10 is not equal to 15
    }
}
