package com.engeto.b_dedicnost.zoo;

/**
 * Predek pro chovatele a pokladni v zoo
 */
public class User {

    private String name;
    public String password;
    protected int yearOfBoarding;

    public User(String name, String password, int yearOfBoarding) {
        this.name = name;
        this.password = password;
        this.yearOfBoarding = yearOfBoarding;
    }

    public boolean logIn(String password) {
        return this.password.equals(password);
    }

    private boolean checkCorrectYearBoarding() {
        return this.yearOfBoarding < 2000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYearOfBoarding() {
        return yearOfBoarding;
    }

    public void setYearOfBoarding(int yearOfBoarding) {
        this.yearOfBoarding = yearOfBoarding;
    }
}
