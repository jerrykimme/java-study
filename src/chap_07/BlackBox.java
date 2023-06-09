package chap_07;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class BlackBox {
    String modelName; // 모델명
    String resolution; // 해상도
    String color; // 색상
    int price; // 가격
    int serialNumber; // 시리얼 번호


    // 위 4가지는 인스턴스 변수
    // static은 클래수 변수, 클래스로부터 만들어진 모든 인스턴스에 적용
    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (시리얼 번호 생성할 때마다 증가)
    static boolean canAutoReport = false; // 자동 보고 기능
    // static 변수는 모든 클래스에서 동일하니 접근 방식 1번을 더 권장한다.
    // 접근 방식 1 : 클래스변수명.static변수명
    // 접근 방식 2 : 객체(인스턴스).static변수명

    // 생성자 : 객체가 생성될 때 자동으로 호출되는 메소드
    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }
    BlackBox(String modelName, String resolution, String color, int price) {
//        this(); // 아무 파라미터가 없는 기본 생성자 호출 (파라미터를 넣으면 그에 맞는 생성자 호출)
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.color = color;
//        this.price = price;
    }

    // Method
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 보고합니다.");
        }
        else {
            System.out.println("자동 보고 기능이 지원되지 않습니다.");
        }
    }

    // Method
    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    // Method
    int getVideoFileCount(int type) {
        if (type == 1) { // 일반 영상
            return 9;
        }
        else if (type == 2) { // 이벤트 영상
            return 1;
        }
        return 10;
    }

    // Method Overloading
    // showDateTime : 날짜 정보 표시 여부
    // showSpeed : 속도 정보 표시 여부
    // min : 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜 정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도 정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    // Method Overloading
    void record() {
        record(true, true, 5);
    }

    // Class Method
    static void callServiceCenter() {
        System.out.println("서비스 센터 (1588-1900) 으로 연결합니다.");
        // modelName = "test"; // 클래스 메소드에서 인스턴스 변수는 접근 불가
        canAutoReport = false; // 클래스 메소드에서 클래스 변수는 접근 가능
    }

    // this
    public void appendModelName(String modelName) {
        // 인스턴스 변수와 매개변수의 이름이 같기 때문에 this를 써줘야한다.
        // modelName += modelName; // 전달받은 인수 + 전달받은 인수가 된다...
        this.modelName += modelName; // 인스턴스 변수 += 전달받은 인수값
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }

    // Getter & Setter
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    // Getter & Setter
    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    // Getter & Setter
    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    // Getter & Setter
    int getPrice() {
        return price;
    }

    // Getter & Setter
    void setPrice(int price) {
        if (price < 100000) {
            this.price = 100000;
        }
        else {
            this.price = price;
        }
    }

    // Getter & Setter
    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
