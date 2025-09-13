package employee_v1.employee;

import java.util.Scanner;

/**
 * 리스트 + 내부 메소드를 통해 값을 출력
 */
public class EmpMain {
    /**
     * 사원번호  이름  직급 급여 보너스 지급액
     * A001   홍길동 과장 400  30  430
     * A002   박길동 부장 500  50  550
     *
     * 사원은 3명이다
     * 직급은 1,2,3,4 번호로 입력 받는다
     * 1 = 이사, 2 = 부장, 3 = 과장, 4 = 대리
     * 이사 급여는 600, 부장 급여는 500, 과장 급여는 400, 대리 급여는 300, 사원 급여는 260
     * 보너스는 이사는 100, 부장은 50 과장은 30 대리는 20 사원은 10
     *
     *[입력예시]
     * 사원번호 이름 직급
     * [메뉴선택]
     * 작업메뉴 선택 [1]사원등록 [2]사원출력 [3]사원검색 [4]사원수정 [5]사원삭제 [0]종료
     *
     * 3-[사원검색]
     * 검색하고 싶은 사원번호 입력 : A301
     * A301 홍길동 과장 400 30 430
     * 검색이 완료되었습니다.
     * 사원번호 확인 바랍니다.
     *
     * 4-[사원수정]
     * 수정하고 싶은 사원번호 입력 : A001
     * A001 홍길동 과장 400 30 430
     * 수정할래요[y/n] : y   // <-대소문자 변환처리
     * 직급[1:이사, 2:부장, 3:과장, 4:대리, 5:사원] : 3
     *
     * 5-[사원삭제]
     * 삭제하고 싶은 사원번호 입력 : A001
     * 1. 사원번호 A001, 이름 : 홍길동인 사원이 삭제되었습니다.
     * 2. 존재하지 않는 사원 번호입니다. 확인 바람
     *
     *
     * 조건
     * 설계
     * [배열 데이터]
     * 직급배열
     * 급여배열
     * 보너스배열
     *
     * [메소드]
     *　사원등록
     * 전체사원출력
     * 사원검색
     * 사원수정
     * 사원삭제
     * 종료
     *
     * [utils]
     * - 번호에 따른 직급 뽑기
     * - 번호에 따른 급여 뽑기
     * - 번호에 따른 보너스 뽑기
     * - 지급액 계산 -> 급여 + 보너스
     * - 메시지 출력 메소드
     */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmpDao empDao = new EmpDao();
        int empArrayIndex = -1;
        while(true) {
            System.out.println("[1]사원등록\t[2]사원출력\t[3]사원검색\t[4]사원수정\t[5]사원삭제\t[0]종료   -  v1 배열 적용");
            int type = sc.nextInt();
            switch (type) {
                case 1:
                    empDao.insert(sc);
                    break;
                case 2:
                    System.out.println("전체 사원 검색 :");
                    empDao.searchAll();
                    break;
                case 3:
                    System.out.println("검색하고 싶은 사원번호 입력 :");
                    empDao.search(sc);
                    break;
                case 4:
                    System.out.println("수정 싶은 사원번호 입력 :");
                    empArrayIndex = empDao.search(sc);
                    if(empArrayIndex >= 0) {
                        empDao.edit(sc, empArrayIndex);
                    }
                    break;
                case 5:
                    System.out.println("삭제 싶은 사원번호 입력 :");
                    empArrayIndex =empDao.search(sc);
                    if(empArrayIndex >= 0) {
                        empDao.delete(sc, empArrayIndex);
                    }
                    break;
                case 0:
                    sc.close();
                    return;
            }
        }
    }
}
