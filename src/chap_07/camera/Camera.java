package chap_07.camera;

public class Camera { // 부모 클래스
    public String name; // 인스턴스 변수

    public Camera() {
        this.name = "카메라";
    }

    public void takePicture() {
        // 사진 촬용
        System.out.println(this.name + ": 사진을 촬영합니다.");
    }

    public void recordVideo() {
        // 동영상 촬영
        System.out.println(this.name + ": 동영상을 녹화합니다.");
    }
}
