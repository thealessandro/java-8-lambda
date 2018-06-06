package br.com.kyxadious.chapter.common.entity;

import java.util.Objects;

public class User {

    private String name;
    private Integer points;
    private Boolean moderator;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(String name, Integer points) {
        this.name = name;
        this.points = points;
        this.moderator = false;
    }

    public User(String name, Integer points, Boolean moderator) {
        this.name = name;
        this.points = points;
        this.moderator = moderator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Boolean isModerator() {
        return moderator;
    }

    public void setModerator(Boolean moderator) {
        this.moderator = moderator;
    }

    public void moderatorOn() {
        setModerator(true);
    }

    public void moderatorOff() {
        setModerator(false);
    }

    @Override
    public String toString() {
        return "User {" +
                "name='" + name + '\'' +
                ", points=" + points +
                ", moderator=" + moderator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // self check
        if (this == o) return true;
        // null check
        if (o == null) return false;
        // type check and cast
        if (getClass() != o.getClass()) return false;
        User user = (User) o;
        // field comparison
        return Objects.equals(getName(), user.getName()) &&
                Objects.equals(isModerator(), user.isModerator());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), isModerator());
    }
}
