package com.sebastian_daschner.maven_test.f;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("f")
public class FResource {

    @Inject
    FBean f;

    @GET
    public String get() {
        return f.get();
    }

    @GET
    @Path("{id}")
    public F get(@PathParam("id") String id) {
        return f.get(id);
    }

}
