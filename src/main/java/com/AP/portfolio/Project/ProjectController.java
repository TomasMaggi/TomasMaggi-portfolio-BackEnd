package com.AP.portfolio.Project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/project/")
public class ProjectController {

    @Autowired
    private ProjectService service;

    @GetMapping()
    @ResponseBody
    public List<ProjectEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    @ResponseBody
    public ProjectEntity find(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping()
    public void add(@RequestBody ProjectEntity entity) {
        service.add(entity);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("{id}")
    public void edit(@PathVariable Long id,
                     @RequestBody ProjectEntity entity) {
        service.edit(id, entity);
    }
}
