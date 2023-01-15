package sele.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public final class HomeRest {

    @GetMapping
    public String home() {
        return "home";
    }
}
