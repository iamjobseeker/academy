package generics;

interface Inter1<K> { void method1(K data);}

interface Inter2<L> { void method2 (L data);}

class Class10 <T> implements Inter1<T>, Inter2<T>{

	@Override
	public void method2(T data) {

	}

	@Override
	public void method1(T data) {

	}

}

public class GenericsEx_10_Inheritance {

	public static void main(String[] args) {

	}

}
