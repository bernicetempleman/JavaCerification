public class example4 {
	int i[] = {0};
	public static void main(String args[]){
		int i[] = {1};
		change_i(i);
		System.out.println(i[0]);
		
	}
	public static void change_i(int i[]){
		int j[] = {2};
		i = j;
		for(int index = 0; index< i.length; index++)
			System.out.println(i[index]);
		System.out.println("leaving change_i");
	}
}