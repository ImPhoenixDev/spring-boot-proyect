package mx.com.gm.HolaSpring.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
class StartController {

    @GetMapping("/")
    public static String start(Model model) {
        //model.addAttribute("persons", persons);
        return "index";
    }
}