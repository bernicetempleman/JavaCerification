public class example2{
	int i = 0;
	public static void main(String args[]){
		int i = 1;
		i = change_i(i);
		System.out.println(i);
	}
	public static int change_i(int i){
		i = 2;
		i *= 2;
		return i;
	}
}