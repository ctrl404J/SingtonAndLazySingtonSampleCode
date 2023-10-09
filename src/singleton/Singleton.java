package singleton;

public class Singleton {
	
//	1. 생성하려는 목표 객체를 private static final로 생성한다. 
//	(static은 클래스가 로드될 때 한번만 초기화 하고 모든 객체가 공유 하도록 한다.)
//	2. 생성자를 private로 선언한다. 
//	(비록 private static final로 생성했지만 생성자가 public이면 이미 생성한 객체가 아닌 다른 객체를 생성할 수 있기 때문이다.)
//	3. 이미 생성한 목표 객체를 획득하는 메소드 getInstance()는 public으로 해서 외부에서 획득하도록 한다.

	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton() {
		
	}
	
	public Singleton getInstance() {
		
		return INSTANCE;
		
	}
	
}
