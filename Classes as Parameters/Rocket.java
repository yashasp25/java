class Rocket {
    void launch(Engine engine) {
        if (engine == null) {
            System.out.println("No engine available!");
            return;
        }
        engine.ignite();
    }
}