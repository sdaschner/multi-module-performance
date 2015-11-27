package com.sebastian_daschner.maven_test;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("a")
public class AResource {

    @Inject
    ABean a;

    @GET
    public String get() {
        return a.get();
    }

}
