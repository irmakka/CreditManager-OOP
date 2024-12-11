public class Main {
    public static void main(String[] args) {
        BaseCreditManager  creditManager=new StudentCreditManager();
        BaseCreditManager creditManager1=new TeacherCreditManager();
         System.out.println(creditManager.creditCalculate(1000));
        System.out.print( creditManager1.creditCalculate(1000));
        

    }
}
