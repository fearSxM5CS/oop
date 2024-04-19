

public class Student implements Observer{

    private String name;
    private int salary;
    private String prof;

    public Student(String name){
        this.name = name;
        prof ="jun";
        salary = 5000;
    }




    
    @Override
    public String toString() {
        return "Student [name=" + name + ", salary=" + salary + ", prof=" + prof + "]";
    }





    @Override
    public void receiveOffer(Vacancy vacancy, Publisher publisher) {
        if (this.salary <=  vacancy.getSalary()){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary());
            this.salary =  vacancy.getSalary();
            //System.out.println(this);
            publisher.removeObserver(this);
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary());
        }
    }





    public String getName() {
        return name;
    }





    public int getSalary() {
        return salary;
    }





    public String getProf() {
        return prof;
    }
}
