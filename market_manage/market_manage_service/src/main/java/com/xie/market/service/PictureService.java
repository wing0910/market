package com.xie.market.service;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

public interface PictureService {
	
	Map uploadPicture(MultipartFile uploadFile) ;

}
