package jenkins.demo.jenkins_docker_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String firstApi() {
        return "welcome to jenkin's project";
    }
}
