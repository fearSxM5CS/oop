import java.util.Random;

public class Company {

    // private Random random = new Random();


    private String name;

    private Publisher jobAgency;

    // private int maxSalary;

    public Company(String name, Publisher jobAgency){
        this.jobAgency = jobAgency;
        this.name = name;
        // this.maxSalary = maxSalary;
    }

    public void needEmployee(){
        // int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name);
    }


}
