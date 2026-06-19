class Student{
    String name;
    int roll;
    int marks;
}

public class ArrayObject {

    public static  void main(String args[]){

        Student s1= new Student();
        s1.name="Prashant";
        s1.marks=99;
        s1.roll=12;

        Student s2= new Student();
        s2.name="Rohit";
        s2.marks=98;
        s2.roll=22;

        Student s3= new Student();
        s3.name="Sachin";
        s3.marks=94;
        s3.roll=18;

        // Creating a Arry of object 

        Student students[] = new Student[3];

        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        
        
        // Printing the students array of objects 

        // for(int i=0;i<students.length;i++){
        //     System.out.println(students[i].name +" "+students[i].roll+" "+students[i].marks);
        // }

        // Printing using for each loop

        for(Student std : students){
            System.out.println(std.name +" "+std.roll +" "+std.marks);
        }




        

    }
    
}
