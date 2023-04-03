package Day11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//byteStream, CharacterStream, ObjectStream

//Stream -> 흐름 이다 -> 목적지가 있어야한다.
public class ByteStreamEx {

	public void streamEx1() throws IOException {
		System.out.println("Data: ");
		byte[] contents = new byte[100];
//		System.out.println(System.in.read());
		int rc = System.in.read(contents);
//		for(byte o : contents) {
//			System.out.print(o+ " ");
//		}
		// 왜 +2 이냐 97 13은 엔터랑13 개행10

		System.out.println(new String(contents).trim());
	}

	/*----------------------------------------------------*/
	public void filecopy() {
		BufferedReader br = null; // Reader도 Stream객체 라서 close 해야한다
		// 8부터 try()에 넣어서 수동으로 close 안해 된다
		FileInputStream fis = null;
		FileOutputStream fos = null;
		int size = 0;
		int tmp = 0;

		try {
			System.out.println("FileOrigin: ");
			br = new BufferedReader(new InputStreamReader(System.in));
// 			System.out.print(br.readLine());
			// br = > 콘솔로부터 무언가를 입력받는 객체
			// fis => 파일로부터 무언가를 받아오는 객체
			// trim -> 좌우 공백 제거, replace -> 사이에 공백 제거
			fis = new FileInputStream(new File(br.readLine().trim()));
			System.out.println("FileChange: ");
			fos = new FileOutputStream(new File(br.readLine().trim()));
			// fis.read가 마지막을 만나면 -1
			while ((tmp = fis.read()) != -1) {
				fos.write(tmp);
				size++;
			}
			System.out.println(size + " byte FileCopy Success!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fis != null)
					fis.close();
				if (fos != null)
					fos.close();
			} catch (Exception e) {

			}
		}
	}

	/*----------------------------------------------------------------*/
	// 원본 파일과, copy 파일
	// origin이 원격 경로
	// change가 바꿀 파일의 경로?
	public void fileCopy(String origin, String change) {
		int size = 0;
		int tmp = 0;
		try (FileInputStream fis = new FileInputStream(new File(origin));
				FileOutputStream fos = new FileOutputStream(new File(change));) {
			while ((tmp = fis.read()) != -1) {
				fos.write(tmp);
				size++;
			}
			System.out.println(size + " byte FileCopy Success!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void fileBufferCopy(String origin, String change) throws Exception {
		// 이렇게 try안으로 넣으면 따로 finally에서 close 하지 않아도 된다.
		byte[] cp = new byte[1500];
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File(origin)));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(change)))) {

			bis.read(cp);
			bos.write(new String(cp).trim().getBytes());
			//cp를 String으로 바꾸고, 왼쪽 오른쪽 공백 없애고, getByte로 다시 바이트 배열로 바꿔주기

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ByteStreamEx b = new ByteStreamEx();
//		b.streamEx1();
//		b.filecopy();

		System.out.println("복사할 경로의 파일명을 입력해 주세요");
		String origin = br.readLine().trim();
		System.out.println("복사될 경로의 파일명을 입력해주세요");
		String change = br.readLine().trim();
//		b.fileCopy(origin, change);

		b.fileBufferCopy(origin, change);
		// D:\testForder\origin.txt
		// D:\testForder\test.txt

	}
}


