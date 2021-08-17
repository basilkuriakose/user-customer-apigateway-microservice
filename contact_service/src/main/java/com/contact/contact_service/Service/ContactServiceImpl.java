package com.contact.contact_service.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.contact_service.Entity.Contact;
@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list=List.of(
			new Contact(1L,"basil@gmail.com","Basil",101L),
			new Contact(2L,"ansil@gmail.com","ansil",102L),
			new Contact(3L,"bincy@gmail.com","Bincy",103L)
			
			);
	@Override
	public List<Contact> getContactOfUser(Long user_id) {
		return  this.list.stream().filter(contact -> contact.getUser_id().equals(user_id)).collect(Collectors.toList());
	}

	
}
