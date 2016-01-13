package com.sebastian_daschner.maven_test.h;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("h")
public class HResource {

    @Inject
    HBean h;

    @GET
    public String get() {
        return h.get();
    }

    @GET
    @Path("{id}")
    public H get(@PathParam("id") String id) {
        return h.get(id);
    }

}
