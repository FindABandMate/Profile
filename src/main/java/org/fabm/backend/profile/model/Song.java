package org.fabm.backend.profile.model;

import javax.persistence.*;

@Entity
@IdClass(SongPK.class)
@Table(name = "songs")
public class Song {

    @Id
    @Column(name = "USERID")
    private Long userId;

    @Id
    @Column(name = "SONGNAME")
    private String songName;

    public Song(Long userId, String songName) {
        this.userId = userId;
        this.songName = songName;
    }

    public Song() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Override
    public String toString() {
        return "Song{" +
                "userId=" + userId +
                ", songName='" + songName + '\'' +
                '}';
    }
}
