package com.sebastian_daschner.maven_test.o;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("o")
public class OResource {

    @Inject
    OBean o;

    @GET
    public String get() {
        return o.get();
    }

    @GET
    @Path("{id}")
    public O get(@PathParam("id") String id) {
        return o.get(id);
    }

}
