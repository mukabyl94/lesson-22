public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) throws WrongAgeException {
        this.name = name;
        if (age<0) {
            this.age = age;
        }else {
            throw new WrongAgeException("jash tura emes");
        }
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

    public void setAge(int age) throws WrongAgeException {
        if (age > 0 ){
            this.age = age;
        }
        else{
            throw new WrongAgeException("jash tura emes");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
