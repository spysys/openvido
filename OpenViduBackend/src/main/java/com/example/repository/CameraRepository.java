package com.example.repository;

import com.example.entity.Camera;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface CameraRepository extends CrudRepository<Camera,Integer> {
    List<Camera> getCamerasByCamera(String camera);
    Boolean existsCameraBySessionAndUrl(String session, String url);
    List<Camera> getCamerasBySession(String session);
    Boolean existsCameraBySession(String session);
}
