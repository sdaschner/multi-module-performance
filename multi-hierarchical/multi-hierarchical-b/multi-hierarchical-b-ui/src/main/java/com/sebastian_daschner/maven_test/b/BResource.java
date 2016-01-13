package com.sebastian_daschner.maven_test.b;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("b")
public class BResource {

    @Inject
    BBean b;

    @GET
    public String get() {
        return b.get();
    }

    @GET
    @Path("{id}")
    public B get(@PathParam("id") String id) {
        return b.get(id);
    }

}
