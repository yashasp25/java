package com.xworkz.instancevariables;

public class Alien {
    private String seenBy;
    private String seenDate;
    private String description;

    public Alien(String seenBy, String seenDate, String description) {
        this.seenBy = seenBy;
        this.seenDate = seenDate;
        this.description = description;
    }

    public String getSeenBy() {
        return seenBy;
    }

    public void setSeenBy(String seenBy) {
        this.seenBy = seenBy;
    }

    public String getSeenDate() {
        return seenDate;
    }

    public void setSeenDate(String seenDate) {
        this.seenDate = seenDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}