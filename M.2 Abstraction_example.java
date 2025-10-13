abstract class City {
    String name;

    City(String name) {
        this.name = name;
    }

    abstract void transportation();
    abstract void services();

    void displayCityName() {
        System.out.println("City: " + name);
    }
}

class Mumbai extends City {
    Mumbai() {
        super("Mumbai");
    }

    void transportation() {
        System.out.println("Mumbai uses trains, buses, and autos.");
    }

    void services() {
        System.out.println("Mumbai provides civic services via BMC.");
    }
}

class Tokyo extends City {
    Tokyo() {
        super("Tokyo");
    }

    void transportation() {
        System.out.println("Tokyo uses bullet trains and subways.");
    }

    void services() {
        System.out.println("Tokyo uses advanced smart-city technologies.");
    }
}

public class Main {
    public static void main(String[] args) {
        City city1 = new Mumbai();
        City city2 = new Tokyo();

        city1.displayCityName();
        city1.transportation();
        city1.services();

        System.out.println();

        city2.displayCityName();
        city2.transportation();
        city2.services();
    }
}

// output
// City: Mumbai
// Mumbai uses trains, buses, and autos.
// Mumbai provides civic services via BMC.

// City: Tokyo
// Tokyo uses bullet trains and subways.
// Tokyo uses advanced smart-city technologies.


