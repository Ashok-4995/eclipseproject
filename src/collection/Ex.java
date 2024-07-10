package collection;
import java.util.ArrayList;

public class Ex {
	public static void main(String[] args) {
		ArrayList<String>c=new ArrayList<>();
		c.add("india");
		c.add("singapore");
		c.add("USA");
		c.add("thailand");
		c.add("swiz");
		c.add("greenland");
		c.add("iceland");
		c.add("russia");
		c.add("africa");
		c.add("ironland");
		for(int i=0;i<c.size();i++) {
			if(c.get(i).endsWith("a")) {
				System.out.println(c.get(i));
			}
		}
		c.forEach(a->{
			if(a.length()<=5) {
				System.out.println("below 5:"+a);
			}
		});
		String min=c.get(0);
		for(String x:c){
			if(x.length()<min.length()) {
				min=x;
				
			}
			
		}
		System.out.println(min);
		
	}

}
