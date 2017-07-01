package info.developia.microservice.repository;

import info.developia.microservice.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository <Project, Long> {

}
