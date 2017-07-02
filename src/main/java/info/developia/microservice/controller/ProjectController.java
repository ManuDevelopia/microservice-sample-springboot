package info.developia.microservice.controller;

import info.developia.microservice.model.Project;
import info.developia.microservice.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("/projects")
public class ProjectController {

  @Autowired
  private ProjectService projectService;

  @GetMapping(value = "/all", produces = APPLICATION_JSON_VALUE)
  public List<Project> getProject(){
    List<Project> projects = projectService.findAll();

    return projects;
  }

  @GetMapping(value = "/{projectId}", produces = APPLICATION_JSON_VALUE)
  public Project getProjectById(@PathVariable("projectId") String projectId){
    Project project = Project.builder().name("Project" + projectId).build();
    projectService.save(project);

    return project;
  }

}
