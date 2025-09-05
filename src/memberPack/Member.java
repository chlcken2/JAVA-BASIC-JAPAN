package memberPack;

import java.util.Arrays;
import java.util.Scanner;

public class Member {
//    int memberCount = 0; // 추후 계선
    String[][] memberList = new String[3][3]; // 회원 row

    /**
     * 회원 등록
     * 예외처리: use validation method
     * @param id
     * @param pw
     * @param phone
     */

    public void register(Scanner sc) {
        System.out.println("---------유저 등록 시작---------");
        for(int i = 0; i < memberList.length; i++) {
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


        for(int i = 0; i < this.memberList.length; i++) {
            System.out.println("---정상 등록된 회원 : " + Arrays.toString(this.memberList[i]));
        }
    }

    /**
     * 등록된 전체 유저 조회
     */
    public void selectAll(){
        System.out.println("---------전체 조회 시작---------");
        for (String[] members : this.memberList) {
            if (members[0] == null) {
                System.out.println("---등록된 회원 id가 없습니다.---");
                break;
            }
            System.out.println("---등록된 회원 id : " + members[0]);
            System.out.println("---등록된 회원 pw : " + members[1]);
            System.out.println("---등록된 회원 phone : " + members[2]);
        }
    }

    /**
     * 상세 유저 조회
     */
    public void select(Scanner sc){
        System.out.println("---------상세 조회 시작---------");
        System.out.println("---상세 조회할 유저 id를 입력하세요.---");
        String findId = sc.next();
        for(int i = 0; i < this.memberList.length; i++) {
            if(memberList[i][0].equalsIgnoreCase(findId)) {
                System.out.println("---상세 조회 유저 조회 성공---");
                System.out.println("---상세 조회 유저 id:" + memberList[i][0]);
                System.out.println("---상세 조회 유저 pw:" + memberList[i][1]);
                System.out.println("---상세 조회 유저 phone:" + memberList[i][2]);
                break;
            }
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
        for(int i = 0; i < this.memberList.length; i++) {
            if(memberList[i][0] != null && memberList[i][0].equalsIgnoreCase(findId)) {
                System.out.println("---id: " + memberList[i][0]+ " 상세 조회 유저 조회 성공---");
                boolean isFlag = true;
                while(isFlag) {
                    System.out.println("---id　수정: 1번 / pw 수정: 2번 / phone 수정: 3번 / 이외 번호 수정 취소 ---");
                    int editType = sc.nextInt();
                    switch (editType) {
                        case 1:
                            System.out.println("---수정할 id를 입력하세요---");
                            String editId = sc.next();
                            memberList[i][0] = editId;
                            break;
                        case 2:
                            System.out.println("---수정할 pw를 입력하세요---");
                            String editPw = sc.next();
                            memberList[i][1] = editPw;
                            break;
                        case 3:
                            System.out.println("---수정할 phone을 입력하세요---");
                            String editPhone = sc.next();
                            memberList[i][2] = editPhone;
                            break;
                        default :
                            System.out.println("---수정 취소---");
                            isFlag = false;
                            break;
                    }
                }
                System.out.println("---수정된 유저 id:" + memberList[i][0]);
                System.out.println("---수정된 유저 유저 pw:" + memberList[i][1]);
                System.out.println("---수정된 유저 유저 phone:" + memberList[i][2]);
                break;
            }
            System.out.println("---수정을 위해 조회된 유저가 없습니다.---");
        }

        this.selectAll();
    }

    /**
     * id기반 삭제
     */
    public void delete(Scanner sc){}



    /**
     * id validation method
     * id가 중복되는지,
     * id가 존
     * @param String Type id
     * @return boolean
     */
    private boolean isDuplicateId(String id) {

        return false;
    }

    private boolean isExistId(String id) {

        return false;
    }

}
