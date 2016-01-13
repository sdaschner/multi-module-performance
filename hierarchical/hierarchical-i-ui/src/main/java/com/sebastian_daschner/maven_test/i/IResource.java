package com.sebastian_daschner.maven_test.i;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("i")
public class IResource {

    @Inject
    IBean i;

    @GET
    public String get() {
        return i.get();
    }

    @GET
    @Path("{id}")
    public I get(@PathParam("id") String id) {
        return i.get(id);
    }

}
