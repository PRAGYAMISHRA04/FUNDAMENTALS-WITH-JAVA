 class ExamResult {
   public static void main(String[] args) {
        int[] arr = {80,90,50,60,70,55};
        Result res = new Result();
        res.name="Pragya Mishra";
        res.regNo= "19BDS0035";
        res.marks=arr;
        res.cal();
        res.output();
}
}


class Student {
      String regNo;
      String name;
      
}

class Exam extends Student {
     int[] marks = new int[6];
}

class Result extends Exam {
    int totMarks=0;
    void cal() {
       for(int i=0;i<6;i++)
           totMarks += marks[i];
 
    }

    void output() {
       System.out.println("Registration number : " + regNo);
       System.out.println("Name :" + name);
       System.out.println("Total marks out of 300 :" + totMarks);
    }
    
}
