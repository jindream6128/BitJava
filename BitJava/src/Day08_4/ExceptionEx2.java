package Day08_4;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExceptionEx2 {

	public void interruptedException() {
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
				if (i % 7 == 0)
					System.out.println();

				System.out.printf("%5d", i);
				if (i % 5 == 0) {
					throw new InterruptedException();
				}
			} catch (InterruptedException e) {
				System.out.println("InterruptedException...!");
				e.printStackTrace();
			}
		}
	}

	// try 안에 > 또다른 try 가능하고 Catch 안에 > 또다른 Catch도 가능하다.
	public void iOException() {
		FileInputStream fis = null;

		try {
//		System.out.println("Data: ");
			File file = new File("D:\\abc");
			file.mkdir();
			file.createNewFile();

			fis = new FileInputStream(new File("D:\\ExceptionEx2.java"));
			int tmp = 0;

			// file의 시작 BOF file의 끝 -1 -> 한글자씩 받아 올꺼다.
//			while((tmp = fis.read()) != -1){
//				Thread.sleep(100);
//				System.out.print((char)tmp);
//			}

			byte[] arr = new byte[1000];
			fis.read(arr);
			System.out.println(new String(arr).trim());

			System.out.println(System.in.read());
		} catch (Exception e) {
			e.printStackTrace();
		}

//		} catch (IOException e) {
//			e.printStackTrace();
//		} catch(InterruptedException e) {
//			e.printStackTrace();
//		}

		// catch는 다중으로 가능하다.
		finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (Exception e2) {

				}
			}
		}
	}

	public static void main(String[] args) {
		ExceptionEx2 e = new ExceptionEx2();
		e.iOException();
	}

}
