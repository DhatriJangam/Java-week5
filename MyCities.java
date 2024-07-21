public class MyCities {
    public enum City {
        TOKYO(13929286),
        NEW_YORK(8419000),
        LOS_ANGELES(3980400);

        private final int population;

        City(int population) {
            this.population = population;
        }

        public int getPopulation() {
            return population;
        }
    }

    public static void main(String[] args) {
        for (City city : City.values()) {
            System.out.println("The population of " + city + " is " + city.getPopulation());
        }
    }
}
