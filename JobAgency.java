

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class JobAgency implements Publisher {

    private ArrayList<Observer> observers = new ArrayList<>();
    private Collection<Vacancy>  vacancies = new ArrayList<>();
    
    public Collection<Vacancy> getVacancies() {
        return vacancies;
    }



    public void addVacancy(Vacancy vacancy) {
        this.vacancies.add(vacancy);
    }

    public void listVacancies ()
    {
        System.out.println("Cписок вакансий");
        for (Vacancy vacancy : vacancies) {
            System.out.println(vacancy);
        }
        System.out.println();
    }

    
    public void sendOffer(String companyName){
        

        ArrayList<Observer> observersiter =  new ArrayList<>();
        //Collections.copy(observersiter, observers);
        observersiter.addAll(observers);
        for (Vacancy vacancy : vacancies) {
        
             if (companyName.equals(vacancy.getCompanyName()))
             {
                     for (Observer observer : observersiter){
            
                              if (observer.getProf().equals(vacancy.getProf())) {
                                  observer.receiveOffer(vacancy, this);
                             }
                     }
              }
        }
    }



    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }



    @Override
    public void listObserver() {
        System.out.println("Cписок наблюдателей");
        for (Observer observer : observers) {
            System.out.println(observer);
        }
        System.out.println();

    }

}
