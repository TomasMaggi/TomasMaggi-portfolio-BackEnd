package com.AP.portfolio.Experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService implements IExperienceService{

    @Autowired
    private ExperienceRepository repo;

    @Override
    public List<ExperienceEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public ExperienceEntity getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void add(ExperienceEntity experience) {
        repo.save(experience);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void edit(Long id, ExperienceEntity experience) {
        ExperienceEntity source = getById(id);

        source.setCompany_name(experience.getCompany_name());
        source.setJob_description(experience.getJob_description());
        source.setCompany_logo_url(experience.getCompany_logo_url());
        source.setStart_date(experience.getStart_date());
        source.setFinish_date(experience.getFinish_date());

        add(source);
    }
}
