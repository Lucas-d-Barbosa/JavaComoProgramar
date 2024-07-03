public class Date {
    private int year;
    private int month;
    private int day;

    public Date(){

    }

    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String getYear() {
        return String.format("%d", this.year);
    }

    public String getMonth() {
        return month > 10 ?
            String.format("%d", this.month):
            String.format("0%d", this.month);
    }

    public String getDay() {
        return day > 10 ?
            String.format("%d", this.day):
            String.format("0%d", this.day);
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String displayDate(){
        return String.format("%s/%s/%s", getDay(), getMonth(), getYear());
    }
}
