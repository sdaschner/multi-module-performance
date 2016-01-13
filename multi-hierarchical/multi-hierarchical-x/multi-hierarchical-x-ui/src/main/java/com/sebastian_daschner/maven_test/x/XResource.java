package com.sebastian_daschner.maven_test.x;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("x")
public class XResource {

    @Inject
    XBean x;

    @GET
    public String get() {
        return x.get();
    }

    @GET
    @Path("{id}")
    public X get(@PathParam("id") String id) {
        return x.get(id);
    }

}
