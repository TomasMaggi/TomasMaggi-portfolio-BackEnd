package com.AP.portfolio.Experience;

import java.util.List;

public interface IExperienceService {
    public List<ExperienceEntity> getAll();
    public ExperienceEntity getById(Long id);
    public void add(ExperienceEntity experience);
    public void delete(Long id);
    public void edit(Long id, ExperienceEntity experience);
}
