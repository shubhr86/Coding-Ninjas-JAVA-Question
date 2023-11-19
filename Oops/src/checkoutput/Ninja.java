package checkoutput;

class Student{
    String name;
    int rollNo;

    // Constructor 1
    Student(int num){
            rollNo = num;
            name = "abc";
    }   

    // Constructor 2
    Student(int num, String str){
            rollNo = num;
            name = str;
    }

    public void print(){
            System.out.print(name +" " + rollNo+" ");
    }
}