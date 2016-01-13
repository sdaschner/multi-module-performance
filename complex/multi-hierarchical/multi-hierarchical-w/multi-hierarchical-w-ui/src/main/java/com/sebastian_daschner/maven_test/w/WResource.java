package com.sebastian_daschner.maven_test.w;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("w")
public class WResource {

    @Inject
    WBean w;

    @GET
    public String get() {
        return w.get();
    }

    @GET
    @Path("{id}")
    public W get(@PathParam("id") String id) {
        return w.get(id);
    }

}
