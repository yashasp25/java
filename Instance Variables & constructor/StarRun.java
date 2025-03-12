public class StarRun {
    public static void main(String[] args) {
        Star star1 = new Star();
        Star star2 = new Star();
        Star star3 = new Star();
        Star star4 = new Star();
        Star star5 = new Star();
        Star star6 = new Star();
        Star star7 = new Star();
        Star star8 = new Star();
        Star star9 = new Star();
        Star star10 = new Star();

        star1.name = "Sirius";
        star1.distance = 100;
        star1.brightness = 1.5;
        star1.isShiny = true;

        star2.name = "Vega";
        star2.distance = 200;
        star2.brightness = 2.0;
        star2.isShiny = false;

        star3.name = "Polaris";
        star3.distance = 300;
        star3.brightness = 2.5;
        star3.isShiny = true;

        star4.name = "Betelgeuse";
        star4.distance = 400;
        star4.brightness = 3.0;
        star4.isShiny = false;

        star5.name = "Rigel";
        star5.distance = 500;
        star5.brightness = 3.5;
        star5.isShiny = true;

        star6.name = "Antares";
        star6.distance = 600;
        star6.brightness = 4.0;
        star6.isShiny = false;

        star7.name = "Aldebaran";
        star7.distance = 700;
        star7.brightness = 4.5;
        star7.isShiny = true;

        star8.name = "Altair";
        star8.distance = 800;
        star8.brightness = 5.0;
        star8.isShiny = false;

        star9.name = "Spica";
        star9.distance = 900;
        star9.brightness = 5.5;
        star9.isShiny = true;

        star10.name = "Deneb";
        star10.distance = 1000;
        star10.brightness = 6.0;
        star10.isShiny = false;

        System.out.println("Star 1: " + star1.name + ", " + star1.distance + " distance, brightness: " + star1.brightness + ", Shiny: " + star1.isShiny);
        System.out.println("Star 2: " + star2.name + ", " + star2.distance + " distance, brightness: " + star2.brightness + ", Shiny: " + star2.isShiny);
        System.out.println("Star 3: " + star3.name + ", " + star3.distance + " distance, brightness: " + star3.brightness + ", Shiny: " + star3.isShiny);
        System.out.println("Star 4: " + star4.name + ", " + star4.distance + " distance, brightness: " + star4.brightness + ", Shiny: " + star4.isShiny);
        System.out.println("Star 5: " + star5.name + ", " + star5.distance + " distance, brightness: " + star5.brightness + ", Shiny: " + star5.isShiny);
        System.out.println("Star 6: " + star6.name + ", " + star6.distance + " distance, brightness: " + star6.brightness + ", Shiny: " + star6.isShiny);
        System.out.println("Star 7: " + star7.name + ", " + star7.distance + " distance, brightness: " + star7.brightness + ", Shiny: " + star7.isShiny);
        System.out.println("Star 8: " + star8.name + ", " + star8.distance + " distance, brightness: " + star8.brightness + ", Shiny: " + star8.isShiny);
        System.out.println("Star 9: " + star9.name + ", " + star9.distance + " distance, brightness: " + star9.brightness + ", Shiny: " + star9.isShiny);
        System.out.println("Star 10: " + star10.name + ", " + star10.distance + " distance, brightness: " + star10.brightness + ", Shiny: " + star10.isShiny);
    }
}