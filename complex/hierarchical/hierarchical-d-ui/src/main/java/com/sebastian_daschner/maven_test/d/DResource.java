package com.sebastian_daschner.maven_test.d;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("d")
public class DResource {

    @Inject
    DBean d;

    @GET
    public String get() {
        return d.get();
    }

    @GET
    @Path("{id}")
    public D get(@PathParam("id") String id) {
        return d.get(id);
    }

}
