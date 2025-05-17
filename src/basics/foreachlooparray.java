package basics;

public class foreachlooparray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int sum=0;
		/*for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}*/
		// TODO Auto-generated method stub
		for(int x:arr) {
			sum+=x;
			
		}
		System.out.println(sum);

	}

}
