package com.rassix.controller;

import com.codahale.metrics.annotation.Timed;
import com.rassix.enums.Gender;
import com.rassix.models.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.validation.Validator;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Api(
    value = "/users",
    description = "Operations for user data"
)
public class UserController {

    private Validator validator;

    public UserController(Validator validator) {
        this.validator = validator;
    }

    @GET
    @Timed
    @Path("/{id}")
    @ApiOperation(value = "Get user by id")
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "User not found"),
            @ApiResponse(code = 405, message = "Validation exception") })
    public Response getById(@PathParam("id") int id) {

        var user = new User()
                .setAge(31)
                .setFirstName("Foo")
                .setLastName("Bar")
                .setGender(Gender.MALE)
                .setOccupation("Software developer");

        return Response.ok().entity(user).build();
    }

    /* @GET
    @Timed
    public List<User> getAllUsers() {
        return new ArrayList<User>();
    }

    @POST
    @Timed
    @Path("/create")
    public void createUser(AddUserDto addUserDto) {

    }

    @POST
    @Timed
    @Path("/update")
    public void updateUser(AddUserDto updateUserDto) {

    }

    @DELETE
    @Timed
    @Path("/{id}")
    public void deleteUser(@PathParam("id") int id) {

    } */

}
