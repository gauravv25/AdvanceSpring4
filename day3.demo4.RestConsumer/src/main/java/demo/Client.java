package demo;

import org.springframework.web.client.RestTemplate;

public class Client {

	public static void main(String[] args) {
		RestTemplate template = new RestTemplate();
		String url = "http://localhost:8080/first";
		String output = template.getForObject(url, String.class);
		System.out.println(output);
		System.out.println(template.postForEntity(url, null, String.class));
	}
}
