
    // Name: Tran Le
    // JAV1 - 1808
    // File name: Animal.java

package com.sunny.android.letran_ce05;

public class Animal {

    // Member variables
    private String name;
    private int age;
    private boolean isFriendly;
    private String job;
    private String hobby;

    // Constructor
    public Animal(String _name, int _age, boolean _isFriendly, String _job, String _hobby) {
        name = _name;
        age = _age;
        isFriendly = _isFriendly;
        job = _job;
        hobby = _hobby;
    }

    // Methods
    String getName() { return name; }
    int getAge() { return age; }
    boolean getFriendly() { return isFriendly; }
    String getJob() { return job; }
    String getHobby() { return hobby; }
}
