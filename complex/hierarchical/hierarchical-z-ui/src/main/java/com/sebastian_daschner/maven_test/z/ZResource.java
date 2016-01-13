package com.sebastian_daschner.maven_test.z;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("z")
public class ZResource {

    @Inject
    ZBean z;

    @GET
    public String get() {
        return z.get();
    }

    @GET
    @Path("{id}")
    public Z get(@PathParam("id") String id) {
        return z.get(id);
    }

}
