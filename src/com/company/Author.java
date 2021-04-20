package com.company;

public class Author {
    private String name;
    private String lastName;
    private String email;
    private boolean isMale;


    public Author(String name, String lastName, String email, boolean isMale) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", isMale=" + isMale +
                '}';
    }
}
