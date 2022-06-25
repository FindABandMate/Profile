package org.fabm.backend.profile.model;

import javax.persistence.*;

@Entity
@IdClass(PhotoPK.class)
@Table(name = "photos")
public class Photo {

    @Id
    @Column(name = "USERID")
    private Long userId;

    @Id
    @Column(name = "PHOTONAME")
    private String photoName;

    public Photo(Long userId, String photoName) {
        this.userId = userId;
        this.photoName = photoName;
    }

    public Photo() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "userId=" + userId +
                ", photoName='" + photoName + '\'' +
                '}';
    }
}