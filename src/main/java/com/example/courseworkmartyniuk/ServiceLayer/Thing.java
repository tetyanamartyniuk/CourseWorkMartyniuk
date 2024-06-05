package com.example.courseworkmartyniuk.ServiceLayer;

public class Thing {
    private String publisher;
    private String name;
    private String place;
    private String info;
    private String[] keyWords;
    private boolean userAdded;
    private String phoneNumber;

    public Thing(String publisher, String name, String place, String info, String[] keyWords, boolean userAdded, String phoneNumber) {
        this.publisher = publisher;
        this.name = name;
        this.place = place;
        this.info = info;
        this.keyWords = keyWords;
        this.userAdded = userAdded;
        this.phoneNumber = phoneNumber;
    }

    public Thing(String publisher, String name, String place, String info, String[] keyWords, String phoneNumber) {
        this.publisher = publisher;
        this.name = name;
        this.place = place;
        this.info = info;
        this.keyWords = keyWords;
        this.phoneNumber = phoneNumber;
        this.userAdded = false;

    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String[] getKeyWords() {
        return keyWords;
    }

    public void setKeyWords(String[] keyWords) {
        this.keyWords = keyWords;
    }
    public boolean isUserAdded() {
        return userAdded;
    }

    public void setUserAdded(boolean userAdded) {
        this.userAdded = userAdded;
    }
    public String getPhoneNumber(){return phoneNumber;}

    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}

}

