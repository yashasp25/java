class Space {
    void startMission(Universe universe) {
        if (universe == null) {
            System.out.println("No universe to explore!");
            return;
        }
        universe.explore();
    }
}