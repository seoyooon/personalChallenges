import java.io.*;
import java.util.*;

public class TV2 {
    public static class Television {
        int menu;
        boolean powerBtn; // 전원 버튼
        int vlmBtn; // 볼륨 버튼
        int chnBtn; // 채널 버튼
        String currentStatus; // 현재 상태 출력
        String btn;
        public Television() {
            this.menu = 0;
            this.powerBtn = false; // 기본 설정이 "OFF"
            this.vlmBtn = 0;
            this.chnBtn = 0;
            this.currentStatus = null;
            this.btn = "END";
        }

        public Television(int menu, boolean powerBtn, int vlmBtn, int chnBtn, String currentStatus, String btn) {
            this.menu = menu;
            this.powerBtn = powerBtn;
            this.vlmBtn = vlmBtn;
            this.chnBtn = chnBtn;
            this.currentStatus = currentStatus;
            this.btn = btn;
        }

        // 전원 버튼을 변경하는 메서드
        public void setPowerBtn() {
            powerBtn = !powerBtn;
            System.out.println("전원을 변경합니다." + (powerBtn ? "[ON]" : "[OFF]"));
        }

        // 볼륨을 변경하는 메서드

        public void setVlmBtn() {
            System.out.print("볼륨을 변경합니다 > ");
        }

        // 채널을 변경하는 메서드
        public void setChnBtn() {
            System.out.print("채널을 변경합니다 > ");
        }

        // 현재 상태를 출력하는 메서드 (전원, 볼륨, 채널 버튼을 현재 상태로 변경하기)
        public void getCurrentStatus() {
            System.out.print("전원 : " + powerBtn + "\n"
                    + "볼륨 : " + vlmBtn + "\n"
                    + "채널 : " + chnBtn);
        }

        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            Television television = new Television();
            System.out.println("[원하는 메뉴를 입력해 주세요]" + "\n"
                    + "1. 전원 변경" + "\n"
                    + "2. 볼륨 상태 변경" + "\n"
                    + "3. 채널 상태 변경" + "\n"
                    + "4. 상태 확인" + "\n"
                    + "5. 종료를 원하면 END를 입력해 주세요.");

            try {
                television.menu = Integer.parseInt(br.readLine());
                switch (television.menu) {
                    case 1: // 1. 전원 변경
                        television.setPowerBtn();
                        break;

                    case 2: // 2. 볼륨 상태 변경
                        television.setVlmBtn();
                        television.vlmBtn = Integer.parseInt(br.readLine());
                        if (television.vlmBtn < 1 || television.vlmBtn >= 100) {
                            System.out.println("[ERROR] 1~100 사이의 값을 입력해 주세요.");
                        }
                        else {
                            System.out.println("볼륨을 " + television.vlmBtn + "으로 변경합니다.");
                        }
                        break;

                    case 3: // 3. 채널 상태 변경
                        television.setChnBtn();
                        television.chnBtn = Integer.parseInt(br.readLine());

                        if (television.chnBtn < 1 || television.chnBtn >= 50) {
                            System.out.println("[ERROR] 1~50사이의 값을 입력해 주세요.");
                        }
                        else {
                            System.out.println("채널을 " + television.chnBtn + "번으로 변경합니다.");
                        }
                        break;

                    case 4: // 4. 상태 확인
                        television.getCurrentStatus();
                        break;

                    default: // 1~4번 외의 입력
                        System.out.println("범위 외의 값입니다. 1~4번 중 해당하는 번호를 입력해 주세요.");

                }
            }
            catch (NumberFormatException var11) {
                switch (television.btn) {
                    case "END" :
                        System.out.println("시스텝을 종료합니다.");
                }
            }
        }
    }
}
