package employee;

import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

/**
 * 사원등록
 *      * 전체사원출력
 *      * 사원검색
 *      * 사원수정
 *      * 사원삭제
 */
public class EmpDao {
    /**
     * 사원번호  이름  직급 급여 보너스 지급액
     * A001   홍길동 과장 400  30  430
     *  A002   박길동 부장 500  50  550
     * @param sc
     */

    Emp[] empInfo = new Emp[3];
    public void insert(Scanner sc) {
        for(int i = 0; i< this.empInfo.length; i++) {
            System.out.print("회원 등록 사원번호: ");
            String empNum = sc.next();
            System.out.print("회원 등록 이름: ");
            String name = sc.next();
            System.out.print("회원 등록 직급 1 = 이사, 2 = 부장, 3 = 과장, 4 = 대리: ");
            int position = sc.nextInt();

            if(!EmpUtils.checkPositionType(position)) {
                System.out.println("올바른 회원 직급 번호를 입력하세요.");
                continue;
            }

            int basePay = EmpUtils.pickBasePay(position);
            int bonus = EmpUtils.pickBonus(position);
            empInfo[i] = new Emp(empNum,name,position, basePay, bonus);

            System.out.println("회원번호 :" + empNum + "회원이 등록되었습니다.");
        }
    }

    public void edit(Scanner sc){
        System.out.println("수정 싶은 사원번호 입력 :");
        String empNum = sc.next();
        System.out.println("사원번호  이름  직급  급여  보너스  지급액");
        boolean hasEmp = false;
        boolean isEdited = false;

        for(int i = 0; i< this.empInfo.length; i++) {
            if(empInfo[i] != null && empInfo[i].empNum.equalsIgnoreCase(empNum)) {
                hasEmp = true;
                System.out.println(this.empInfo[i].empNum + "  " + this.empInfo[i].name + "  " + EmpUtils.pickPosition(this.empInfo[i].position) + "  " + this.empInfo[i].basePay + "  " + this.empInfo[i].bonus + "  " + EmpUtils.calcTotalPay(this.empInfo[i].basePay, this.empInfo[i].bonus));
                System.out.println("수정할래요[y/n] :");
                String editType = sc.next();

                if(editType.equalsIgnoreCase("y")) {
                    System.out.println("직급[1:이사, 2:부장, 3:과장, 4:대리, 5:사원] :");
                    int position = sc.nextInt();
                    if(!EmpUtils.checkPositionType(position)) {
                        System.out.println("올바른 회원 직급 번호를 입력하세요.");
                        return;// 구현 귀찮아서 그냥 종료처리
                    }
                    empInfo[i] = new Emp(empNum,this.empInfo[i].name,position, this.empInfo[i].basePay, this.empInfo[i].bonus);
                    isEdited = true;
                }
            }
        }

        if(!hasEmp) {
            System.out.println("검색된 회원이 없습니다. 사원번호 확인 바랍니다.");
            System.out.println();
        } else if(!isEdited) {
            System.out.println("수정을 취소했습니다.다시 확인 바랍니다.");
            System.out.println();
        } else {
            System.out.println("수정 완료되었습니다." +empNum +"회원의 사원번호 확인 바랍니다.");
            System.out.println();
        }
    }

    public void searchAll(){
        System.out.println("사원번호  이름  직급  급여  보너스  지급액");
        boolean hasEmp = false;

        for(int i = 0; i< this.empInfo.length; i++) {
            if(empInfo[i] != null) {
                hasEmp = true;
                System.out.println(this.empInfo[i].empNum + "  " + this.empInfo[i].name + "  " + EmpUtils.pickPosition(this.empInfo[i].position) + "  " + this.empInfo[i].basePay + "  " + this.empInfo[i].bonus + "  " + EmpUtils.calcTotalPay(this.empInfo[i].basePay, this.empInfo[i].bonus));
            }
        }
        if(!hasEmp) {
            System.out.println("검색된 회원이 없습니다. 사원번호 확인 바랍니다.");
            System.out.println();
        } else {
            System.out.println("검색이 완료되었습니다. 사원번호 확인 바랍니다.");
            System.out.println();
        }
    }

    public int search(Scanner sc){
        String empNum = sc.next();
        System.out.println("사원번호  이름  직급  급여  보너스  지급액");
        boolean hasEmp = false;
        int empIndex = -1;
        for(int i = 0; i< this.empInfo.length; i++) {
            if(empInfo[i] != null && empInfo[i].empNum.equalsIgnoreCase(empNum)) {
                hasEmp = true;
                empIndex = i;
                System.out.println(this.empInfo[i].empNum + "  " + this.empInfo[i].name + "  " + EmpUtils.pickPosition(this.empInfo[i].position) + "  " + this.empInfo[i].basePay + "  " + this.empInfo[i].bonus + "  " + EmpUtils.calcTotalPay(this.empInfo[i].basePay, this.empInfo[i].bonus));
            }
        }
        if(!hasEmp) {
            System.out.println("검색된 회원이 없습니다. 사원번호 확인 바랍니다.");
            System.out.println();
            return empIndex;
        } else {
            System.out.println("검색이 완료되었습니다. 사원번호 확인 바랍니다.");
            System.out.println();
            return empIndex;
        }
    }
    public void delete(Scanner sc, int index){
        System.out.println("사원번호 " +empInfo[index].empNum + "이름 : " + empInfo[index].name + "인 사원이 삭제되었습니다.");
        empInfo[index] = null;
    }
}
