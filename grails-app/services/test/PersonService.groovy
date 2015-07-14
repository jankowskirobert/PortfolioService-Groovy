package test

import grails.transaction.Transactional

@Transactional
class PersonService {

    def serviceMethod() {

    }
	Person createPerson(String name, int age){
		Person p = new Person()
		p.name = name + " YOLO"
		p.age = age
		p.save()
		return p
	}	

}
