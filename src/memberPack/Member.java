package memberPack;

import java.util.Scanner;

public class Member {

    // 회원 한 명을 표현하는 내부 클래스 (생성자 사용)
    static class User {
        private String id;
        private String pw;
        private String phone;

        public User(String id, String pw, String phone) {
            this.id = id;
            this.pw = pw;
            this.phone = phone;
        }

        public String getId() { return id; }
        public String getPw() { return pw; }
        public String getPhone() { return phone; }

        public void setId(String id) { this.id = id; }
        public void setPw(String pw) { this.pw = pw; }
        public void setPhone(String phone) { this.phone = phone; }

        // id 대소문자 무시 비교 (검색/수정/삭제에서 사용)
        public boolean idEqualsIgnoreCase(String otherId) {
            return this.id != null && otherId != null && this.id.equalsIgnoreCase(otherId);
        }
    }

    private final User[] memberList = new User[3];

    /**
     * 회원 등록 (생성자 사용)
     */
    public void register(Scanner sc) {

        for (int i = 0; i < memberList.length; i++) {
            System.out.println("---------"+ (i+1) + "번째 유저 등록 시작---------");

            // 이미 등록된 자리가 있으면 건너뛰기(빈 자리만 채우기)
            if (memberList[i] != null) {
                System.out.println("---이미 등록된 슬롯입니다: " + memberList[i]);
                continue;
            }

            System.out.print("---id: ");
            String id = sc.next();
            System.out.print("---pw: ");
            String pw = sc.next();
            System.out.print("---phone: ");
            String phone = sc.next();
            System.out.println("---입력된 정보 -> id: " + id + " pw :" + pw + " phone: " + phone);

            // ★ 생성자로 회원 생성
            memberList[i] = new User(id, pw, phone);
            System.out.println("---"+(i+1)+"번째 회원 등록 성공 : " + memberList[i].getId());
        }

        this.selectAll(); // 반영 결과 출력
    }

    /**
     * 등록된 전체 유저 조회
     */
    public void selectAll(){
        System.out.println("---------등록된 멤버 리스트---------");
        boolean hasMembers = false;
        for (User user : memberList) {
            if (user != null) {
                hasMembers = true;
                System.out.println("---등록된 회원 id : " + user.getId());
                System.out.println("---등록된 회원 pw : " + user.getPw());
                System.out.println("---등록된 회원 phone : " + user.getPhone());
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
        boolean found = false;

        for (User user : memberList) {
            if (user != null && user.idEqualsIgnoreCase(findId)) {
                found = true;
                System.out.println("---상세 조회 유저 조회 성공---");
                System.out.println("---상세 조회 유저 id:" + user.getId());
                System.out.println("---상세 조회 유저 pw:" + user.getPw());
                System.out.println("---상세 조회 유저 phone:" + user.getPhone());
                break;
            }
        }

        if(!found) {
            System.out.println("---------상세 조회 유저 조회 실패 - 조회된 id 유저가 없습니다---------");
        }
    }

    /**
     * id 기반 수정
     */
    public void edit(Scanner sc){
        System.out.println("---------수정 시작---------");
        System.out.println("---수정할 유저 id를 입력하세요.---");
        String findId = sc.next();
        boolean found = false;

        for (int i = 0; i < memberList.length; i++) {
            User user = memberList[i];
            if (user != null && user.idEqualsIgnoreCase(findId)) {
                System.out.println("---id: " + user.getId() + " 상세 조회 유저 조회 성공---");
                found = true;
                boolean canEditFlag = true;

                while (canEditFlag) {
                    System.out.println("---id 수정: 1번 / pw 수정: 2번 / phone 수정: 3번 / 이외 번호: 수정 취소 ---");
                    int editType = sc.nextInt();
                    switch (editType) {
                        case 1:
                            System.out.println("---수정할 id를 입력하세요---");
                            user.setId(sc.next());
                            break;
                        case 2:
                            System.out.println("---수정할 pw를 입력하세요---");
                            user.setPw(sc.next());
                            break;
                        case 3:
                            System.out.println("---수정할 phone을 입력하세요---");
                            user.setPhone(sc.next());
                            break;
                        default:
                            System.out.println("---수정 취소---");
                            canEditFlag = false;
                            break;
                    }
                }
                System.out.println("---수정된 유저 id:" + user.getId());
                System.out.println("---수정된 유저 pw:" + user.getPw());
                System.out.println("---수정된 유저 phone:" + user.getPhone());
                break;
            }
        }

        if(!found){
            System.out.println("---수정을 위해 조회된 유저가 없습니다.---");
        }
        this.selectAll(); // 반영결과 출력
    }

    /**
     * id 기반 삭제
     */
    public void delete(Scanner sc){
        System.out.println("---------삭제 시작---------");
        System.out.println("---삭제할 유저 id를 입력하세요.---");
        String findId = sc.next();
        boolean found = false;

        for (int i = 0; i < memberList.length; i++) {
            User user = memberList[i];
            if (user != null && user.idEqualsIgnoreCase(findId)) {
                System.out.println("---id: " + user.getId() + " 삭제할 유저 조회 성공---");
                System.out.println("--- 삭제 => 1   |    취소 => 2 ---");
                found = true;
                int type = sc.nextInt();
                if(type == 1) {
                    memberList[i] = null; // ★ 객체 자체를 삭제
                    System.out.println("---삭제 완료---");
                } else {
                    System.out.println("---삭제 취소---");
                }
                break;
            }
        }
        if(!found) {
            System.out.println("--- 삭제할 유저 id를 조회할 수 없습니다 입력값 => " + findId + "---");
        }

        System.out.println("---반영 결과---");
        this.selectAll();
    }
}
