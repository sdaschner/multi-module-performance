package com.sebastian_daschner.maven_test.c;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("c")
public class CResource {

    @Inject
    CBean c;

    @GET
    public String get() {
        return c.get();
    }

    @GET
    @Path("{id}")
    public C get(@PathParam("id") String id) {
        return c.get(id);
    }

}
