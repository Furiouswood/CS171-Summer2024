### Auto-boxing and Auto-unboxing

- Autoboxing in Java is an automatic conversion process that the compiler uses to convert the primitive types to their corresponding object wrapper classes.

         int i = 10;  // primitive data type
         Integer intObject = i;  // autoboxing

- Unboxing is the automatic conversion of wrapper class types to their corresponding primitive types.
  Integer intObject = new Integer(10); // Depricated
  Integer intObject = 10;
  int i = intObject; // unboxing

#### Why boxing?

- **Nullability:** Integer is an object that can represent the same values as int and additionally null. int is a primitive data type and cannot be null.
- **Methods and utilities:** The Integer class comes with a number of useful methods that you can use to perform operations on an int, like converting the int to a string, converting a string to an int, etc.
- **Use in collections:** Collections in Java (like ArrayList, HashMap, etc.) can't use primitive types like int. So if you want to store your numbers in a collection, you'll have to use Integer instead.
- **Use with generics:** Java's generic system doesn't support primitives. So, if you are using a generic class, you need to use the wrapper classes (like Integer) instead of the primitive types (like int).
