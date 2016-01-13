package com.sebastian_daschner.maven_test.e;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("e")
public class EResource {

    @Inject
    EBean e;

    @GET
    public String get() {
        return e.get();
    }

    @GET
    @Path("{id}")
    public E get(@PathParam("id") String id) {
        return e.get(id);
    }

}
