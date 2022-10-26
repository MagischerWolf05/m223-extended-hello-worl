package ch.sigren.m223;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/calculator")
public class CalculatorResource {
 
    @GET
    @Path("/add/{firstnummber}/{secondnummber}")
    
    public int add(@PathParam("firstnummber")String firstnummber,@PathParam("secondnummber")String secondnummber){
        return Integer.parseInt(firstnummber)  + Integer.parseInt(secondnummber);
    }
}
