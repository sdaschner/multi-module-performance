package com.sebastian_daschner.maven_test.j;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("j")
public class JResource {

    @Inject
    JBean j;

    @GET
    public String get() {
        return j.get();
    }

    @GET
    @Path("{id}")
    public J get(@PathParam("id") String id) {
        return j.get(id);
    }

}
