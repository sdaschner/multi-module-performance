package com.sebastian_daschner.maven_test.n;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("n")
public class NResource {

    @Inject
    NBean n;

    @GET
    public String get() {
        return n.get();
    }

    @GET
    @Path("{id}")
    public N get(@PathParam("id") String id) {
        return n.get(id);
    }

}
