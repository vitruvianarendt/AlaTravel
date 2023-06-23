package com.nbp.ala_travel.controller;

import com.nbp.ala_travel.service.GetBookingsForTouristService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("getBookingsForTourist")
public class GetBookingsForTouristController {

    private final GetBookingsForTouristService service;

    @GetMapping("/view1/{touristId}")
    public String getView1(@PathVariable Long touristId, Model model) {
        model.addAttribute("getBookingsForTourist", service.getBookingsForTourist(touristId));
        model.addAttribute("touristId", touristId);
        model.addAttribute("bodyContent", "get-bookings-for-tourist");
        return "master-template";
    }
}
