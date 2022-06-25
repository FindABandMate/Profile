package org.fabm.backend.profile.controller;

import org.fabm.backend.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class IndexController {

    private final ProfileService profileService;

    @Autowired
    public IndexController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping
    public String getHomepage(Model model, @RequestParam long userId){
        model.addAllAttributes(Arrays.asList(profileService.getPhotosByUser(userId), profileService.getSongsByUser(userId)));
        return "index";
    }
}
