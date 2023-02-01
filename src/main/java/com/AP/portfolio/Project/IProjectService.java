package com.AP.portfolio.Project;

import java.util.List;


public interface IProjectService {
    public List<ProjectEntity> getAll();
    public ProjectEntity getById(Long id);
    public void add(ProjectEntity project);
    public void delete(Long id);
    public void edit(Long id, ProjectEntity project);
}
