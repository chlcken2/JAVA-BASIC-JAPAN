package employee;

public class Emp {
    String empNum; //사원번호
    String name;
    int position; //직급 1, 2, 3, 4, 5
    int basePay;
    int bonus;
    int totalPay;


    public Emp(){}

    public Emp(String empNum, String name, int position, int basePay, int bonus){
         this.empNum=empNum;
         this.name=name;
         this.position=position;
         this.basePay=basePay;
         this.bonus=bonus;
    }
}
