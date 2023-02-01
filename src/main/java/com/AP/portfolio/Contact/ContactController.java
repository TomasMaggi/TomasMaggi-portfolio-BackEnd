package com.AP.portfolio.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/contact/")
public class ContactController {

    @Autowired
    private ContactService service;

    @GetMapping()
    @ResponseBody
    public List<ContactEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("{id}")
    @ResponseBody
    public ContactEntity find(@PathVariable Long id) {
        return service.getById(id);
    }

    @PostMapping()
    public void add(@RequestBody ContactEntity entity) {
        service.add(entity);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("{id}")
    public void edit(@PathVariable Long id,
                     @RequestBody ContactEntity entity) {
        service.edit(id, entity);
    }
}
