package com.sebastian_daschner.maven_test.s;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("s")
public class SResource {

    @Inject
    SBean s;

    @GET
    public String get() {
        return s.get();
    }

    @GET
    @Path("{id}")
    public S get(@PathParam("id") String id) {
        return s.get(id);
    }

}
