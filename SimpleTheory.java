public class SimpleTheory {
    /*
     * 1. JVM creates objects in Java if we provide it with the bytecode.
     * 2. Every Object consumes some space.
     * 3. If there are 3 classes in a file, then on compilation 3 .class files will be created 
     *    Moreover, if you use a different class in current class then that class's class file will also be created.
     * 
     * ah_Strings includes String, String Buffer, String Builder.
     * ai_StaticKeyword includes static variables, static methods and static block.
     * aj_Encapsulation includes Data specifiers, Getter Setters and this Keyword.
     * 
     * 
     * INEHRITENCE THEORY 
     * We can get all the properties of a parent class by just inheriting that class in child class.
     * (Parent, Super, Base) --> (Child, Sub, Derived)
     * We use extends Keyword, where child class extends parent class.
     * extends -> is a relationship (advCalc is a calc)
     * 
     * Multi level Inheritence
     * calc <-- AdvCalc, this is Single Level Inheritence
     * calc <-- AdvCalc <-- VeryAdvCalc, this is a multi level Inheritence
     * any function is first search in calc, then AdvCalc and then VeryAdvCalc
     * 
     * Multiple Inheritence is not supported in java because if both parents have the same function,
     * then there is a ambiguity which one to chose.
     */
}
