package test

class PersonController {
	def personService
   // def scaffold = Person
	def index(){
//		redirect (action:show)
	}
	def create(){
		def person = personService.createPerson(params.name, params.age.toInteger())
		[person:person]
//		Person p = new Person()
//		p.properties = params
//		p.save()
		respond person		
	}
	def show(){
		def persons = Person.list()
	        [persons:persons]
	}	
}
