package com.AP.portfolio.Persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/persona/")
public class PersonaController {

    @Autowired
    private PersonaService service;

    @GetMapping()
    @ResponseBody
    public List<PersonaEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    @ResponseBody
    public PersonaEntity find(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping()
    public void add(@RequestBody PersonaEntity entity) {
        service.add(entity);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("{id}")
    public void edit(@PathVariable Long id,
                     @RequestBody PersonaEntity entity) {
        service.edit(id, entity);
    }
}
