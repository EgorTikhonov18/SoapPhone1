import org.springframework.stereotype.Component;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.bind.JAXBElement;
import java.util.HashMap;
import java.util.Map;

@Endpoint
@Component
public class NumberServiceEndpoint {
    private Map<String, String> nameToNumberMap = new HashMap<>();

    public NumberServiceEndpoint() {
        nameToNumberMap.put("John Smith", "12345");
        nameToNumberMap.put("Alice Johnson", "67890");
    }

    @PayloadRoot(namespace = "http://example.com/numberservice", localPart = "getNumbersRequest")
    @ResponsePayload
    public JAXBElement<String> getNumbers(@RequestPayload JAXBElement<String> request) {
        String fullName = request.getValue();
        String number = nameToNumberMap.get(fullName);
        return new JAXBElement<>(...); // Создайте JAXBElement для вашего ответа
    }
}
