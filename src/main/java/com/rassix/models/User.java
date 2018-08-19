package com.rassix.models;

import com.rassix.enums.Gender;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class User {

    @NotBlank
    @Length(min = 3, max = 255)
    private String firstName;

    @NotBlank
    @Length(min = 3, max = 255)
    private String lastName;

    @NotNull
    private int age;

    private String occupation;

    @NotNull
    private Gender gender;

    private boolean isDeleted;

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public String getOccupation() {
        return occupation;
    }

    public User setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    @NotNull
    public Gender getGender() {
        return gender;
    }

    public User setGender(@NotNull Gender gender) {
        this.gender = gender;
        return this;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public User setDeleted(boolean deleted) {
        isDeleted = deleted;
        return this;
    }

}
