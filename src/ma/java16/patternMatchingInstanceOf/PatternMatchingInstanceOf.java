package ma.java16.patternMatchingInstanceOf;

interface Animal {
}

class Cat implements Animal {
}

class Dog implements Animal {
}

// preview 14
public class PatternMatchingInstanceOf {
    public static void avant(Animal animal)
    {
        if (animal instanceof Cat) {
            // Redundant casting
            Cat cat = (Cat)animal;
            // other cat operations
        }
        else if (animal instanceof Dog) {
            // Redundant casting
            Dog dog = (Dog)animal;
            // other dog operations
        }
    }

    public static void apres(Animal animal)
    {
        if (animal instanceof Cat cat) {
            //cat.meow();
            // other cat operations
        }
        else if (animal instanceof Dog dog) {
            //dog.woof();
            // other dog operations
        }
    }
}
