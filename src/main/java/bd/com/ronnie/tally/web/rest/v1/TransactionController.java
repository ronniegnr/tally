package bd.com.ronnie.tally.web.rest.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @GetMapping("test")
    public String test() {
        return "Hello World";
    }
}
