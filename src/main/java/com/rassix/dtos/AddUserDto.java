package com.rassix.dtos;

import com.rassix.enums.Gender;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

public class AddUserDto {

    // private ObjectId _id;

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

    public String getFirstName() {
        return firstName;
    }

    public AddUserDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public AddUserDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public AddUserDto setAge(int age) {
        this.age = age;
        return this;
    }

    public String getOccupation() {
        return occupation;
    }

    public AddUserDto setOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    @NotNull
    public Gender getGender() {
        return gender;
    }

    public AddUserDto setGender(@NotNull Gender gender) {
        this.gender = gender;
        return this;
    }

}
