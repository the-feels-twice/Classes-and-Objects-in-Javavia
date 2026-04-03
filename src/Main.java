import java.util.concurrent.ThreadLocalRandom;


class House {
    boolean destroyed = false;
    long netWorth = 0L;

    public House(boolean isDestroyed) {
        this(isDestroyed, 0L);
    }

    public House(boolean isDestroyed, long netWorth) {
        destroyed = isDestroyed;
        this.netWorth = netWorth;
    }

    public void destroy() {
        this.destroyed = true;
    }

    public void rebuild() {
        this.destroyed = false;
    }
}

class Slum extends House {
    boolean isClean = false;

    public Slum(boolean isDestroyed, long netWorth, boolean isClean) {
        super(isDestroyed, netWorth);
        this.isClean = isClean;
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

        House[] task5 = new Slum[12];
        int min = 1000;
        int max = 10000;

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
           if (house.netWorth < 8640000000L) {
               house.destroy();
           }

           System.out.print("Is house worth enough? " + house.destroyed + '\n');
        }

        System.out.print("---------- Task #5 ----------\n");

        for (int i = 0; i < task5.length; i++) {
            // Generate new values
            int randomNum = ThreadLocalRandom.current().nextInt(min, max);
            boolean randomBool = ThreadLocalRandom.current().nextBoolean();

            // Assign new Slum object to array index
            task5[i] = new Slum(false, (long)randomNum, randomBool);

            // Cast to Slum
            Slum currentSlum = (Slum) task5[i];
            // Use printf for cleaner formatting
            // '%,d' for comma-separated thousands
            System.out.printf("Net Worth: %,d, Is slum clean? %b, is it destroyed? %b\n", currentSlum.netWorth, currentSlum.isClean, currentSlum.destroyed);
        }
    }
}