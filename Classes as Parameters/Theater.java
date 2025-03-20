class Theater {
    void showPoster(Poster poster) {
        if (poster == null) {
            System.out.println("No poster available!");
            return;
        }
        poster.showInfo();
    }
}
