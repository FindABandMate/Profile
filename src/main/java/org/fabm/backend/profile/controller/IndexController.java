package org.fabm.backend.profile.controller;

import org.fabm.backend.profile.model.Photo;
import org.fabm.backend.profile.model.Song;
import org.fabm.backend.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;

@Controller
public class IndexController {

    private final ProfileService profileService;

    @Autowired
    public IndexController(ProfileService profileService) {
        this.profileService = profileService;
    }

    // Create index.html file in resources/templates and use thymeleaf
    @GetMapping
    public String getHomepage(Model model, @RequestParam long userId){
        List<Photo> photos = profileService.getPhotosByUser(userId);
        List<Song> songs = profileService.getSongsByUser(userId);
        model.addAttribute("profilePhoto", profileService.getPhotosByUser(userId).get(0).getPhotoName());
        model.addAttribute("userPhotos", photos.subList(1, photos.size()));
        model.addAttribute("userSongs", songs);
        return "index";
    }
}
