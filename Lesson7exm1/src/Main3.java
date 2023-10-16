import model.Student;

public class Main3 {
    public static void main(String[] args) {
        Student student1 = new Student("Vasya", 5,100);
        //вторая ссылка насозданный обьект
        Student student2 = student1;
        System.out.println(student1 == student2);
        Student student3 = new Student("Vasya", 5, 100);

        //== сравниваются ссылки на объекты а не сами объекты
        System.out.println(student1 == student3);

    }
}
