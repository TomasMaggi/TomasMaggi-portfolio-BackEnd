package com.AP.portfolio.Skill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService implements ISkillInterface{

    @Autowired
    private SkillRepository repo;

    @Override
    public List<SkillEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public SkillEntity getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void add(SkillEntity skill) {
        repo.save(skill);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void edit(Long id, SkillEntity skill) {
        SkillEntity source = getById(id);

        source.setTechnology(skill.getTechnology());
        source.setPercentage(skill.getPercentage());
        source.setIcon_url(skill.getIcon_url());

        add(source);
    }
}
