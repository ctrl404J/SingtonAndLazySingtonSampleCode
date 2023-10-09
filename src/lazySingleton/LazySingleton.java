package lazySingleton;

public class LazySingleton {
    // private static 내부 정적 클래스를 통한 게으른 초기화(Lazy Initialization) 방법
    private static class SingletonHelper {
        // 최초 Singleton 인스턴스화시에 한 번만 실행되는 초기화 블록
        private static final LazySingleton INSTANCE = new LazySingleton();
    }

    // 외부에서 인스턴스화를 막기 위해 private 생성자
    private LazySingleton() {
        // Singleton 생성자의 코드
    }

    // 외부에서 싱글톤 인스턴스에 접근할 수 있는 메서드
    public static LazySingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}