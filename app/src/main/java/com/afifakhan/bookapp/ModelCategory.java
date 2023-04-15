package com.afifakhan.bookapp;

public class ModelCategory {
    //make sure to use same spelling for model variables as in firebase

    String  category, uid;
    long id,timestamp;

    //constructor empty required for firebase

    public ModelCategory() {


    }

    //parameterizes constructor

    public ModelCategory(long id, String category, String uid, long timestamp) {
        this();
        this.id = id;
        this.category = category;
        this.uid = uid;
        this.timestamp = timestamp;
    }

    /* -------Getter/Setter---------*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
