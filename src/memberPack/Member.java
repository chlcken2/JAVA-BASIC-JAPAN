package memberPack;

import java.util.Arrays;
import java.util.Scanner;

public class Member {
    String[][] memberList = new String[3][3]; // 회원 저장 테이블

    public void register(Scanner sc) {
        for(int i = 0; i < memberList.length; i++) {
            System.out.println("---------"+ (i+1) + "번째 유저 등록 시작---------");
            System.out.print("---id: ");
            String id = sc.next();
            System.out.print("---pw: ");
            String pw = sc.next();
            System.out.print("---phone: ");
            String phone = sc.next();
            System.out.println("---입력된 정보 -> id: " + id + " pw :" + pw + " phone: " + phone);
            this.memberList[i][0] = id;
            this.memberList[i][1] = pw;
            this.memberList[i][2] = phone;
            System.out.println("---"+(i+1)+"번째 회원 등록 성공 : "+ Arrays.toString(this.memberList[i]));
        }

        this.selectAll(); // 반영 결과 출력
    }

    /**
     * 등록된 전체 유저 조회
     */
    public void selectAll(){
        System.out.println("---------등록된 멤버 리스트---------");
        boolean hasMembers = false;
        for (String[] members : this.memberList) {
            if (members[0] != null) {
                hasMembers = true;
                System.out.println("---등록된 회원 id : " + members[0]);
                System.out.println("---등록된 회원 pw : " + members[1]);
                System.out.println("---등록된 회원 phone : " + members[2]);
            }
        }
        if(!hasMembers) {
            System.out.println("---등록된 회원 id가 없습니다.---");
        }
        System.out.println("---------전체 조회 끝---------");
    }

    /**
     * 상세 유저 조회
     */
    public void select(Scanner sc){
        System.out.println("---------상세 조회 시작---------");
        System.out.println("---상세 조회할 유저 id를 입력하세요.---");
        String findId = sc.next();
        boolean hasMembers = false;

        for (int i = 0; i < this.memberList.length; i++) {
            if (this.memberList[i][0] != null && this.memberList[i][0].equalsIgnoreCase(findId)) {
                hasMembers = true;
                System.out.println("---상세 조회 유저 조회 성공---");
                System.out.println("---상세 조회 유저 id:" + this.memberList[i][0]);
                System.out.println("---상세 조회 유저 pw:" + this.memberList[i][1]);
                System.out.println("---상세 조회 유저 phone:" + this.memberList[i][2]);
                break;
            }
        }

        if(!hasMembers) {
            System.out.println("---------상세 조회 유저 조회 실패 - 조회된 id 유저가 없습니다---------");
        }
    }

    /**
     * id　기반 수정
     */
    public void edit(Scanner sc){
        System.out.println("---------수정 시작---------");
        System.out.println("---수정할 유저 id를 입력하세요.---");
        String findId = sc.next();
        boolean hasMembers = false; // 수정할 유저를 못찾을 경우 출력을 위한 플래그 값

        for(int i = 0; i < this.memberList.length; i++) {
            if(this.memberList[i][0] != null && this.memberList[i][0].equalsIgnoreCase(findId)) {
                System.out.println("---id: " + this.memberList[i][0]+ " 상세 조회 유저 조회 성공---");
                hasMembers = true;
                boolean canEditFlag = true;

                while(canEditFlag) {
                    System.out.println("---id　수정: 1번 / pw 수정: 2번 / phone 수정: 3번 / 이외 번호 수정 취소 ---");
                    int editType = sc.nextInt();
                    switch (editType) {
                        case 1:
                            System.out.println("---수정할 id를 입력하세요---");
                            String editId = sc.next();
                            this.memberList[i][0] = editId;
                            break;
                        case 2:
                            System.out.println("---수정할 pw를 입력하세요---");
                            String editPw = sc.next();
                            this.memberList[i][1] = editPw;
                            break;
                        case 3:
                            System.out.println("---수정할 phone을 입력하세요---");
                            String editPhone = sc.next();
                            this.memberList[i][2] = editPhone;
                            break;
                        default :
                            System.out.println("---수정 취소---");
                            canEditFlag = false;
                            break;
                    }
                }
                System.out.println("---수정된 유저 id:" + this.memberList[i][0]);
                System.out.println("---수정된 유저 유저 pw:" + this.memberList[i][1]);
                System.out.println("---수정된 유저 유저 phone:" + this.memberList[i][2]);
                break;
            }
        }

        if(!hasMembers){
            System.out.println("---수정을 위해 조회된 유저가 없습니다.---");
        }
        this.selectAll(); // 반영결과 출력
    }

    /**
     * id 기반 미구현
     */
    public void delete(Scanner sc){
        System.out.println("---------삭제 시작---------");
        System.out.println("---삭제할 유저 id를 입력하세요.---");
        String findId = sc.next();
        boolean hasMembers = false;

        for(int i = 0; i < this.memberList.length; i++) {
            if (this.memberList[i][0] != null && this.memberList[i][0].equalsIgnoreCase(findId)) {
                System.out.println("---id: " + this.memberList[i][0] + " 삭제할 유저 조회 성공---");
                System.out.println("--- 삭제 => 1   |    취소 => 2 ---");
                hasMembers = true;
                int type = sc.nextInt();
                if(type == 1) {
                    this.memberList[i][0] = null;
                    this.memberList[i][1] = null;
                    this.memberList[i][2] = null;
                }
            }
        }
        if(!hasMembers) {
            System.out.println("--- 삭제할 유저 id를 조회할 수 없습니다 입력값 => " + findId + "---");
        }

        System.out.println("---반영 결과---");
        this.selectAll();
    }
}
