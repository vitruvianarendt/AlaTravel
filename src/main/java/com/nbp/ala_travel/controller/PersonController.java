package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.model.LoginPersonResponse;
import com.nbp.ala_travel.service.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@AllArgsConstructor
@RequestMapping("personController")
public class PersonController {

    private final PersonService service;
    private final TouristSavedTourInstancesService touristSavedTourInstancesService;
    private final TouristFavouriteToursService touristFavouriteToursService;
    private final GetBookingsForTouristService getBookingsForTouristService;
    private final BookingsForTourguideService bookingsForTourguideService;
    private final TourService tourService;

    @GetMapping("/myProfile")
    public String getMyProfile(Model model,
                               @RequestParam Long personId,
                               @RequestParam Boolean isTourGuide,
                               @RequestParam String message) {
        // general (must included)
        model.addAttribute("personId", personId);
        model.addAttribute("isTourGuide", isTourGuide);
        model.addAttribute("message", message);

        // optional
        if (isTourGuide) {
            model.addAttribute("tourGuideTours", tourService.getToursFromPersonId(personId));
            model.addAttribute("bookingsForTourguide", bookingsForTourguideService.getBookingsFromPersonid(personId));
            model.addAttribute("bodyContent", "profile-tourguide");

        } else {
            model.addAttribute("touristFavouriteTours", touristFavouriteToursService.filter_favourite_tours(personId,null));
            model.addAttribute("touristSavedTourInstances", touristSavedTourInstancesService.touristSavedTourInstances(personId, null, null));
            model.addAttribute("bookingsForTourist", getBookingsForTouristService.getBookingsForTourist(personId));
            model.addAttribute("bodyContent", "profile");
        }
        return "master-template";

    }

    @GetMapping("/registerDefaultForm")
    public String getRegisterDefaultForm(Model model) {
        model.addAttribute("bodyContent", "register-default");
        return "master-template";
    }

    @GetMapping("/registerDescPicForm")
    public String getRegisterDescPicForm(Model model) {
        model.addAttribute("bodyContent", "register-tourguide");
        return "master-template";
    }

    @GetMapping("/loginForm")
    public String getLoginForm(Model model) {
        model.addAttribute("bodyContent", "login");
        return "master-template";
    }

    @PostMapping("/registerDefault")
    public String registerDefault(Model model,
                                  @RequestParam String new_firstname,
                                  @RequestParam String new_lastname,
                                  @RequestParam String new_email,
                                  @RequestParam String new_password,
                                  @RequestParam String new_phonenumber,
                                  @RequestParam Integer new_istourguide) {
        String result = service.registerByDefault(new_firstname, new_lastname, new_email, new_password,new_phonenumber, new_istourguide);
        if (result.equals("OK")) {
            model.addAttribute("registerDefault", result);
            return "redirect:/personController/loginForm";
        } else {
            model.addAttribute("errorMsg", result);
            model.addAttribute("bodyContent","error");
            return "master-template";
        }

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
        String result = service.registerDescPic(new_firstname, new_lastname, new_email, new_password,new_phonenumber,
                new_istourguide, description, picture);
        if (result.equals("OK")) {
            model.addAttribute("registerDescPic", result);
            return "redirect:/personController/loginForm";
        } else {
            model.addAttribute("errorMsg", result);
            model.addAttribute("bodyContent","error");
            return "master-template";
        }

    }

    @PostMapping("/login")
    public String login(Model model,
                        @RequestParam String email,
                        @RequestParam String password) {
        LoginPersonResponse obj = service.login(email, password);
        if (obj.message.equals("OK")) {
            Long personId = obj.person.getId();
            boolean isTourGuide = obj.person.getIstourguide();
            String message = obj.getMessage();
            return "redirect:/personController/myProfile?personId=" + personId + "&isTourGuide=" + isTourGuide + "&message=" + message;
        } else {
            model.addAttribute("errorMsg", obj.getMessage());
            model.addAttribute("bodyContent","error");
            return "master-template";
        }

    }

}
