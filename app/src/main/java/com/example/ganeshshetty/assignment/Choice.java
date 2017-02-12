package com.example.ganeshshetty.assignment;

/**
 * Created by Ganesh Shetty on 11-02-2017.
 */

public class Choice {

    int choice_image;

    public Choice(int choice_image, String choice_name) {
        this.choice_image = choice_image;
        this.choice_name = choice_name;
    }

    public Choice() {
    }

    public String getUser_name() {
        return choice_name;
    }

    public void setUser_name(String choice_name) {
        this.choice_name = choice_name;
    }

    String choice_name;
    public int getUser_image() {
        return choice_image;
    }

    public void setUser_image(int choice_image) {
        this.choice_image = choice_image;
    }
}
