package Day5;

//?ã§?òï?Ñ± 
//Spring Framework -> Ï°∞Î¶ΩÍ∏?
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Stack;

public class ObjectEx4 {
	public InputStream getBufferedInput() throws Exception {
		
		return new FileInputStream(new File(""));
	}
	
	public List getList() {
		return new Stack();
	}
	
	public void methodObj1() {
		System.out.println("Data");
		BufferedInputStream bis = null;
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = null;
		try {
//			new BufferedInputStream(new FileInputStream(new File(new StringBuffer().toString())));
			
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(br.readLine());
//			System.out.println(System.in);
		}catch(Exception e){
			
		}
		
	}
	
	//ObjectÍ∞? Î®ºÏ? Î©îÎ™®Î¶¨Ïóê ÎßåÎì§?ñ¥Ïß?Í≥? Double(object())
	//instacneof Í∞? ?óÜ?úºÎ©? ?ã§?òï?Ñ±?ùÑ Íµ¨ÌòÑ ?ï†?àò ?óÜ?ã§. !!!!!!!!!
	public void methodObj2(Object value) {
		if(value instanceof Double) {
			System.out.println(((Double)value).doubleValue());
		}
		if(value instanceof String) {
			System.out.println(((String)value).substring(0));
		}
		
	}
	
	
	public static void main(String[] args) {
		
		ObjectEx4 o = new ObjectEx4();
		o.methodObj1();
		o.methodObj2("10");

	}

}
