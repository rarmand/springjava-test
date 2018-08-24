package project.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// jaka roznica od zwyklego kontrolera
public class HelloController {

    @RequestMapping("/")
    // adnotacja mapuje do wszystkich metod HTTP
    public String starter() {
        return "Hello to all of you";
    }

    @RequestMapping("/hello")
    // adnotacja mapuje do wszystkich metod HTTP
    public String sayHi() {
        return "Hello World";
    }
}
