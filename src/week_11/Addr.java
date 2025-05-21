package week_11;

import java.time.LocalDateTime;

public class Addr {
    private String name;
    private String tel;
    private String com;
    private LocalDateTime createDate;

    Addr() {}

    Addr(String name, String tel, String com) {
        this.name = name;
        this.tel = tel;
        this.com = com;
        this.createDate = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    @Override
    public String toString() {
        return String.format("이름 : %s, 전화번호 : %s, 회사명 : %s, 입력시간 : %s", name, tel, com, createDate);
    }
}
