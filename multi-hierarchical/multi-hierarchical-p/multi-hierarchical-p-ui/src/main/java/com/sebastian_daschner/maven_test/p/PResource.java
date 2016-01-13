package com.sebastian_daschner.maven_test.p;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("p")
public class PResource {

    @Inject
    PBean p;

    @GET
    public String get() {
        return p.get();
    }

    @GET
    @Path("{id}")
    public P get(@PathParam("id") String id) {
        return p.get(id);
    }

}
