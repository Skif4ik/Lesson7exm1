import model.Employee;
import model.Person;
import model.Student;

public class Main1 {
    //Есть работники и студенты. Известно, что у них есть некий ежемесячный доход. У каждой
    //социальной группы людей есть своя формула определения ежемесячного дохода. Работники
    //получают зарплату, но из нее вычитается подоходный налог. Студенты получают карманные
    //деньги от родителей, а также могут получать стипендию, в зависимости от их среднего балла (6.0
    //и выше: 80р, 8.0 и выше: 150р). Сгруппировать 4 людей в один массив, вывести информацию о
    //всех людях (с учетом ежемесячного дохода). Определить средний ежемесячный доход среди
    //студентов и среди работников. С помощью переопределенного метода equals сравнить людей из
    //массива с отдельно заданным студентом. В этом мире люди считаются равными, если их
    //ежемесячные доходы равны.

    public static void main(String[] args) {

        Person[] people = {
                new Employee("Vasya", 1000),
                new Student("Vitya", 4, 2000),
                new Employee("Masha", 1500),
                new Student("Kolya", 8.5, 150),
                new Student("Sasha", 6.5, 200)
        };

        for (Person person : people) {
            System.out.println(person);
        }

//        double avgIncome = 0.0;
//        for (Person person : people) {
//            avgIncome += person.income();
//        }
//        avgIncome /= people.length;
        System.out.println("Средний доход среди всех: " + Person.avgIncome(people));

        double avgIncomeStudent = 0.0;
        int studentCounter = 0;
        for(Person person : people){
            if(person instanceof Student) { //instanceof - определяет принадлежность обьекта к классу или подлклассу
                avgIncomeStudent += person.income();
                studentCounter++;
            }
        }

        //проверка studentCounter!=0
        avgIncomeStudent /= studentCounter;
        System.out.println("Средний доход среди студентов: " + avgIncomeStudent);



    }
}
