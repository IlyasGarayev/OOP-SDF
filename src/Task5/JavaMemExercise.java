package Task5;

public class JavaMemExercise {
/*
    Step 1:
    Stack: person referansı əlavə olunur.
    Heap: person obyekti əlavə olunur.
    person.name = "Test", person.age = 23


    Step 2:
    Stack: Yeni person əlavə olunur
    Heap: "Stack"də olan hər iki person referans person obyektinə referans edir.
    person.name = "Test", person.age = 23

    Step 3:
    Stack: Heç bir dəyişiklik olmur.
    Heap: person.name = "Test", person.age = 25

    Step 4:
    Stack: Heç bir dəyişlik olmur.
    Heap: Yeni person obyekti yaranır.
    person.name = "Test", person.age = 25
    person.name = "Test", person.age = 23

    Step 5:
    Stack: Heç bir dəyişlik olmur.
    Heap:
    person.name = "Test", person.age = 25
    person.name = "Test2", person.age = 23

    Step 6:
    Stack: İkinci person referansı silinir.
    Heap: İkinci person obyekti silinir
    person.name = "Test", person.age = 25

*/
    public static void main(String[] args) {
        Person person = new Person("Test", 23);

        System.out.println(test(person));
        System.out.println(person);
    }

    private static int test(Person person) {
        person.setAge(25);
        person = new Person("Test", 23);
        person.setName("Test2");
        return person.age;
    }

    private static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person name: " + this.name + ", age: " + this.age;
        }
    }
}
