package com.thy.ex_instagram;

/**
 * Created by alofo on 2018-03-16.
 */

public class Feed {

    String title, location, imageURL, message, times;
    int icon;

    public Feed(String title, String location, String imageURL, String message, String times, int icon) {
        this.title = title;
        this.location = location;
        this.imageURL = imageURL;
        this.message = message;
        this.times = times;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
