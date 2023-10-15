package lazySingleton;

//게으른 초기화(Lazy Initialization)는 객체가 실제로 필요할 때까지 생성을 늦추는 기술입니다. 게으른 초기화를 사용하는 이유는 성능 최적화와 자원 효율성 때문입니다.

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
