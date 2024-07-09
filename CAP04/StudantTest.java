public class StudantTest{
    public static void main(String[] args) {
        Studant account1 = new Studant("Lucas Barbosa",  93.75);
        Studant account2 = new Studant("Luiz Fernando",72.75);
   
        System.out.printf("%s's letter grade is: %s%n",
            account1.getName(), account1.getLetterGrade());
         System.out.printf("%s's letter grade is: %s%n",
            account2.getName(), account2.getLetterGrade());
    }
}