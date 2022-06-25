package org.fabm.backend.profile.model;

import java.io.Serializable;
import java.util.Objects;

public class SongPK implements Serializable {
    private long userId;
    private String songName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SongPK that = (SongPK) o;
        return userId == that.userId && songName == that.songName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, songName);
    }
}
