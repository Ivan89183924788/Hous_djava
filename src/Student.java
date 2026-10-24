import java.util.ArrayList;
import java.util.List;
import java.util.*;
//
//class Student {
//    private String name;
//    private String group;
//    private int course;
//    private List<Integer> grades;
//
//    public void setCourse(int course) {
//        this.course = course;
//    }
//
//
//
//    public String getName() {
//        return name;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public int getCourse() {
//        return course;
//    }
//
//    public List<Integer> getGrades() {
//        return grades;
//    }
//
//    public Student(String name, String group, int course, List<Integer> grades) {
//        this.name = name;
//        this.group = group;
//        this.course = course;
//        this.grades = grades!=null?grades:new ArrayList<>();
//    }
//
//    public double getAverageGrade(){
//        if(grades.isEmpty()){
//            return 0.0;
//        }
//        int sum=0;
//        for(int grade:grades){
//            sum+=grade;
//        }
//        return (double) sum/grades.size();
//    }
//    @Override
//    public String toString(){
//        return name+ "(" + group + ",курс" + course + "), средний балл:" +String.format("%.2f",getAverageGrade());
//    }
//
//
//}

//21
//class Student implements Comparable<Student> {
//    private String name;
//    private String group;
//    private int age;
//    private double averageScore;
//
//    public String getName() {
//        return name;
//    }
//
//    public String getGroup() {
//        return group;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public double getAverageScore() {
//        return averageScore;
//    }
//
//    public Student(String name, String group, int age, double averageScore) {
//        this.name = name;
//        this.group = group;
//        this.age = age;
//        this.averageScore = averageScore;
//    }
//
//    @Override
//    public int compareTo(Student other){
//        int sredBall=Double.compare(this.averageScore,other.averageScore);
//        if(sredBall!=0){
//            return -sredBall;
//        }
//        return this.name.compareTo(other.name);
//
//    }
//    @Override
//    public String toString(){
//        return String.format("Student{name='%s',group='%s',age=%d,average=%.2f}",
//                name,group,age,averageScore);
//    }
//
//    public static Comparator<Student>byName(){
//        return Comparator.comparing(Student::getName);}
//
//    public static Comparator<Student>byAge(){
//        return Comparator.comparingInt(Student::getAge);}
//
//    public static Comparator<Student>byGroup(){
//        return Comparator.comparing(Student::getGroup);
//    }
//
//}


////22
//class Student {
//    String name;
//    String group;
//    int age;
//    double averageScore;
//
//    Student(String name, String group, int age, double averageScore) {
//        this.name = name;
//        this.group = group;
//        this.age = age;
//        this.averageScore = averageScore;
//    }
//
//    // Раскомментируй эти методы, чтобы увидеть, как всё начинает работать правильно
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Student)) return false;
//        Student other = (Student) o;
//        return age == other.age
//                && Double.compare(averageScore, other.averageScore) == 0
//                && name.equals(other.name)
//                && group.equals(other.group);
//    }
//
//    @Override
//    public int hashCode() {
//        return java.util.Objects.hash(name, group, age, averageScore);
//    }
//
//}