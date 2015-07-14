package test

class Person {
    String name
    int age
    static constraints = {
	name(blank: false)
	age(blank:false)
    }
}
