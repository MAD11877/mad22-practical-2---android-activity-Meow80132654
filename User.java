package com.example.madpractical2_activity;

public class User {

    String name;
    String description;
    Integer id;
    Boolean followed;

    public User(String n,String d,Integer i,Boolean f){

        name = n;
        description = d;
        id = i;
        followed = f;
    }

    public void toggle(){
        if (followed == true){
            followed = false;
        }
        else{
            followed = true;
        }
    }
}
