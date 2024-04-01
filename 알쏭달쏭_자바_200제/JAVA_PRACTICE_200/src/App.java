
public class App {
    public static void main(String[] args) throws Exception {
        Practice1_1 Quiz = new Practice1_1(); // 올바른 객체 생성 방식
        Quiz.solve();
    }
}

class Practice1_1 {
    public Practice1_1() {
    }

    public void solve() {
        System.out.println("첫 Java 프로그램입니다.");
        System.out.println("화면에 출력하고 있습니다.");
    }
}