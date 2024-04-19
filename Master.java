

public class Master implements Observer{

    private String name;
    private int salary;
    private String prof;

    public Master(String name){
        this.name = name;
        salary = 80000;
        prof = "sen";
    }

    @Override
    public String toString() {
        return "Master [name=" + name + ", salary=" + salary + ", prof=" + prof + "]";
    }

    @Override
    public void receiveOffer(Vacancy vacancy, Publisher publisher) {
        if (this.salary <=  vacancy.getSalary()){
            System.out.printf("Мастер %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary());
            this.salary =  vacancy.getSalary();
            publisher.removeObserver(this);
        }
        else {
            System.out.printf("Мастер %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
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
