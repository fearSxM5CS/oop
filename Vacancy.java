public class Vacancy {
    private static int cnt;
    private int id;
    private String companyName;
    private String prof;
    private int salary;    
    private String txt;

    
    

    public Vacancy(String companyName, String prof,  int salary, String txt) {
        
        cnt++;
    
        this.id = cnt;
        this.prof = prof;
        this.txt = txt;
        this.salary = salary;
        this.companyName = companyName;
    }

 
        public Vacancy(String companyName, String prof,  int salary) {
        
        
        this(companyName, prof,  salary,"Нет описания вакансии");
    
    }   

    public int getId() {
        return id;
    }


    public String getProf() {
        return prof;
    }


    public String getTxt() {
        return txt;
    }


    public int getSalary() {
        return salary;
    }


    public String getCompanyName() {
        return companyName;
    }


    public void setId(int id) {
        this.id = id;
    }


    public void setProf(String prof) {
        this.prof = prof;
    }


    public void setTxt(String txt) {
        this.txt = txt;
    }


    public void setSalary(int salary) {
        this.salary = salary;
    }


    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    @Override
    public String toString() {
        return "Vacancy [id=" + id + ", companyName=" + companyName + ", prof=" + prof + ", salary=" + salary + ", txt="
                + txt + "]";
    }

    

}
