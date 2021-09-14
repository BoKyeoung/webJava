package ch03;

// 제네릭 자료형
public class GenericPrinter <T> {

	// T 라는 대체문자를 사용. E => element, K => key, V => value (아무 문자나 사용가능, 개발자간의 약속)
	// 자료형 매개변수 ( type parameter )
	// 이 클래스를 사용하는 시점에서 실제 사용할 자료형을 지정.
	
	private T material; // T 자료형으로 선언한 변수
	
	public T getMaterial() { // T 자료형을 반환하는 제네릭 메서드
		return material;
	}
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	// toString 오버라이드
	@Override
	public String toString() {
		return material.toString();
	}
	
}
