package ma.java17.sealedClasses;

// preview 15 & 16

final class Circle implements Shape {
    public double area() {
        return 1;
    }
}

non-sealed class Rectangle implements Shape {
    public double area() {
        return 2;
    }
}
sealed interface Shape permits Circle, Rectangle {
    double area();
}

// J’ai défini ici une interface scellée nommée Shape (notez la présence du mot-clé sealed). Seules les classes Circle et Rectangle pourront implémenter cette interface, grâce au mot-clé permits.

public class SealedClasses {

    //  il est désormais possible de définir avec précision le périmètre d’une classe, en indiquant quelles classes seront autorisées à en hériter.
    //Cela fonctionne aussi avec les interfaces et leurs implémentations. La mise en place de cette nouveauté passe par l’ajout de 2 mots clés : sealed et permits. Voyons tout cela au moyen d’un exemple :
    //Java 15 propose une prévisualisation des classes Sealed, qui permet de définir une hiérarchie de classes restreinte où seuls certains sous-types sont autorisés.


//     • Sealed class is declared using sealed keyword.
//    • Sealed classes allow to declare which class can be a subtype using permits keyword.
//    • A class extending sealed class must be declared as either sealed, non-sealed or final.
//    • Sealed classes helps in creating a finite and determinable hiearchy of classes in inheritance.
}
