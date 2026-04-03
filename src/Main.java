class House {
    boolean destroyed = false;
    long networth = 0L;

    public House(boolean isDestroyed) {
        this(isDestroyed, 0L);
    }

    public House(boolean isDestroyed, long networth) {
        destroyed = isDestroyed;
        this.networth = networth;
    }

    public void destroy() {
        this.destroyed = true;
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

        House[] task4 = {
                new House(false, 8921000000L),
                new House(false, 7000880000L),
                new House(false, 9400000000L),
                new House(false, 8230000000L),
                new House(false, 11000670000L),
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

        System.out.print("---------- Task #4 ----------\n");

        for (House house : task4) {
           if (house.networth < 8640000000L) {
               house.destroy();
           }

           System.out.print("Is house worth enough? " + house.destroyed + '\n');
        }
    }
}
