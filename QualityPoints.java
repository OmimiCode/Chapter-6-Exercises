package Chapter6;
/*6.28
        Write a method qualityPoints that inputs a student’s average and returns 4 if it’s 90–100,
        3 if 80–89, 2 if 70–79, 1 if 60–69 and 0 if lower than 60. Incorporate the method into an application
        that reads a value from the user and displays the result.*/
public class QualityPoints {


    private int points;

    public void studentGrade(int grade){
        if(grade < 0 || grade > 100){
           throw new IllegalArgumentException ("enter valid grade between 0 and 100");
        }
        point(grade);
    }

    private void point(int grade) {
        if ( grade >= 90){
          this.points = 4;
        } else if ( grade >= 80 ){
            this.points =3;
        } else if ( grade >= 70 ){
            this.points =2;
        } else if ( grade >= 60 ){
            this.points =1;
        } else{
            this.points =0;
        }
    }


    public int getPoint() {
        return points;
    }
}
