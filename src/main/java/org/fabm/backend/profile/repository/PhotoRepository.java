package org.fabm.backend.profile.repository;

import org.fabm.backend.profile.model.Photo;
import org.fabm.backend.profile.model.PhotoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, PhotoPK> {
    List<Photo> findByUserId(long userId);
}
