package encapsulation26;

/**
 * 26. Encapsulations example (Create package name ‘encapsulation26’ and create all below classes in this package)
 * public class Encapsulate {
 * PRIME TESTING
 * // private variables declared these can only be accessed by public methods of class
 * private String name;
 * private int rollNo;
 * private int age;
 * //set method for name to access private variable name
 * public void setName(String name) {
 * this.name = name;
 * }
 * // get method for Name to access private variable age
 * public String getName() {
 * return name;
 * }
 * // get method for roll to access private variable rollNo
 * public int getRollNo() {
 * return rollNo;
 * }
 * // set method for roll to access private variable rollNo
 * public void setRollNo(int rollNo) {
 * PRIME TESTING
 * this.rollNo = rollNo;
 * }
 * // get method for age to access private variable age
 * public int getAge() {
 * return age;
 * }
 * // set method for age to access private variable age
 * public void setAge(int age) {
 * this.age = age;
 * }
 * public class TestEncapsulation {
 * public static void main(String[] args) {
 * Encapsulate obj = new Encapsulate();
 * // setting values of the variables
 * obj.setName("Amit");
 * obj.setAge(19);
 * obj.setRollNo(51);
 * // Displaying values of the variables
 * System.out.println("Prime's name: " +
 * obj.getName());
 * System.out.println("Prime's age: " +
 * PRIME TESTING
 * obj.getAge());
 * System.out.println("Prime's rollNo: " +
 * obj.getRollNo());
 * // Direct access of rollNo is not possible due to
 * encapsulation
 * // System.out.println("Prime's rollNo : " +
 * obj.geekName);
 * }
 * }
 */

public class Encapsulate {

    //private variables declared these can only be accessed by public method of class

    private String name;
    private int rollNo;
    private int age;

    // get method for Name to access private variable Name

    public String getName() {

        return name;

    }

    //set method for name to access private variable name

    public void setName(String name) {

        this.name = name;
    }

    // get method for rollNo to access private variable rollNo

    public int getRollNo() {

        return rollNo;

    }

    // set method for rollNo to access private variable rollNo
    public void setRollNo(int rollNo) {

        this.rollNo = rollNo;
    }

    //get method for age to access private variable age

    public int getAge() {

        return age;
    }

    //set method for age to access private variable age
    public void setAge(int age) {

        this.age = age;
    }
}
