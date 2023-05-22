package sobrecargaconstrutor;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data natal = new Data(25, 12, 2023);
		Data data1 = new Data(30);
		Data data2 = new Data();
		Data data3 = new Data(2, 2019);
		
		System.out.println(natal);
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
	}
}
