package patterns.creational.prototype;

import java.util.List;

public class PrototypePatternTest
{
    public static void main(String[] args)
    {
        Employees emps1 = new Employees();
        emps1.loadData();
        System.out.println("emps1 : " + emps1.getEmpList());

        //Use clone method to get the new employee Object with same values

        Employees emps2 = (Employees)emps1.clone(); // casting or converting to the same data type of the clone
        System.out.println("emps2 : " +emps2.getEmpList());

        Employees emps3 = (Employees) emps1.clone();// or we can remove it

        List<String> list2 = emps1.getEmpList(); //or emps2.getEmpList();
        list2.add ("Laura");
        System.out.println("emps3 : " + list2);

        List<String> list3 = emps3.getEmpList();//or emps1.getEmpList(); of we want to have it with the new added name
        list3.remove("Marco");
        System.out.println(list3);

    }
}
