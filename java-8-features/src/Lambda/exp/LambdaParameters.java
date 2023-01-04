package Lambda.exp;

interface Addable{
	 
	int  addable(int a, int b);
}
class AddableImpl implements Addable{

	@Override
	public int addable(int a, int b) {
		return a+b;
		
	}
}


public class LambdaParameters {
	public static void main(String[] args) {
		
		Addable ad = ( a, b)-> a+b;
	    int	result=ad.addable(74, 25);
	    System.out.println(result);	    
	    
//		Addable abc = (int c,int d)-> {
//			int m = c+d;
//			return m;
//		};
//	
	

}}
