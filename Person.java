import java.math.BigDecimal;

public class Person {

    public static final String HEIGHT = "100";

    private String name;
    private BigDecimal salary;
    private String pesel;
    private String surname;


    public Integer age() {
        return 42;
    }

    public String whatIsYourHobby() {
        return "pizza";
    }

    public void hello() {
        System.out.println("Hello!");
    }

}
