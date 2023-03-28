package Day07;
/**********Important***********/
public class AnonyMousEx {
	private int x,y;
	private AbleInterFace i = new AbleInterFace() {
		
		@Override
		public void validata() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void fileOpen() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void fileCheck() {
			// TODO Auto-generated method stub
			
		}
	};
	
	public void anonymousMethod1() {
		//new AbleInterface(); //->안된다. 미완성된 추상클래스 , 즉 미완성된 설계도로 객체를 만들수 없다.
		new AbleInterFace() { //익명 클래스 영역 (Anonymous)
			int yy;
			//yy = 10; 안된다
			@Override
			public void validata() {
				
			}
			
			@Override
			public void fileOpen() {
				
			}
			
			@Override
			public void fileCheck() {
				System.out.println("fileCheck");
				x=99;
				AnonyMousEx.this.x = 1000;
			}
		}.fileCheck();

	}
	
	public static void main(String[] args) {
		AnonyMousEx a = new AnonyMousEx();
		a.anonymousMethod1();
	}

}
