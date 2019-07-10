import java.util.LinkedList;
import java.util.List;

public class Subject {

public String subjectName;
public List<Double> gradesList = new LinkedList<Double>();

  public Subject(String subjectName){
      this.subjectName = subjectName;
  }

    public String getSubjectName() {
        return subjectName;
    }

    public void addGrade(double grade){
      gradesList.add(grade);
    }

    public double calculateAverage(){

      double gradesSum = 0;

        for (int i = 0; i < gradesList.size(); i++) {

            gradesSum += gradesList.get(i);


        }
       return gradesSum / gradesList.size();
    }

}
