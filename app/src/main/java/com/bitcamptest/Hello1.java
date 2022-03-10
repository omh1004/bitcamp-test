package com.bitcamptest;

public class Hello1 {

  public static void main(String[] args) {
    System.out.println("팀원1입니다.");
    System.out.println("충돌테스트");
    haha();
    System.out.println("빌런");
  }

  static void haha() {
    System.out.println("hahahahaha");
    haha();
    System.out.println("빌런");
  }

  static void haha() {
    System.out.println("hahahahaha");
    haha();
    System.out.println("빌런");
  }

  static void haha() {
    System.out.println("hahahahaha");
  }
}
