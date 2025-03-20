class Camera {
    void takePhoto(Photo photo) {
        if (photo == null) {
            System.out.println("No photo available!");
            return;
        }
        photo.capture();
    }
}