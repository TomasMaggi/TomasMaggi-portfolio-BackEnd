package com.AP.portfolio.Skill;

import java.util.List;

public interface ISkillInterface {
    public List<SkillEntity> getAll();
    public SkillEntity getById(Long id);
    public void add(SkillEntity skill);
    public void delete(Long id);
    public void edit(Long id, SkillEntity skill);
}
