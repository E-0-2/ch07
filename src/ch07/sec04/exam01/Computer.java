package ch07.sec04.exam01;

public class Computer extends Calculator{
    @Override // @ 를 어노테이션이라 부르다.
    public double areaCircle(double r){
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r;
    }
}
