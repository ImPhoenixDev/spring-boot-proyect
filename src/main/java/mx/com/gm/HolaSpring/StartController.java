package mx.com.gm.HolaSpring;

import lombok.extern.slf4j.Slf4j;
import mx.com.gm.HolaSpring.domain.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
class StartController {

    @Value("${index.greeting}")
    private String greeting;

    @GetMapping("/")
    public String start(Model model) {
        final String message = "Hello world from Thymeleaf";

        Person person = new Person();
        person.setName("Juan");
        person.setLastName("Garcia");
        person.setEmail("Juan@example.com");
        person.setPhone("55 55555555");

        Person person2 = new Person();
        person2.setName("Adrian");
        person2.setLastName("Delmonte");
        person2.setEmail("adri@example.com");
        person2.setPhone("55 55555555");

        List<Person> persons = new ArrayList();
        persons.add(person);
        persons.add(person2);

        StartController.log.info("Running Spring MVC Controller. :)");
        StartController.log.info("Controller initialized");

        model.addAttribute("message", message);
        model.addAttribute("greeting", this.greeting);
        //model.addAttribute("person", person);
        model.addAttribute("persons", persons);

        return "index";
    }
}