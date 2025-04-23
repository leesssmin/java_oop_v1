package com.polymorphism;

public class Banana extends Fruit {

    String origin; //원산지를 담을수 있는 공간 선언


    public Banana() {
        name = "델몬트 바나나";
        price = 3000;
        origin = "필리핀";
    }

    public void saleBanana() {
        System.out.println("지금은 할인 행사 기간 입니다");
        System.out.println("이 방송이 나간 이루 (메서드 호출) 바나나 가격을 천원 할인 합니다.");
        price -= 1000;
    }


}
