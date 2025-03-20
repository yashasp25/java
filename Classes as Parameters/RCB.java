class RCB {
    void startMatch(Team team) {
        if (team == null) {
            System.out.println("No team available!");
            return;
        }
        team.cheer();
    }
}