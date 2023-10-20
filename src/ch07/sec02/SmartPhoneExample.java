package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args){
        SmartPhone myPhone = new SmartPhone("갤럭시","은색");

        System.out.println("모텔: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        System.out.println("와이파이 상태: " +myPhone.wifi);

        myPhone.bell();
        myPhone.sendVoice("여보세요");
        myPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
        myPhone.sendVoice("아~ 네, 반값습니다.");

        myPhone.hangup();

        //SmartPhone의 메소드 호출

        myPhone.setWifi(true);
        myPhone.internet();
    }
}
