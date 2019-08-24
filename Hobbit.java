public class Hobbit implements Comparable<Hobbit>{

    // when we implement Comparable interface we are forced to compare our object with another based on some attribute.
    // only one type compare.

    private String name;
    private int age;
    private double height;

    public Hobbit(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    @Override
    public int compareTo(Hobbit other) {
        if(this.height >= other.height) {
            return 1;
        } else if (this.height < other.height) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public String toString() {
        return this.name + " [age: " + this.age + ", height: " + this.height + "]"; 
    }

}