package com.sebastian_daschner.maven_test.y;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("y")
public class YResource {

    @Inject
    YBean y;

    @GET
    public String get() {
        return y.get();
    }

    @GET
    @Path("{id}")
    public Y get(@PathParam("id") String id) {
        return y.get(id);
    }

}
