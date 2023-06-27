package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.model.DetailsAboutTour;
import com.nbp.ala_travel.service.DetailsAboutTourService;
import com.nbp.ala_travel.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
@RequestMapping("detailsAboutTourController")
public class DetailsAboutTourController {
    private final DetailsAboutTourService service;
    private final ReviewService reviewService;

    @GetMapping("/view1")
    public String detailsAboutTour(Model model,
                                   @RequestParam(required = false) String city_name,
                                   @RequestParam(name = "tour_name") String tour_name) {
        List<DetailsAboutTour> dat = service.viewDetailsAboutTour(city_name, tour_name);
        model.addAttribute("detailsAboutTour", dat);
        model.addAttribute("id", dat.get(0).getId());
        model.addAttribute("city_name", city_name);
        model.addAttribute("tour_name", tour_name);
        model.addAttribute("reviews", reviewService.getReviewsForTour(dat.get(0).getId()));
        model.addAttribute("bodyContent", "details-about-tour");
        return "master-template";
    }
}
