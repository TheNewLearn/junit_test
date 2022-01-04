import static org.junit.Assert.*;
import org.junit.Test;
public class StudentTest {
    Student s1 = new Student(95);
    Student s2 = new Student(101);
    Student s3 = new Student(89);
    Student s4 = new Student(81);
    Student s4_1 = new Student(90);
    Student s5 = new Student(79);
    Student s6 = new Student(75);
    Student s7 = new Student(80);
    Student s8 = new Student(69);
    Student s9 = new Student(65);
    Student s10 = new Student(70);
    Student s11 = new Student(59);
    Student s12 = new Student(25);
    Student s13 = new Student(60);
    Student s14 = new Student(-1);

    Student b1 = new Student(-1);
    Student b2 = new Student(0);
    Student b3 = new Student(1);
    Student b4 = new Student(99);
    Student b5 = new Student(100);
    Student b6 = new Student(101);
   
    @Test
    public void testgrade(){
        assertEquals(s1.checkgrade(),"A");
        assertEquals(s2.checkgrade(),"X");
        assertEquals(s3.checkgrade(),"B");
        assertEquals(s4.checkgrade(),"B");
        assertEquals(s4_1.checkgrade(),"A");
        assertEquals(s5.checkgrade(),"C");
        assertEquals(s6.checkgrade(),"C");
        assertEquals(s7.checkgrade(),"B");
        assertEquals(s8.checkgrade(),"D");
        assertEquals(s9.checkgrade(),"D");
        assertEquals(s10.checkgrade(),"C");
        assertEquals(s11.checkgrade(),"F");
        assertEquals(s12.checkgrade(),"F");
        assertEquals(s13.checkgrade(),"D");
        assertEquals(s14.checkgrade(),"X");
    }

    @Test
    public void testband(){
        assertEquals("X", b1.checkgrade());
        assertEquals("F", b2.checkgrade());
        assertEquals("F", b3.checkgrade());
        assertEquals("A", b4.checkgrade());
        assertEquals("A", b5.checkgrade());
        assertEquals("X", b6.checkgrade());
    }
}
