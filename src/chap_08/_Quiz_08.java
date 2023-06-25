package chap_08;

import chap_08.camera.SpeedCam;
import chap_08.detector.AccidentDetector;
import chap_08.reporter.VideoReporter;

// 인터페이스를 이용하여 과속단속 카메라에 교통 사고 감지 및 신고 기능을 추가하시오.
// 과속단속 카메라인 SpeedCam 클래스의 detect(), report() 개선
// 교통 사고를 감지하는 AccidentDetector 클래스 신규 생성
// 신고 기능은 기존에 작성된 VideoReporter 클래스 활용
// 모든 클래스는 적절한 위치에 정의

// 실행결과
// 교통 사고를 감지합니다.
// 직전 30초 영상과 함께 신고를 진행합니다.

public class _Quiz_08 {
    // 주어진 코드를 통해 테스트 하시오.
    public static void main(String[] args) {
        SpeedCam speedCam = new SpeedCam();
        speedCam.setDetector(new AccidentDetector());
        speedCam.setReporter(new VideoReporter());
        speedCam.detect();
        speedCam.report();
    }
}