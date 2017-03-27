package Employee类和Manager类测试;

/**
 * Created by scric on 2017/3/27.
 */
public class PersonTest {
    public static void main(String[] args) {

        Person[] people = new Person[2];

        people[0] = new newEmployee("Harry Hacker", 50000, 1989, 10, 1);
        people[1] = new Student("Maria Morris", "computer science");

        for (Person p : people) {
            System.out.println(p.getName() + "," + p.getDescription());
        }

    }
}
