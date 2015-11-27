package com.sebastian_daschner.maven_test.r;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("r")
public class RResource {

    @Inject
    RBean r;

    @GET
    public String get() {
        return r.get();
    }

    @GET
    @Path("{id}")
    public R get(@PathParam("id") String id) {
        return r.get(id);
    }

}
