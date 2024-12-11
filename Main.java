public class Main {
    public static void main(String[] args) {
        BaseCreditManager[] baseCreditManager= new BaseCreditManager[]{
            new StudentCreditManager(),new TeacherCreditManager()
        };
        for(BaseCreditManager creditManager:baseCreditManager){
            System.out.println(creditManager.creditCalculate(1000.0));
        }

    }
}
