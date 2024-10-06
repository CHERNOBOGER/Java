public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Person person = new Person("andre",18,"male");
        person.printPerson();

        person.increaseAge();
        person.changeName("bebur");
        person.printPerson();


    }
    public void printPerson(){
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Пол: " + gender);
    }

    public void changeName(String newName) {
        this.name = newName;
    }
    public void increaseAge(){
        this.age++;
    }
    public String getName() {
        return this.name;
    }

}