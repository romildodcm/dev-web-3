package app;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Assert;
import org.junit.Test;

public class ProductTest {
	// testar se o servidor ta ok
	
	@Test
	public void testaSeOServidorTaOn() {
		Client client = ClientBuilder.newClient();
		WebTarget target =  client.target("http://localhost:8080/RestAPI/rest");
		
		String payload = target.path("/products/1").request().get(String.class);
		//String payload = target.path("products?sort=desc").request().get(String.class);
		

		Assert.assertTrue(payload.contains("Notebook"));
	}

}
