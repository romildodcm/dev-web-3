package app;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import app.models.Product;

public class ProductTest {
	Client client;
	WebTarget target;
	
	@Before
	public void setup() {
		client = ClientBuilder.newClient();
		target =  client.target("http://localhost:8080/RestAPI/rest");
	}
	
	
	// testar se o servidor ta ok
	
	
	@Test
	public void testaSeOServidorTaOn() {
		//String payload = target.path("/products/1").request().get(String.class);
		String payload = target.path("/products").request().get(String.class);
		Assert.assertTrue(payload.contains("Notebook"));
	}

	
	@Test
	public void testaSeOMetodoGetProductByIdFunciona() throws JsonProcessingException{
		String payload = target.path("/products/2").request().get(String.class);
		ObjectMapper objectMapper = new ObjectMapper();
		
		
		Product product = objectMapper.readValue(payload, Product.class);
		Assert.assertEquals("Mouse", product.getProduct());
				
	}
	
	@Test
	public void verificaSeOProdutoPodeSerCriado() throws JsonProcessingException {
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		Product p = new Product(5, "ProdutoTest", 999.0);
		String productJson = ow.writeValueAsString(p);
		
		Entity<String> productEntity = Entity.entity(productJson, MediaType.APPLICATION_JSON);
		
		Response response = target.path("/products").request().post(productEntity);
		
		Assert.assertEquals(201, response.getStatus());
		
		String path = response.getHeaderString("Location");
	}
	
	
}
