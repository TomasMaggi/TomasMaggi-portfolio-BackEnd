package com.AP.portfolio.Contact;

import java.util.List;

public interface IContactService {
    public List<ContactEntity> getAll();
    public ContactEntity getById(Long id);
    public void add(ContactEntity contact);
    public void delete(Long id);
    public void edit(Long id, ContactEntity contact);
}
