package com.example.android.itayguideapp;


/**
 * {@link Location} represents the location and the details that the user wants to know
 */
public class Location {

    //int value for main image
    private int mImageResourceId;

    //String value for title
    private String mTitle;

    //String value for description
    private String mDescription;

    //String value for address
    private String mAddress;

    //String value for time
    private String mTime;

    //String value for phone
    private String mPhoneNumber;



    /**
     * Constructs a new TextView for initial values for miwokTranslation and defaultTranslation.
     *
     * @param imageResourceId : main Image
     *
     * @param title : the title
     * @param description : the description
     * @param address : the address
     * @param time : the time
     * @param phoneNumber : the phone number
     */
    public Location (int imageResourceId, String title, String description, String address, String time, String phoneNumber){
        mImageResourceId = imageResourceId;
        mTitle = title;
        mDescription = description;
        mAddress = address;
        mTime = time;
        mPhoneNumber = phoneNumber;
    }

    /**
     * Gets the int value in the TextView
     *
     *@return current text in the TextView
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     * Gets the String value in the TextView
     *
     *@return current text in the TextView
     */
    public String getTitle(){
        return mTitle;
    }

    /**
     * Gets the String value in the TextView
     *
     *@return current text in the TextView
     */
    public String getDescription(){
        return mDescription;
    }

    /**
     * Gets the String value in the TextView
     *
     *@return current text in the TextView
     */
    public String getAddress(){
        return mAddress;
    }

    /**
     * Gets the String value in the TextView
     *
     *@return current text in the TextView
     */
    public String getTime(){
        return mTime;
    }

    /**
     * Gets the String value in the TextView
     *
     *@return current text in the TextView
     */
    public String getPhoneNumber(){
        return mPhoneNumber;
    }

}
