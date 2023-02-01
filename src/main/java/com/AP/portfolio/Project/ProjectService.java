package com.AP.portfolio.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements  IProjectService{

    @Autowired
    private ProjectRepository repo;

    @Override
    public List<ProjectEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public ProjectEntity getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void add(ProjectEntity project) {
        repo.save(project);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void edit(Long id, ProjectEntity project) {
        ProjectEntity source = getById(id);

        source.setTitle(project.getTitle());
        source.setRepo_url(project.getRepo_url());
        source.setLive_url(project.getLive_url());
        source.setDescription(project.getDescription());
        source.setImg_url(project.getImg_url());

        add(source);
    }
}
