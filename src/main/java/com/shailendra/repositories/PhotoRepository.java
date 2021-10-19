package com.shailendra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.shailendra.entities.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Long>{

	@Query("select p from Photo p where p.albumId = ?1")
	Iterable<Photo> getPhotosByAlbumId(Long albumId);
}
