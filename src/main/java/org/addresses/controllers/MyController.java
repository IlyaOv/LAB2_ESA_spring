package org.addresses.controllers;

import org.addresses.models.House;
import org.addresses.services.HouseService;
import org.addresses.services.StreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class MyController {

    private final HouseService houseService;
    private final StreetService streetService;

    @Autowired
    public MyController(HouseService houseService, StreetService streetService) {
        this.houseService = houseService;
        this.streetService = streetService;
    }

    @GetMapping("/showHouses")
    public String findHouses(Model model) {
        model.addAttribute("houses", (List<House>) houseService.findAll());
        return "showHouses";
    }

    @RequestMapping(value = "/addHouse", method = RequestMethod.GET)
    public String addHouse(Model model){
        model.addAttribute("house", new House());
        model.addAttribute("streets", streetService.findAll());
        return "addHouse";
    }

    @RequestMapping(value = "/addHouse", method = RequestMethod.POST)
    public String saveHouse(@Valid @ModelAttribute("house") House house,
                            ModelMap model, BindingResult result){
        houseService.addHouse(house);
        return "redirect:/showHouses";
    }

    @RequestMapping(value = "/deleteHouse/{id}", method = RequestMethod.GET)
    public String deleteHouse(@PathVariable("id") String id){
        houseService.deleteHouse(id);
        return "redirect:/showHouses";
    }
}
