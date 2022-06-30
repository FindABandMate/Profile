package org.fabm.backend.profile.controller;

import org.fabm.backend.profile.model.Photo;
import org.fabm.backend.profile.model.Song;
import org.fabm.backend.profile.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("profiles")
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    /*****************************************************************************/
    // Song CRUD operations

    // Add a single Song object
    @PostMapping("addSong") // localhost:5001/profiles/addSong
    public Song addSong(@RequestBody Song song){
        return profileService.addSong(song);
    }

    // Add multiple Song objects
    @PostMapping("addSongs") // localhost:5001/profiles/addSongs
    public List<Song> addSongs(@RequestBody List<Song> songList){
        return profileService.addSongs(songList);
    }

    // Returns a list of Song objects grouped by user
    @GetMapping("getSongs") // localhost:5001/profiles/getSongs?userId=#
    public List<Song> getSongsByUser(@RequestParam long userId){
        return profileService.getSongsByUser(userId);
    }

    /*****************************************************************************/
    // Photo CRUD operations

    // Add a single Photo object
    @PostMapping("addPhoto") // localhost:5001/profiles/addPhoto
    public Photo addPhoto(@RequestBody Photo photo){
        return profileService.addPhoto(photo);
    }

    // Add multiple Photo objects
    @PostMapping("addPhotos") // localhost:5001/profiles/addPhoto
    public List<Photo> addPhotos(@RequestBody List<Photo> photoList){
        return profileService.addPhotos(photoList);
    }

    // Returns a list of Photo objects grouped by user
    @GetMapping("getPhotos") // localhost:5001/profiles/getPhotos?userId=#
    public List<Photo> getPhotosByUser(@RequestParam long userId){
        return profileService.getPhotosByUser(userId);
    }

}
