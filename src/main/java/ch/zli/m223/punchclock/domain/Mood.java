package ch.zli.m223.punchclock.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mood {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String moodName;

    //@OneToMany
    //private List<Entity> entryId;

    public long getId() {
        return id;
    }

    public String getMood() {
        return moodName;
    }

    public void setMood(String moodName) {
        this.moodName = moodName;
    }
}