public class Student{
    private int mark;
    public Student(int mark){
        this.mark = mark;
    }

    public String checkgrade(){
        String grade = "";
        if(this.mark >= 90 && this.mark <= 100){
            grade = "A";
        }else if(this.mark >= 80 && this.mark < 90){
            grade = "B";
        }
        else if(this.mark >= 70 && this.mark < 80){
            grade = "C";
        }
        else if(this.mark >= 60 && this.mark < 70){
            grade = "D";
        }
        else if(this.mark > 100 || this.mark < 0){
            grade = "X";
        }
        else{
            grade = "F";
        }
        return grade;
    }
}