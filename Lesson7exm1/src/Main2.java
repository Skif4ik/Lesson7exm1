import model.Person;
import model.Student;

import java.lang.reflect.Field;

public class Main2 {
    public static void main(String[] args) throws NoSuchFieldException {
        //Методы класса Object

        //toString()- для строкового предстовления объекта, в дальнейшем
        //эту строку можно куда либо вывести или записать

        //finalize() - можно переопределить в классе
        //этот метод будет вызван автоматически при освобождении памяти, выделенной для объекта класса

        Student student1 = new Student("Vasya", 5 ,100);
        //метод getClass позволяет получить информацию о классе, на основе которого создан объект
        Class clazz = student1.getClass();
        System.out.println(clazz);
        System.out.println(clazz.getSimpleName());
        System.out.println(clazz.getClassLoader().getName());

//        //использовать возможно рефлексии (обращаться к закрытым полям, вызывать
//        // закрытые метода)
//        Field field = student1.getClass().getDeclaredField("avgPoint");
//        field.setAccessible(true);
//        field.set(student1, 10);
//        System.out.println(student1);

        //можно проверить на принадлежность к классу
        if (student1.getClass() == Student.class) {
            System.out.println("Объект класса Student");
        }

        Person person1 = student1;

        if (person1.getClass() == Student.class) {
            System.out.println("Объект класса Student");
        }


//        if(student1.getClass() == Person.class){
//            System.out.println("Student это Person");
//        }

        if (student1 instanceof Person) {
            System.out.println("Student это Person");
        }

        System.out.println("-------------------------------------------");

        //вторая ссылка на созданный объект
        Student student2 = student1;
        System.out.println(student1 == student2);
        Student student3 = new Student("Vasya", 5, 100);

        //== сравниваются ссылки на объекты, а не сами объекты
        System.out.println(student1 == student3);
    }

}
