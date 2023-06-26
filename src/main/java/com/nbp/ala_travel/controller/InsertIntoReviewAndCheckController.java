package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.InsertIntoReviewAndCheckService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
@RequestMapping("insertIntoReviewAndCheckController")
public class InsertIntoReviewAndCheckController {

    private final InsertIntoReviewAndCheckService service;

    @GetMapping("/create-form")
    public String getCreateForm(Model model) {
        model.addAttribute("bodyContent", "create-review-form");
        return "master-template";
    }

    @PostMapping("/view1/{touristId}")
    public String getView2(@PathVariable Long touristId, Model model,
                           @RequestParam Integer grade,
                           @RequestParam String description,
                           @RequestParam Long tourguideid,
                           @RequestParam Long tourid) {
        model.addAttribute("insertIntoReviewAndCheck",
                service.insertIntoReviewAndCheck(touristId, grade, description, tourid,tourguideid));
        model.addAttribute("touristId", touristId);
        model.addAttribute("grade", grade);
        model.addAttribute("description", description);
        model.addAttribute("tourguideid", tourguideid);
        model.addAttribute("tourid", tourid);
        model.addAttribute("bodyContent", "review");
        return "master-template";
    }
    // tuka moze view isto da se vrati od ostavanje review ili da se napravi poraka koe od ovie e null da se vrati primer
    // details za tura ili details za tourguide
}
