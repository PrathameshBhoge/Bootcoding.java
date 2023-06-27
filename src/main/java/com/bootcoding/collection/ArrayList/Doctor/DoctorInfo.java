package main.java.com.bootcoding.collection.ArrayList.Doctor;

public class DoctorInfo {
    String name;
    int age;
    String education;
    String type;

    public DoctorInfo(String name, int age, String education, String type) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.type = type;
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

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DoctorInfo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
