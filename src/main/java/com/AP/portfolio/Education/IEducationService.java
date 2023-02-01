package com.AP.portfolio.Education;

import java.util.List;

public interface IEducationService {
    public List<EducationEntity> getAll();
    public EducationEntity getById(Long id);
    public void add(EducationEntity education);
    public void delete(Long id);
    public void edit(Long id, EducationEntity education);
}
