class House {
    boolean destroyed = false;
}

public class Main {
    public static void main(String[] args) {
        House house1 = new House();
        house1.destroyed = true;

        System.out.print("Is house one destroyed? " + house1.destroyed + '\n');
    }
}
