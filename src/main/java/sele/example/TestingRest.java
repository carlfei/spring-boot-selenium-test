package sele.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public final class TestingRest {

    @GetMapping("/testing/{id}")
    public String testing(@PathVariable("id") String id, Model model) {
        model.addAttribute("id", id);

        return "testing";
    }
}
