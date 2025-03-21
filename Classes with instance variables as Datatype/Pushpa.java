class Pushpa {
    void useClip(Clip[] clips) {
        if (clips != null) {
            for (Clip clip : clips) {
                if (clip != null) {
                    clip.hold();
                }
            }
        }
    }
}