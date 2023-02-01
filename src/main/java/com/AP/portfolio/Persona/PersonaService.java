package com.AP.portfolio.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{

    @Autowired
    private PersonaRepository repo;

    @Override
    public List<PersonaEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public PersonaEntity getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void add(PersonaEntity persona) {
        repo.save(persona);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void edit(Long id, PersonaEntity persona) {
        PersonaEntity source = getById(id);

        source.setFirst_name(persona.getFirst_name());
        source.setLast_name(persona.getLast_name());
        source.setAbout_me_text(persona.getAbout_me_text());
        source.setImg_route(persona.getImg_route());

        add(source);
    }
}
