package src.main.java.org.example.oops.inheritance.thisandsuper;

/*
this() and super() Constructor Calls Interview Preparation Points
General Understanding:

this() and super() are special "call-like" constructs used within constructors to invoke other constructors.

They resemble method calls due to the parentheses (), but they specifically target constructors.

this() Call:

Purpose: Used to call another overloaded constructor within the same class.

Placement Rule: Must be the first statement in a constructor.

Usage Context: Can only be used within a constructor.

Benefit: Facilitates constructor chaining, where one constructor calls another, helping
to reduce duplicated initialization code.

super() Call:

Purpose: The only way to explicitly call a parent (superclass) constructor from a subclass constructor.

Placement Rule: Must be the first statement in a constructor.

Compiler Default: If you don't explicitly add super() or this() as the first statement in a constructor,
the Java compiler automatically inserts a default super() call to the parent's no-argument constructor.

Implicit super(): This implicit super() is always to the no-argument constructor of the parent class.

Mutual Exclusivity:

A constructor can have either a call to this() OR a call to super(), but never both as the first statement.
This is because both must be the first statement.
 */


public class ConstructorThisAndSuper {

    private int x;

    private int y;

    private int z;

    public ConstructorThisAndSuper() {
        this(1, 2);
    }

    public ConstructorThisAndSuper(int x, int y) {
        this(x, y, 4);
    }

    public ConstructorThisAndSuper(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

}
