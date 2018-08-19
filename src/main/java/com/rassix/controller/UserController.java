package com.rassix.controller;

import com.rassix.dtos.AddUserDto;
import com.rassix.models.User;

import javax.validation.Validator;
import javax.ws.rs.*;
import java.util.ArrayList;
import java.util.List;

@Path("/users")
public class UserController {

    private Validator validator;

    public UserController(Validator validator) {
        this.validator = validator;
    }

    @GET
    @Path("/{id}")
    public User getById(@PathParam("id") int id) {
        return new User();
    }

    @GET
    public List<User> getAllUsers() {
        return new ArrayList<User>();
    }

    @POST
    @Path("/create")
    public void createUser(AddUserDto addUserDto) {

    }

    @POST
    @Path("/update")
    public void updateUser(AddUserDto updateUserDto) {

    }

    @DELETE
    @Path("/{id}")
    public void deleteUser(@PathParam("id") int id) {

    }

}
