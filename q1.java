public class q1{
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "Tee";
        s1.ID = 65000777;
        s1.addmissionyear = 2578;
        s1.GPA = 3.50;
        s1.ShowDetails();
    }

}
class Student{
    private int ID ;
    private String name;
    private int addmissionyear;
    private Double GPA;

    Student(){
        this.ID = 1;
        this.name = "no name";
        this.addmissionyear = 1;
        this.GPA = GPA;
    }    
    Student(String newname){
        this.name = newname;
    }
    Student(String name,int ID,int addmissionyear,Boolean GPA){
        this.name = name;
        this.ID =  ID;
        this.addmissionyear =  addmissionyear;

    }
    public double getGPA(){
        return(GPA);
    }
    public void ShowDetails(){
        System.out.println("name : " +  this.name);
        System.out.println("ID : " + this.ID);
        System.out.println("addmissionyear : "+ this.addmissionyear);
        System.out.println("GPA : " + this.getGPA());
    }
}