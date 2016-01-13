package com.sebastian_daschner.maven_test.k;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("k")
public class KResource {

    @Inject
    KBean k;

    @GET
    public String get() {
        return k.get();
    }

    @GET
    @Path("{id}")
    public K get(@PathParam("id") String id) {
        return k.get(id);
    }

}
