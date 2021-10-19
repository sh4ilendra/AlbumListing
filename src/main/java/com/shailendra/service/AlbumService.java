package com.shailendra.service;

import com.shailendra.entities.Album;
import com.shailendra.entities.TO.AlbumTO;

public interface AlbumService {
	
	Album createAlbum(AlbumTO albumTransferObject);

	Album getAlbumById(Long id);

	Iterable<Album> getAlbums();

	Album updateAlbum(Long id, AlbumTO albumTransferObject);

	void deleteAlbum(Long id);
	
	boolean initData();

}
