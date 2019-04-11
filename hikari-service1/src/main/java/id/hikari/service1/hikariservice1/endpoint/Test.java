package id.hikari.service1.hikariservice1.endpoint;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
    @RequestMapping("/")
    public String test(){
        return "Please Work !!!!!!!";
    }
}
