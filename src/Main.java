class House {
    boolean destroyed = false;

    public House(boolean isDestroyed) {
        destroyed = isDestroyed;
    }

    public void rebuild() {
        this.destroyed = false;
    }
}

public class Main {
    public static void main(String[] args) {
        House task1 = new House(true);

        House[] task2 = {
                new House(true),
                new House(false),
                new House(true)
        };

        System.out.print("---------- Task #1 ----------\n");
        System.out.print("Is house one destroyed? " + task1.destroyed + '\n');

        System.out.print("---------- Task #2 ----------\n");
        for (House house : task2) {
            System.out.print("Is house destroyed? " + house.destroyed + '\n');
        }


        System.out.print("---------- Task #3 ----------\n");

        for (House house : task2) {
            house.rebuild();
        }

        for (House house : task2) {
            System.out.print("Is house destroyed? " + house.destroyed + '\n');
        }
    }
}
