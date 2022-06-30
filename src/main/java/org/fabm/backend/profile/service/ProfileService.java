package org.fabm.backend.profile.service;

import org.fabm.backend.profile.model.Photo;
import org.fabm.backend.profile.model.Song;
import org.fabm.backend.profile.repository.PhotoRepository;
import org.fabm.backend.profile.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    /*****************************************************************************/
    // Song CRUD operations


    // Add multiple Song objects
    public List<Song> getSongsByUser(long userId){
        List<Song> songList = songRepository.findByUserId(userId);
        return songRepository.findByUserId(userId);
    }

    // Add a single Song object
    public Song addSong(Song song) {
        return songRepository.save(song);
    }

    // Returns a list of Song objects grouped by user
    public List<Song> addSongs(List<Song> songList) {
        return songRepository.saveAll(songList);
    }

    /*****************************************************************************/
    // Photo CRUD operations

    // Add a single Photo object
    public Photo addPhoto(Photo photo) {
        return photoRepository.save(photo);
    }

    // Add multiple Photo objects
    public List<Photo> addPhotos(List<Photo> photoList) {
        return photoRepository.saveAll(photoList);
    }

    // Returns a list of Photo objects grouped by user
    public List<Photo> getPhotosByUser(long userId){
        List<Photo> photoList = photoRepository.findByUserId(userId);
        return photoRepository.findByUserId(userId);
    }
}
