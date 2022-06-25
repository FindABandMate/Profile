package org.fabm.backend.profile.repository;

import org.fabm.backend.profile.model.Song;
import org.fabm.backend.profile.model.SongPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, SongPK> {
    List<Song> findByUserId(long userId);
}
