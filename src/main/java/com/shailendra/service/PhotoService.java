package com.shailendra.service;


import org.springframework.data.domain.Pageable;

import com.shailendra.entities.Photo;
import com.shailendra.entities.TO.PhotoTO;

public interface PhotoService {
	
	Photo createPhoto(PhotoTO photoTransferObject);

	Photo getPhotoById(Long id);

	Iterable<Photo> getPhotos();
	
	Iterable<Photo> getPhotosByAlbumId(Long id);

	Photo updatePhoto(Long id, PhotoTO photoTransferObject);

	void deletePhoto(Long id);

	boolean initData();
}
