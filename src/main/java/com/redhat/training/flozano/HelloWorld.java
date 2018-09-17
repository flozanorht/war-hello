package com.redhat.training.flozano;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;

@Path("/")
public class HelloWorld {
    @Inject
    HelloService helloService;

    @GET
    @Path("/")
    @Produces({ "text/plain" })
    public String sayHello() {
        return helloService.createHelloMessage("Unknown");
    }
    @GET
    @Path("/{name}")
    @Produces({ "text/plain" })
    public String sayHello(@PathParam("name") String name) {
        return helloService.createHelloMessage(name);
    }
}
