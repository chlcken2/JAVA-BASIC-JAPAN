package employee;

/**
 *      * - 번호에 따른 직급 뽑기
 *      * - 번호에 따른 급여 뽑기
 *      * - 번호에 따른 보너스 뽑기
 *      * - 지급액 계산 -> 급여 + 보너스
 *      * - 메시지 출력 메소드
 */
public class EmpUtils {
    /**
     * 1 = 이사, 2 = 부장, 3 = 과장, 4 = 대리 5=사원
     * @param position
     * @return String
     */
    static public String pickPosition(int position){
        if(position==1) return "이사";
        if(position==2) return "부장";
        if(position==3) return "과장";
        if(position==4) return "대리";
        return "사원";
    }

    /**
     * 이사 급여는 600, 부장 급여는 500, 과장 급여는 400, 대리 급여는 300, 사원 급여는 260
     * @return
     */
    static public int pickBasePay(int position){
        if(position==1) return 600;
        if(position==2) return 500;
        if(position==3) return 400;
        if(position==4) return 300;
        return 260;
    }

    /**
     *  보너스는 이사는 100, 부장은 50 과장은 30 대리는 20 사원은 10
     * @return
     */
    static public int pickBonus(int position){
        if(position==1) return 100;
        if(position==2) return 50;
        if(position==3) return 30;
        if(position==4) return 20;
        return 10;
    }

    /**
     * 기본급+보너스 계산하는 총 지급액
     * @return int
     */
    static public int calcTotalPay(int basePay, int bonus){
        return basePay+bonus;
    }

    static public boolean checkPositionType(int position) {
        return position >= 1 && position <= 5;
    }

}
