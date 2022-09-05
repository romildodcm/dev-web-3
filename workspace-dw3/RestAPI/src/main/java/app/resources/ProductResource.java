package app.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
//import javax.ws.rs.core.Response.Status; para usar só Status.OK

import app.models.*;


@Path("/products")
public class ProductResource {
	//private static final long serialVersionUID = 101L;
	
	List<Product> products = new ArrayList<>();
	
	public ProductResource() {
		Product p1 = new Product(1, "Notebook", 2000.0);
		Product p2 = new Product(2, "Mouse", 50.0);
		Product p3 = new Product(3, "Monitor", 750.0);
		
		products.add(p1);
		products.add(p2);
		products.add(p3);
		
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		
		return Response.status(Response.Status.OK).entity(products).build();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getById(@PathParam("id") Integer id) {
		Product p = null;
		
		if(id == 1) {
			p = products.get(0);
		} else if(id == 2) {
			p = products.get(1);
		} else if(id == 3) {
			p = products.get(2);
		} else {
			MyError err = new MyError();
			err.setName("Not Found");
			err.setStatus("404");
			
			return Response.status(Response.Status.NOT_FOUND).entity(err).build();
		}
		
		return Response.status(Response.Status.OK).entity(p).build();
	}
}
