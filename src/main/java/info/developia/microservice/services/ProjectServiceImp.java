package info.developia.microservice.services;

import info.developia.microservice.model.Project;
import info.developia.microservice.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImp implements ProjectService {

  @Autowired
  private ProjectRepository projectRepository;

  @Override
  public List<Project> findAll() {
    return projectRepository.findAll();
  }

  @Override
  public void save(Project project) {
    projectRepository.save(project);
  }

}