package patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{  // to implement an existing Interface in JAVA

    private List<String> empList;

    public Employees(){
        empList = new ArrayList<String>();
    }

    public Employees(List<String > list){
        this.empList = list;
    }

    // Read all employees from data base & put them into the list
    public void loadData() {
        empList.add("Fabio");
        empList.add("Luca");
        empList.add("Marco");
        empList.add("Giovanni");
    }
    public List<String> getEmpList() {
        return empList;
    }
    //Cloning part using by using also "Object" which represents any kind of object generic in JAVA
    public Object clone() {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) { // or without " this. "
            temp.add(s);
        }
        return new Employees(temp);
    }
}
