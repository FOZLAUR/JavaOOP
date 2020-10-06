package model;

public class Student {
    public String name;
    private int age;
    private String gender;
    private int idNum;

    public Student(String name, int age, String gender, int idNum) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idNum = idNum;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public void displayStudentData(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("ID Number: "+idNum);
        System.out.println("");
    }
}
