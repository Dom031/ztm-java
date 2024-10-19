package main.java.solvedExercises.random;

public class ObjectsExercises1 {
    public static void main(String[] args) {

        Person person = new Person();
        person.name = "John";
        person.age = 22;
        System.out.println("Person name: " + person.name + " Person Age: " + person.age);
        Car car = new Car();
        car.owner = person;
        car.model = "Clio";
        System.out.println("Car owner: " + car.owner.name + " Car Model: " + car.model);

        int num1 = 2;
        System.out.println(num1);
        modifyNumber(num1);
        System.out.println(num1);
        //pass-by-value, copy of the num1 is passed to the method rather than the actual value
        //so num1 doesn't change.

        modifyPerson(person);
        System.out.println("Person name: " + person.name + " Person Age: " + person.age);
        //passes the value of the Person object and modifies it. Any changes made within the
        //method will save outside the method as well.

    }




    public static void modifyNumber(int num){
        num = num * 2;
    }

    public static void modifyPerson(Person p) {
        p.name = "Dom";
        p.age = 90;
    }

    static class Person {
        String name;
        int age;
    }

    static class Car{
        Person owner;
        String model;
    }
}
