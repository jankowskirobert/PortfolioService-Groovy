package test
class BootStrap {

    def init = { servletContext ->
        if (Person.count() == 0) {
            new Person(name: 'John', age: 20).save()
		}
	}
    def destroy = {
    }
}
