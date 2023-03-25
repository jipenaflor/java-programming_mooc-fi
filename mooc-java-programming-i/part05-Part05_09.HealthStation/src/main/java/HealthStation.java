
public class HealthStation {

    private int ctr; 
    
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.ctr++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(weigh(person)+1);
    }
    
    public int weighings() {
        return this.ctr;
    }
}
