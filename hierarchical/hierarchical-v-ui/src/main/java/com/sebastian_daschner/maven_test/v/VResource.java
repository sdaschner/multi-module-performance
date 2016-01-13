package com.sebastian_daschner.maven_test.v;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("v")
public class VResource {

    @Inject
    VBean v;

    @GET
    public String get() {
        return v.get();
    }

    @GET
    @Path("{id}")
    public V get(@PathParam("id") String id) {
        return v.get(id);
    }

}
