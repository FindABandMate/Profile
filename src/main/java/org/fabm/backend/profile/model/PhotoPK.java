package org.fabm.backend.profile.model;

import java.io.Serializable;
import java.util.Objects;

public class PhotoPK implements Serializable {
    private long userId;
    private String photoName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoPK that = (PhotoPK) o;
        return userId == that.userId && photoName == that.photoName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, photoName);
    }
}