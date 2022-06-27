package org.fabm.backend.profile.service;

import org.fabm.backend.profile.model.Photo;
import org.fabm.backend.profile.model.Song;
import org.fabm.backend.profile.repository.PhotoRepository;
import org.fabm.backend.profile.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private SongRepository songRepository;

    @Autowired
    private PhotoRepository photoRepository;

    public List<Song> getSongsByUser(long userId){
        List<Song> songList = songRepository.findByUserId(userId);
        return songRepository.findByUserId(userId);
    }

    public List<Photo> getPhotosByUser(long userId){
        List<Photo> photoList = photoRepository.findByUserId(userId);
        return photoRepository.findByUserId(userId);
    }
}
