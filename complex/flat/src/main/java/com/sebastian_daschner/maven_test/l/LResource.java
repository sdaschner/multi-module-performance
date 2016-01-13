package com.sebastian_daschner.maven_test.l;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("l")
public class LResource {

    @Inject
    LBean l;

    @GET
    public String get() {
        return l.get();
    }

    @GET
    @Path("{id}")
    public L get(@PathParam("id") String id) {
        return l.get(id);
    }

}
