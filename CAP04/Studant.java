public class Studant{
    private String name;
    private Double average;
   
    public Studant(String name, Double average) {
            this.name = name;
            this.average = average >= 0.0  && 
                average <= 100.0 ? 
                    average : 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAverage() {
        return average;
    }

    public void setAverage(Double average) {
        this.average = average >= 0.0  && 
            average <= 100.0 ? 
                average : this.average;
    }

    public String getLetterGrade(){
        String letterGrade = "";
        if(this.average >= 90)
            letterGrade = "A";
        else if(average >= 80)
            letterGrade = "B";
        else if(average >= 70)
            letterGrade = "C";
        else if(average >= 60)
            letterGrade = "D";
        else
            letterGrade = "F";
            
        return letterGrade;
    }
   
}