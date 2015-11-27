package com.sebastian_daschner.maven_test.u;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("u")
public class UResource {

    @Inject
    UBean u;

    @GET
    public String get() {
        return u.get();
    }

    @GET
    @Path("{id}")
    public U get(@PathParam("id") String id) {
        return u.get(id);
    }

}
