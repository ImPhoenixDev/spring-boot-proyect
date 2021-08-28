package mx.com.gm.HolaSpring.web;

import lombok.extern.slf4j.Slf4j;
import lombok.var;
import mx.com.gm.HolaSpring.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
class StartController {

    @Autowired
    private PersonDao personDao;


    @GetMapping("/")
    public String start(Model model) {
        var persons = this.personDao.findAll();
        model.addAttribute("persons", persons);
        return "index";
    }
}