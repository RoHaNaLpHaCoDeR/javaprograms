class MyEmployee{
    private int id;
    private String name;
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

public class CWH_CH9_30_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee Rohan = new MyEmployee();
        Rohan.setId(60);
        Rohan.setName("CodeWithRohan");
        System.out.println(Rohan.getId());
        System.out.println(Rohan.getName());

    }
}
