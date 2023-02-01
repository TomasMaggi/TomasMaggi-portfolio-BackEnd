package com.AP.portfolio.Experience;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/experience/")
public class ExperienceController {

    @Autowired
    private ExperienceService service;

    @GetMapping()
    @ResponseBody
    public List<ExperienceEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    @ResponseBody
    public ExperienceEntity find(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping()
    public void add(@RequestBody ExperienceEntity entity) {
        service.add(entity);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("{id}")
    public void edit(@PathVariable Long id,
                     @RequestBody ExperienceEntity entity) {
        service.edit(id, entity);
    }
}
