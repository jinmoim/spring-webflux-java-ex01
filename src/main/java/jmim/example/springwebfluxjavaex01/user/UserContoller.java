package jmim.example.springwebfluxjavaex01.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class UserContoller {
    @GetMapping(path = "/echo")
    public Mono<String> echo() {
        return Mono.just("hello world");
    }
}
