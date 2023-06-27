package main.java.com.bootcoding.collection.ArrayList.Employee;

public class EmployeeInfo {
    String name;
    float Experience;
    float Salary;
    int age;

    public EmployeeInfo(String name, float experience, float salary, int age) {
        this.name = name;
        Experience = experience;
        Salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getExperience() {
        return Experience;
    }

    public void setExperience(float experience) {
        Experience = experience;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "name='" + name + '\'' +
                ", Experience=" + Experience +
                ", Salary=" + Salary +
                ", age=" + age +
                '}';
    }
}
