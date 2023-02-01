package com.AP.portfolio.Persona;

import java.util.List;

public interface IPersonaService {
    public List<PersonaEntity> getAll();
    public PersonaEntity getById(Long id);
    public void add(PersonaEntity persona);
    public void delete(Long id);
    public void edit(Long id, PersonaEntity persona);
}
