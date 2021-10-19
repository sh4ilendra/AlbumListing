package com.shailendra.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shailendra.entities.Album;

public interface AlbumRepository extends JpaRepository<Album, Long>{

}
