package com.contact.contact_service.Service;

import java.util.List;

import com.contact.contact_service.Entity.Contact;

public interface ContactService {

	public List getContactOfUser(Long user_id);
}
