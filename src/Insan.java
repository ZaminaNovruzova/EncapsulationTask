public class Insan {
    private String name;
    private int hundurluk;
    private int ceki;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHundurluk() {
        return hundurluk;
    }

    public void setHundurluk(int hundurluk) {
        this.hundurluk = hundurluk;
    }

    public int getCeki() {
        return ceki;
    }

    public void setCeki(int ceki) {
        this.ceki = ceki;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Insan{" +
                "name='" + name + '\'' +
                ", hundurluk=" + hundurluk +
                ", ceki=" + ceki +
                ", age=" + age +
                '}';
    }

    public Insan(String name, int hundurluk, int ceki, int age) {
        this.name = name;
        this.hundurluk = hundurluk;
        this.ceki = ceki;
        this.age = age;



    }
}
