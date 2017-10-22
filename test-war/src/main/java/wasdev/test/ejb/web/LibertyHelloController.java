package wasdev.test.ejb.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import wasdev.test.service.SampleService;

import javax.inject.Inject;

@RestController
public class LibertyHelloController {

    @Inject
    private SampleService sampleService;

    @RequestMapping("/springbootweb")
    public String hello() {

        return "Hello from Spring Boot MVC running on Liberty! " + sampleService.hi();
    }

}
