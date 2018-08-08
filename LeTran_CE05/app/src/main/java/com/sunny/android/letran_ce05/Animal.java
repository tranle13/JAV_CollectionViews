
    // Name: Tran Le
    // JAV1 - 1808
    // File name: Animal.java

package com.sunny.android.letran_ce05;

class Animal {

    // Member variables
    private final String name;
    private final int age;
    private final boolean isFriendly;
    private final String job;
    private final String hobby;
    private final int imageID;

    // Constructor
    public Animal(String _name, int _age, boolean _isFriendly, String _job, String _hobby, int _imageID) {
        name = _name;
        age = _age;
        isFriendly = _isFriendly;
        job = _job;
        hobby = _hobby;
        imageID = _imageID;
    }

    // Methods
    String getName() { return name; }
    int getAge() { return age; }
    boolean getFriendly() { return isFriendly; }
    String getJob() { return job; }
    String getHobby() { return hobby; }
    int getImageID() { return imageID; }
}
