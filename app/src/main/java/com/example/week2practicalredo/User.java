package com.example.week2practicalredo;
public class User {
    public String name;
    public String description;
    public int id;
    public boolean followed;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        description = desc;
    }
    public boolean isFollowed() {
        return followed;
    }

    public void setFollowed(boolean followed) {
        this.followed = followed;
    }

}
