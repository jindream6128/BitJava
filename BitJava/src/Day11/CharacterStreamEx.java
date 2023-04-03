package Day11;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class CharacterStreamEx {

	// 무조건 던지는게 능사가아님
	public void fileCopy() {
		Scanner sc = null;
		BufferedOutputStream bos = null;
		try {
			sc = new Scanner(new File("D:\\testForder\\origin.txt"));
			bos = new BufferedOutputStream(new PrintStream(new File("D:\\testForder\\cw.txt")));

			while (sc.hasNext()) {
//			Thread.sleep(100);
//			System.out.println(sc.nextLine());
				// buffer 가 차기전 까지는 내용이 복사가 안된다. !
				// concat으로 \r\n 한다음에 getbyte로 바꿔주면 똑같이 나옴
				bos.write(sc.nextLine().concat("\r\n").getBytes());
				// flush를 해주어야 다 차지 않아도 출력이 된다. -> close 안했을때로 가정
//			bos.flush();
			}
			System.out.println("FileCopy Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		// close를 안해주면 flush가 호출되지 않으므로 flush를 수동으로 호출하던지 finally에 close 해준다
		finally {
			try {
				if (sc != null)
					sc.close();
				if (bos != null)
					bos.close();
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}

	}

	public void fileScanner() {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		BufferedWriter bw = null;
		String tmp = "";
		try {
			System.out.println("OriginFile");
			br = new BufferedReader(new FileReader(new File(sc.nextLine().trim())));
			System.out.println("changeFile");
			bw = new BufferedWriter(new FileWriter(new File(sc.nextLine().trim())));
			//file이 있을때
			while((tmp = br.readLine()) != null) {
				bw.write(tmp.concat("\r\n"));
//				bw.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//메모리 낭비 방지를 위해 try문으로 stream을 닫아 주어야 한다.
			try {
				if(br != null) br.close();
				if(bw != null) bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			System.out.println("file copy 완료");
		}
		
		
	}

	public static void main(String[] args) throws Exception {
		CharacterStreamEx c = new CharacterStreamEx();
//		c.fileCopy();
		c.fileScanner();
	}
}
