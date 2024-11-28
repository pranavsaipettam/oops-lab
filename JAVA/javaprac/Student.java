
package javaprac;


public class Student {
    public int rno;
    public String name;
    public float marks;

    Student(int rno, String name, float marks){
        this.rno= rno;
        this.name=name;
        this.marks=marks;
    }

public static void main(String[] arg){

    Student nani = new Student(1,"nani", 100.4f);
    
    System.out.println(nani.rno);
    System.out.println(nani.name);
    System.out.println(nani.marks);

}
}
