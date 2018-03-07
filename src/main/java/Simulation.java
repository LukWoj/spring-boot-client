import org.springframework.web.client.RestTemplate;

public class Simulation {

    public static void main(String[] args) {



        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/";
        String paramrRequest = url + "testParam";
        Request request = new Request("Tomek", "Atomek");
        String response2 = restTemplate.postForObject(paramrRequest, request, String.class);
        System.out.println(response2);

        // RestTemplate restTemplate = new RestTemplate();
//        String url = "http://localhost:8080/";
//        String url1 = url + "test1";
//        Response response = restTemplate.postForObject(url1,null, Response.class);
//        System.out.println(response.getResponse());
//
//
//        String url2 = url + "testParam?name=Donald&surname=Duck";
//        String response2 = restTemplate.postForObject(url2,null, String.class);
//        System.out.println(response2);
    }
}
