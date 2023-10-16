package model;

public class Student extends Person{

    private static double minPoint = 6.0;
    private static double topPoint = 8.0;
    private static double minGrants = 80.0;
    private static double topGrants = 150.0;
    private double avgPoint;
    private double parentsMoney;

    public Student() {
    }

    public Student(String name, double avgPoint, double parentsMoney) {
        super(name);
        this.avgPoint = avgPoint;
        this.parentsMoney = parentsMoney;
    }

    public double getAvgPoint() {
        return avgPoint;
    }



    public double getParentsMoney() {
        return parentsMoney;
    }

    public void setParentsMoney(double parentsMoney) {
        this.parentsMoney = parentsMoney;
    }

    public double grants() {
        double result = avgPoint >= topPoint ? topGrants :(avgPoint >= minPoint ? minGrants : 0);
//        if (avgPoint >= topPoint) {
//            result = topGrants;
//        } else {
//            if (avgPoint >= minPoint) {
//                result = minGrants;
//            }
//        }
        return result;
    }

    @Override
    public double income() {
        return (parentsMoney + grants());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", avgPoint=" + avgPoint +
                ", parentsMoney=" + parentsMoney +
                ", income=" + income() +
                '}';
    }












}
