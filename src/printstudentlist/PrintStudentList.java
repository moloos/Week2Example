/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package printstudentlist;

/**
 *
 * @author shira
 */
public class PrintStudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Student[] list = new Student[3]; // array of objects
        //create object for 3 student, sotre and print value
        Student s1 = new Student();
        s1.setName("peter");
        s1.setAge(23);
        Student s2 = new Student();
        s2.setName("ranbir");
        s2.setAge(23);
        Student s3 = new Student();
        s3.setName("vani");
        s3.setAge(20);
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        for(int i=0;i<list.length;i++)
        {
            System.out.println(list[i].getName()+ ", " + list[i].getAge());
        }
    }

}
