package com.example.thebanddatabase.model;


public class Band {
    private int mId;
    private String mName;
    private String mDescription;
    private String mDate;
    private String mImageURL;

    public Band() {}

    public Band(int id, String name, String description, String date, String image) {
        mId = id;
        mName = name;
        mDescription = description;
        mDate = date;
        mImageURL = image;

    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        this.mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public String getDate(){return mDate;}

    public void setDate(String date){this.mDate = date;}

    public String getmImageURL(){return mImageURL;}
}