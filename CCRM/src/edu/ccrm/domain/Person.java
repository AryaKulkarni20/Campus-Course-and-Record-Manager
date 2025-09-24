package edu.ccrm.domain;

import java.time.LocalDate;

public abstract class Person {
    private String id;
    private String fullName;
    private String email;
    private LocalDate dateCreated;

    public Person(String id, String fullName, String email, LocalDate dateCreated) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.dateCreated = dateCreated;
    }
    // Getters/Setters here
    public String getFullName() { return fullName; }
    public abstract void printProfile();
}

