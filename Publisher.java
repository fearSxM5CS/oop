
public interface Publisher {

    void sendOffer(String companyname);

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void listObserver ();
 


}
