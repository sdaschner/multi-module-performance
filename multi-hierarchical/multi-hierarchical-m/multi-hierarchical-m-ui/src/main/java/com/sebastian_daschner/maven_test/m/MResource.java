package com.sebastian_daschner.maven_test.m;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("m")
public class MResource {

    @Inject
    MBean m;

    @GET
    public String get() {
        return m.get();
    }

    @GET
    @Path("{id}")
    public M get(@PathParam("id") String id) {
        return m.get(id);
    }

}
