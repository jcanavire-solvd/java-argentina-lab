package Personal;

import java.util.Objects;

public abstract class Person {
    private int dni;
    private String name;
    private int age;

    public Person() {    }

    public Person(int dni, String name, int age) {
        this.dni = dni;
        this.name = name;
        this.age = age;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getDni() == person.getDni() && getAge() == person.getAge() && getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDni(), getName(), getAge());
    }

}
