import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class PersonTest {

    @Test
    public void testDefaultConstructor() {
        Person person = new Person();

        Assert.assertEquals("", person.getName());
        Assert.assertEquals(LocalDate.of(1900, 1, 1), person.getDob());
        Assert.assertEquals("", person.getGender());
        Assert.assertEquals("", person.getPhone());
    }

    @Test
    public void testParameterizedConstructor() {
        String name = "John Doe";
        String dob = "1990-05-11";
        String gender = "Male";
        String phone = "1234567890";

        Person person = new Person(name, dob, gender, phone);

        Assert.assertEquals(name, person.getName());
        Assert.assertEquals(LocalDate.parse(dob), person.getDob());
        Assert.assertEquals(gender, person.getGender());
        Assert.assertEquals(phone, person.getPhone());
    }

    @Test
    public void testSetName() {
        Person person = new Person();
        String name = "John Doe";
        person.setName(name);

        Assert.assertEquals(name, person.getName());
    }

    @Test
    public void testSetDob() {
        Person person = new Person();
        String dob = "1990-05-11";
        person.setDob(dob);

        Assert.assertEquals(LocalDate.parse(dob), person.getDob());
    }

    @Test
    public void testSetGender() {
        Person person = new Person();
        String gender = "Male";
        person.setGender(gender);

        Assert.assertEquals(gender, person.getGender());
    }

    @Test
    public void testSetPhone() {
        Person person = new Person();
        String phone = "1234567890";
        person.setPhone(phone);

        Assert.assertEquals(phone, person.getPhone());
    }
}
