package info.developia.microservice.services;

import info.developia.microservice.model.Project;

import java.util.List;

/**
 * Created by manu on 02/07/17.
 */
public interface ProjectService {

  List<Project> findAll();

}