package com.engeto.f_souhrny;

public class Employee implements Location {

    private String name;
    private String jobTitle;

    public Employee(String name) {
        this(name, "developer");
    }

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String getDescription() {
        return name + " (" + jobTitle + ")";
    }
}