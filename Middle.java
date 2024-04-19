public class Middle implements Observer{

    
    private String name;
    private int salary;
    private String prof;

    public Middle(String name){
        this.name = name;
       salary = 50000;
       prof = "mid";
    }

    @Override
    public String toString() {
        return "Middle [name=" + name + ", salary=" + salary + ", prof=" + prof + "]";
    }

    @Override
    public void receiveOffer(Vacancy vacancy, Publisher publisher) {
        
    
        if (this.salary <=  vacancy.getSalary()){
            System.out.printf("Мидл %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                    name, vacancy.getCompanyName(), vacancy.getSalary());
            this.salary =  vacancy.getSalary();
            publisher.removeObserver(this);
        }
        else {
            System.out.printf("Мидл %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
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
