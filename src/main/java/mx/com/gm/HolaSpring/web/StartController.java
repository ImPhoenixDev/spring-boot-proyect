package mx.com.gm.HolaSpring.web;

import lombok.extern.slf4j.Slf4j;
import lombok.var;
import mx.com.gm.HolaSpring.domain.Person;
import mx.com.gm.HolaSpring.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
class StartController {

    @Autowired
    private PersonService personService;

    @GetMapping("/add")
    public static String add(Person person) {
        return "modify";
    }

    @GetMapping("/")
    public String start(Model model) {
        var persons = this.personService.listPersons();
        model.addAttribute("persons", persons);
        return "index";
    }

    @PostMapping("/save")
    public String save(Person person) {
        this.personService.saveNewPerson(person);
        return "redirect:/";
    }
}