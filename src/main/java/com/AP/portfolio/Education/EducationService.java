package com.AP.portfolio.Education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService implements IEducationService{

    @Autowired
    private EducationRepository repo;

    @Override
    public List<EducationEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public EducationEntity getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void add(EducationEntity education) {
        repo.save(education);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void edit(Long id, EducationEntity education) {
        EducationEntity source = getById(id);

        source.setTitle(education.getTitle());
        source.setType(education.getType());
        source.setInstitution(education.getInstitution());
        source.setDescription(education.getDescription());
        source.setDate_of_start(education.getDate_of_start());
        source.setDate_of_finish(education.getDate_of_finish());

        add(source);
    }
}
