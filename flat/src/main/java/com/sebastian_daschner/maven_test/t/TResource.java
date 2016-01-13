package com.sebastian_daschner.maven_test.t;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("t")
public class TResource {

    @Inject
    TBean t;

    @GET
    public String get() {
        return t.get();
    }

    @GET
    @Path("{id}")
    public T get(@PathParam("id") String id) {
        return t.get(id);
    }

}
