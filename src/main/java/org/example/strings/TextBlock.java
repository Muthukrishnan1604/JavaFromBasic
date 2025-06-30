package src.main.java.org.example.strings;

/*
Definition:

Escape sequences are special character combinations in Java strings (and character literals) that begin with a backslash \ followed by a specific character.

They are used to represent characters that are otherwise difficult or impossible to type directly, or that have a special meaning in Java code (like quotation marks).

Purpose:

To insert special characters into strings (e.g., new lines, tabs, backslashes themselves).

To represent characters that are non-printable.

To include characters that would otherwise terminate a string literal (e.g., double quote).

Common Escape Sequences:

\t: Tab

Inserts a horizontal tab.

Example: "Hello\tWorld" results in "Hello World" (with a tab space).

\b: Backspace

Moves the cursor one position back.

Example: "Hello\bWorld" results in "HellWorld" (removes the 'o').

\n: Newline (Line Feed)

Moves the cursor to the beginning of the next line.

Example: "Line1\nLine2" results in:

Line1
Line2
\r: Carriage Return

Moves the cursor to the beginning of the current line (overwriting existing characters).

Example: "Line1\rLine2" results in "Line2" (Line2 overwrites Line1).

\f: Form Feed

Moves the cursor to the start of the next page (often used in printing, may behave like \n in consoles).

\\: Backslash

Inserts a literal backslash character.

Example: "C:\\Users\\John" results in "C:\Users\John".

\': Single Quote

Inserts a literal single quotation mark (primarily useful in char literals like char ch = '\''; but also works in strings).

Example: "It\'s cold" results in "It's cold".

\": Double Quote

Inserts a literal double quotation mark.

Example: "He said \"Hello!\"" results in "He said "Hello!"".

Unicode Escape Sequences:

uxxxx: Unicode Character

Represents a Unicode character where xxxx is exactly four hexadecimal digits.

Allows you to embed any Unicode character directly into your string or character literal.

Example: "\u00A9" represents the copyright symbol (©).

Example: "\u03B1" represents the lowercase Greek alpha (α).

Octal Escape Sequences (Less Common/Discouraged):

\ooo: Represents an octal character code (up to three octal digits from 0-7).

Example: "\101" represents the character 'A' (ASCII 65 in decimal, 101 in octal).

Modern practice favors Unicode escapes () for clarity and broader character support.

Important Note:

Escape sequences are interpreted by the compiler at compile-time. They are part of the string literal syntax.

They allow you to safely embed characters that would otherwise be syntactically problematic or invisible.
 */

import java.util.Locale;

public class TextBlock {

    public static void main(String[] args) {
        String bulletIt = "Print a Bulleted List: \n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point \'\" /";

        System.out.println(bulletIt);

        String textBlock = """
                Print a Bulleted List:
                     \u2022 First Point
                         \u2022 Sub Point """;

        System.out.println(textBlock);

        /*
            %s for strings

            %d for decimal integers

            %f for floating-point numbers

            %c for characters

            %b for booleans

            %n for a platform-independent newline

            %% for a literal percent sign
         */
        int age = 27;
        float salary = 1000.0000f;

        System.out.printf("Your age is %d and your salary is %.2f", age, salary);

        int n = 6;
        for(int i = 1; i <= 100000; i *= 10) {
            System.out.printf("%6d %n", i);
        }

        String formattedString = String.format("Your age is %d", age);
        System.out.println(formattedString);

        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);
    }

}
