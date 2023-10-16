package model;

//абстрактный класс
public abstract class Person {
    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //создаем абстрактный метод - без реализации
    public abstract double income();

    public static double avgIncome(Person[] people){
        double avgIncome = 0.0;
        for (Person person : people) {
            avgIncome += person.income();
        }
        avgIncome /= people.length;
        return avgIncome;
    }

}