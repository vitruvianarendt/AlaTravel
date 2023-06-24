package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor
@RequestMapping("personController")
public class PersonController {
    private final PersonService service;

    @PostMapping("/registerDefault")
    public String registerDefault(Model model,
                                  @RequestParam String new_firstname,
                                  @RequestParam String new_lastname,
                                  @RequestParam String new_email,
                                  @RequestParam String new_password,
                                  @RequestParam String new_phonenumber,
                                  @RequestParam Integer new_istourguide) {
        model.addAttribute("registerDefault",
                service.registerByDefault(new_firstname, new_lastname, new_email, new_password,new_phonenumber, new_istourguide));
        model.addAttribute("new_firstname", new_firstname);
        model.addAttribute("new_lastname", new_lastname);
        model.addAttribute("new_email", new_email);
        model.addAttribute("new_password", new_password);
        model.addAttribute("new_phonenumber", new_phonenumber);
        model.addAttribute("new_istourguide", new_istourguide);
        model.addAttribute("bodyContent", "register-tourist");
        return "master-template";
    }

    @PostMapping("/registerDescPic")
    public String registerDescPic(Model model,
                                  @RequestParam String new_firstname,
                                  @RequestParam String new_lastname,
                                  @RequestParam String new_email,
                                  @RequestParam String new_password,
                                  @RequestParam String new_phonenumber,
                                  @RequestParam Integer new_istourguide,
                                  @RequestParam String description,
                                  @RequestParam String picture) {
        model.addAttribute("registerDescPic",
                service.registerDescPic(new_firstname, new_lastname, new_email, new_password,new_phonenumber,
                        new_istourguide, description, picture));
        model.addAttribute("new_firstname", new_firstname);
        model.addAttribute("new_lastname", new_lastname);
        model.addAttribute("new_email", new_email);
        model.addAttribute("new_password", new_password);
        model.addAttribute("new_phonenumber", new_phonenumber);
        model.addAttribute("new_istourguide", new_istourguide);
        model.addAttribute("description", description);
        model.addAttribute("picture", picture);
        model.addAttribute("bodyContent", "register-tourguide");
        return "master-template";
    }

    @PostMapping("/login")
    public String login(Model model,
                        @RequestParam String email,
                        @RequestParam String password) {
        model.addAttribute("login", service.login(email, password));
        model.addAttribute("email", email);
        model.addAttribute("password", password);
        model.addAttribute("bodyContent", "register-tourguide");
        return "master-template";
    }


}
