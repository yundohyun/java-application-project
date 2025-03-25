package week_4;

class User {
  private String name;
  private int age;

  User(String name, int age) {
    this.name = name;
    this.age = age;
  }

  String getName() {
    return this.name;
  }

  void setName(String name) {
    this.name = name;
  }

  int getAge() {
    return this.age;
  }

  void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("이름 : %s, 나이 : %d", this.name, this.age);
  }
}
