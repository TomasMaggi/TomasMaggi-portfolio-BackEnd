package com.AP.portfolio.Education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/education/")
public class EducationController {

    @Autowired
    private EducationService service;

    @GetMapping()
    @ResponseBody
    public List<EducationEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    @ResponseBody
    public EducationEntity find(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping()
    public void add(@RequestBody EducationEntity entity) {
        service.add(entity);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("{id}")
    public void edit(@PathVariable Long id,
                     @RequestBody EducationEntity entity) {
        service.edit(id, entity);
    }
}
