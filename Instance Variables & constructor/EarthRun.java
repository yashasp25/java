class EarthRun {
    public static void main(String[] args) {
        Earth earth1 = new Earth();
        earth1.continent = "Asia";
        earth1.population = 4600000000L;
        earth1.area = 44579000.0;
        earth1.hasWater = true;
        System.out.println("Earth 1: " + earth1.continent + ", Population: " + earth1.population + ", Area: " + earth1.area + " sq.km, Water: " + earth1.hasWater);

        Earth earth2 = new Earth();
        earth2.continent = "Africa";
        earth2.population = 1400000000L;
        earth2.area = 30370000.0;
        earth2.hasWater = true;
        System.out.println("Earth 2: " + earth2.continent + ", Population: " + earth2.population + ", Area: " + earth2.area + " sq.km, Water: " + earth2.hasWater);

        Earth earth3 = new Earth();
        earth3.continent = "North America";
        earth3.population = 590000000L;
        earth3.area = 24709000.0;
        earth3.hasWater = true;
        System.out.println("Earth 3: " + earth3.continent + ", Population: " + earth3.population + ", Area: " + earth3.area + " sq.km, Water: " + earth3.hasWater);

        Earth earth4 = new Earth();
        earth4.continent = "South America";
        earth4.population = 430000000L;
        earth4.area = 17840000.0;
        earth4.hasWater = true;
        System.out.println("Earth 4: " + earth4.continent + ", Population: " + earth4.population + ", Area: " + earth4.area + " sq.km, Water: " + earth4.hasWater);

        Earth earth5 = new Earth();
        earth5.continent = "Europe";
        earth5.population = 750000000L;
        earth5.area = 10180000.0;
        earth5.hasWater = true;
        System.out.println("Earth 5: " + earth5.continent + ", Population: " + earth5.population + ", Area: " + earth5.area + " sq.km, Water: " + earth5.hasWater);

        Earth earth6 = new Earth();
        earth6.continent = "Australia";
        earth6.population = 42000000L;
        earth6.area = 8600000.0;
        earth6.hasWater = true;
        System.out.println("Earth 6: " + earth6.continent + ", Population: " + earth6.population + ", Area: " + earth6.area + " sq.km, Water: " + earth6.hasWater);

        Earth earth7 = new Earth();
        earth7.continent = "Antarctica";
        earth7.population = 1000L;
        earth7.area = 14000000.0;
        earth7.hasWater = false;
        System.out.println("Earth 7: " + earth7.continent + ", Population: " + earth7.population + ", Area: " + earth7.area + " sq.km, Water: " + earth7.hasWater);

        Earth earth8 = new Earth();
        earth8.continent = "Oceania";
        earth8.population = 42000000L;
        earth8.area = 8500000.0;
        earth8.hasWater = true;
        System.out.println("Earth 8: " + earth8.continent + ", Population: " + earth8.population + ", Area: " + earth8.area + " sq.km, Water: " + earth8.hasWater);

        Earth earth9 = new Earth();
        earth9.continent = "Greenland";
        earth9.population = 56000L;
        earth9.area = 2166000.0;
        earth9.hasWater = false;
        System.out.println("Earth 9: " + earth9.continent + ", Population: " + earth9.population + ", Area: " + earth9.area + " sq.km, Water: " + earth9.hasWater);

        Earth earth10 = new Earth();
        earth10.continent = "Indian Ocean Islands";
        earth10.population = 25000000L;
        earth10.area = 1500000.0;
        earth10.hasWater = true;
        System.out.println("Earth 10: " + earth10.continent + ", Population: " + earth10.population + ", Area: " + earth10.area + " sq.km, Water: " + earth10.hasWater);
    }
}