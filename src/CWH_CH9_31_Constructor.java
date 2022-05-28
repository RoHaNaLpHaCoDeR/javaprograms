class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id =45;
        name = "Aman jain";
    }
    public MyMainEmployee(String myName,int d){
        id =d;
        name = myName;
    }


    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class CWH_CH9_31_Constructor {
    public static void main(String[] args) {
        MyMainEmployee rohan = new MyMainEmployee("Programming with harry",74);
//        rohan.setId(34);
//        rohan.setName("Rohan Arora");
        System.out.println(rohan.getId());
         System.out.println(rohan.getName());
    }
}
