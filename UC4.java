package Com.Day13_RFP;
class PersonDetails<T,S> {
    T t;
    S s;
    S p;

    PersonDetails(T t, S s){
        this.t = t;
        this.s = s;
    }
    public void display() {
        System.out.println("person "+this.t+" is: "+this.s);
    }
}
public class UC4 {
    public static void main(String[] args) {
        PersonDetails<String, String> std1 = new PersonDetails<>("Name", "Kanhaiya");
        PersonDetails<String, Integer> std2 = new PersonDetails<String, Integer>("Age", 23);
        PersonDetails<String, Float> std3 = new PersonDetails<String, Float>("Percentage", 90.5f);
        PersonDetails<String, Integer> std4 = new PersonDetails<String,Integer>("zip",496574);
        std1.display();
        std2.display();
        std3.display();
        std4.display();
    }
}
