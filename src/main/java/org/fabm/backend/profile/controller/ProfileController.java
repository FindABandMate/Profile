package org.fabm.backend.profile.controller;

import org.fabm.backend.profile.model.Photo;
import org.fabm.backend.profile.model.Song;
import org.fabm.backend.profile.repository.PhotoRepository;
import org.fabm.backend.profile.repository.SongRepository;
import org.fabm.backend.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("getSongs")
    public List<Song> getSongsByUser(@RequestParam long userId){
        return profileService.getSongsByUser(userId);
    }

    @GetMapping("getPhotos")
    public List<Photo> getPhotosByUser(@RequestParam long userId){
        return profileService.getPhotosByUser(userId);
    }

}
