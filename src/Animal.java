public class Animal {
    private String name;
            private int age;
            private boolean ucmaq;

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

    public boolean isUcmaq() {
        return ucmaq;
    }

    public void setUcmaq(boolean ucmaq) {
        this.ucmaq = ucmaq;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ucmaq=" + ucmaq +
                '}';
    }

    public Animal(String name, int age, boolean ucmaq) {
        this.name = name;
        this.age = age;
        this.ucmaq = ucmaq;


    }
}
