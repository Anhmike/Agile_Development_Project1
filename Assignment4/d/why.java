package d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
 
public class why {
     
    public static void main(String a[]){
         //Custom list
        List<person> list = new ArrayList<person>();
        list.add(new person("John",3000));
        list.add(new person("Sam",6000));
        list.add(new person("Tom",2000));
        list.add(new person("Lesley",2400));
        list.add(new person("April",4000));
        list.add(new person("Chris",5000));
        Collections.sort(list,new MyPriceComp());
        System.out.println("Sorted list entries: ");
        for(person e:list){
            System.out.println(e);
        }
    }
}
 //Sorting price in ascending order (change sign for descending order)
class MyPriceComp implements Comparator<person>{
 
    @Override
    public int compare(person e1, person e2) {
        if(e1.getPrice() > e2.getPrice()){
            return 1;
        } else {
            return -1;
        }
    }
}
 
class person{
     
    private String name;
    private int price;
     
    public person(String n, int s){
        this.name = n;
        this.price = s;
    }
     
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int salary) {
        this.price = salary;
    }
    public String toString(){
        return "Name: "+this.name+"-- Price: "+this.price;
    }
}