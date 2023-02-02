package com.AP.portfolio.Contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService implements IContactService{

    private final ContactRepository repo;

    public ContactService(ContactRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<ContactEntity> getAll() {
        return repo.findAll();
    }

    @Override
    public ContactEntity getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void add(ContactEntity contact) {
        repo.save(contact);
    }

    @Override
    public void delete(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void edit(Long id, ContactEntity contact) {
        ContactEntity source = getById(id);

        source.setType(contact.getType());
        source.setUrl((contact.getUrl()));

        add(source);
    }
}
