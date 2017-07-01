package info.developia.microservice.controller;

import info.developia.microservice.model.Project;
import info.developia.microservice.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
public class ProjectController {

  @Autowired
  private ProjectService projectService;

  @GetMapping(value = "/project", produces = APPLICATION_JSON_VALUE)
  public List<Project> getProject(){
    List<Project> projects = projectService.findAll();

    return projects;
  }

}
