package com.sebastian_daschner.maven_test.q;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("q")
public class QResource {

    @Inject
    QBean q;

    @GET
    public String get() {
        return q.get();
    }

    @GET
    @Path("{id}")
    public Q get(@PathParam("id") String id) {
        return q.get(id);
    }

}
