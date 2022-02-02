import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class Cat {
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    private  String name;
    public String getName(String name){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Cat(){}
    public Cat(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String print() {
        return "Cat name :" + name + "  " + "age :" + age;
    }
}
