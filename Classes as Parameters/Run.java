public class Run {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.showAd(new Display());

        Theater theater = new Theater();
        theater.showPoster(new Poster());

        RCB rcb = new RCB();
        rcb.startMatch(new Team());

        Space space = new Space();
        space.startMission(new Universe());

        Rocket rocket = new Rocket();
        rocket.launch(new Engine());

        Dolo650 dolo = new Dolo650();
        dolo.takeMedicine(new Tablet());

        Barber barber = new Barber();
        barber.provideService(new Haircut());

        Camera camera = new Camera();
        camera.takePhoto(new Photo());

        Mango mango = new Mango();
        mango.enjoyFruit(new Fruit());

        Pillow pillow = new Pillow();
        pillow.useCushion(new Cushion());
    }
}