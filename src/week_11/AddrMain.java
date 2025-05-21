package week_11;

import java.util.ArrayList;
import java.util.Scanner;

public class AddrMain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Addr> list = new ArrayList<>();

    public static void main(String[] args) {
        main:
        while (true) {
            System.out.println("-------------");
            System.out.println("1. 주소록 입력");
            System.out.println("2. 주소록 검색");
            System.out.println("3. 주소록 전체 조회");
            System.out.println("4. 주소록 수정");
            System.out.println("5. 주소록 삭제");
            System.out.println("0. 종료");
            System.out.println("-------------");
            System.out.print("메뉴를 입력하세요 : ");
            switch (sc.nextInt()) {
                case 1 -> addrInput();
                case 2 -> addrSearch();
                case 3 -> addrAll();
                case 4 -> addrUpdate();
                case 5 -> addrDelete();
                case 0 -> { break main; }
                default -> System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
        sc.close();
    }

    static void addrDelete() {
        System.out.print("삭제할 이름을 입력하시오: ");
        String name = sc.next();
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getName().equals(name)) {
                list.remove(i);
                System.out.println(name + "님의 정보가 삭제되었습니다.");
            }
    }

    static void addrUpdate() {
        System.out.print("수정할 이름을 입력하시오: ");
        String name = sc.next();
        for (Addr addr : list)
            if (addr.getName().equals(name)) {
                System.out.print("전화번호를 입력하세요: ");
                String tel = sc.next();
                System.out.print("회사명을 입력하세요: ");
                String com = sc.next();
                addr.setTel(tel);
                addr.setCom(com);
                System.out.println(name + "님의 정보가 수정되었습니다.");
            }
    }

    public static void addrInput() {
        System.out.print("이름을 입력하세요: ");
        String name = sc.next();
        System.out.print("전화번호를 입력하세요: ");
        String tel = sc.next();
        System.out.print("회사명을 입력하세요: ");
        String com = sc.next();
        list.add(new Addr(name, tel, com));
        System.out.println(name + "님의 정보가 추가되었습니다.");
    }

    static void addrAll() {
        System.out.println("모든 주소록 정보");
        for (Addr info: list)
            System.out.println(info);
    }

    static private void addrSearch() {
        System.out.print("검색할 이름을 입력하시오: ");
        String name = sc.next();
        for (Addr addr : list)
            if (addr.getName().equals(name))
                System.out.println(addr);
    }
}
