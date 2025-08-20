package beginning;
public class aimy {
    String name;
    String birthday;
    int age;

    void setprice (int age){
        this.age = age; 
    }
    
    public static void main(String[] args) {
/* im making a password combination for her
 * cause why not
 */
        aimy aimiel = new aimy();
        aimiel.name = "Khrzzy aimiel villanueva";
        aimiel.birthday = "march 31 2006";
        aimiel.age = 19;
        aimiel.setprice(aimiel.age + 1);
        System.out.println(aimiel.age);
    }   

}

