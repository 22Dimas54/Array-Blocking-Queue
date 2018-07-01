import java.util.concurrent.ArrayBlockingQueue;

public class Main {
	private static ArrayBlockingQueue<Object> list = new ArrayBlockingQueue<>(1000);

	public static void main(String[] args) {

		addObject();
		proceed();
	}

	private static void addObject() {
		for(int i=0;i<5;i++) {
			list.add(new Object());
		}
	}

	private static void proceed() {
		System.out.println("Размер массива сначала: "+list.size());
		for(Object element: list) {
			list.remove(element);
		}
		System.out.println("Размер массива в конце: "+list.size());
	}

}
