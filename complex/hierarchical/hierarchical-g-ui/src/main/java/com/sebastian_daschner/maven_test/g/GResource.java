package com.sebastian_daschner.maven_test.g;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("g")
public class GResource {

    @Inject
    GBean g;

    @GET
    public String get() {
        return g.get();
    }

    @GET
    @Path("{id}")
    public G get(@PathParam("id") String id) {
        return g.get(id);
    }

}
