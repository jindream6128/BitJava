package Array;

import java.util.Scanner;

//최댓값ㅇ, 최소값ㅇ, 근사값ㅇ, 편차ㅇ, 최빈값ㅇ, 합계ㅇ, 평균ㅇ, 평균이상 개수ㅇ, 평균 이하 개수ㅇ
public class OneArray {

    private int[] m = new int[10]; //난수들이 저장되는 값
    StringBuilder sb = new StringBuilder(); //근삿 값 ( 찾는 값이 10 이고 8 과 12 일때 둘다 들어감)
    StringBuilder sb1 = new StringBuilder(); //편차 저장


    // 배열에 Random 값 넣기
    public OneArray() {
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 100)+1; //1부터 100까지의 난수 발생
        }
//    		m= new int[]{0,0,0,0,1,2,3,4,5,6};
    }

    // 출력하기
    public void print(int k) {
    	
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        
        System.out.println("최댓값: " + maxValue(1));
        System.out.println("최솟값: " + minValue(1));
        System.out.println("총합: " + totalSum());
        System.out.println("평균: " + totalAvg());
        System.out.println("평균 이상의 갯수: " + maxavgCnt());
        System.out.println("평균 미만의 갯수: " + minavgCnt());
        //오름차순으로 정렬되어있는 상태
        
        System.out.println();
        System.out.println(k + " 와 가장 작은 차는? " + approximate(k));
        System.out.println(k + " 의  근삿값은? " + sb);

        if (manyValue() == -1) {
            System.out.println("제일 많이 나온 수는? 모두 한번씩 나옴");
        } else {
            System.out.println("제일 많이 나온 수는? " + manyValue());
        }

        System.out.println();
        System.out.println("현재 배열은");
        for(int num : m){
            System.out.print(num + " ");
        }
        
        System.out.println();
        deviation();
        System.out.println("현재 배열에서의 편차는?: "+ sb1);

    }

    // Swap logic
    public void swap(int i, int j) {
        int tmp = 0;
        tmp = m[i];
        m[i] = m[j];
        m[j] = tmp;
    }

    // 선택 정렬(selection sort)
    public void sort(int order) {
        int tmp = 0;
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (order == 0) { // 내림차순
                    if (m[i] < m[j]) {
                        swap(i, j);
                    }
                } else { // 오름차순
                    if (m[i] > m[j]) {
                        swap(i, j);
                    }
                }
            }
        }
    }

    // 최댓값
    public int maxValue(int index) {
        // 출력하기 전에 정렬하기
        // 0일때 내림차순
        sort(0);
        return m[index - 1];
    }

    // 최솟값
    public int minValue(int index) {
        // 최솟값 찾기전에 정렬하기
        sort(1); // 내림차순
        return m[index - 1];
    }

    // 배열의 총합
    public int totalSum() {
        int ans = 0;

        for (int i = 0; i < m.length; i++) {
            ans += m[i];
        }

        return ans;
    }

    // 배열의 전체 평균
    public int totalAvg() {
        return totalSum() / m.length;
    }

    // 배열의 평균 이상의 갯수
    public int maxavgCnt() {
        int k = totalAvg();
        int cnt = 0;
        for (int i = 0; i < m.length; i++) {
            if (k <= m[i]) cnt++;
        }
        return cnt;
    }

    // 배열의 평균 이하의 갯수
    public int minavgCnt() {
        int k = totalAvg();
        int cnt = 0;
        for (int i = 0; i < m.length; i++) {
            if (k > m[i]) {
                cnt++;
            }
        }
        return cnt;
    }

    // 근삿값 만 구하기 
    
    // ans은 가장 작은 차, 근삿값 그자체는 sb에 들어가 있다
    public int approximate(int n) {
        int ans = Math.abs(n - m[0]);

        for (int i = 1; i < m.length; i++) {
            if (ans > Math.abs(n - m[i])) ans = Math.abs(n - m[i]);
        }
        
        //근삿값 들을 sb에 넣기
        for (int i = 0; i < m.length; i++) {
            if (Math.abs(n - m[i]) == ans) sb.append(m[i]).append(" ");
        }

        return ans;
    }

    // 최빈값 -> 노드들이 동일할때 가장 많이나온거
    // 이중 for 문 하나뽑고 뒤에 돌고, 하나뽑고 뒤에 돌아서, 
    //그냥 전체 리스트 만들고 인덱스에 따라서 그숫자가 얼마나 나왔는지
    public int manyValue() {
        int[] valueCnt = new int[101]; //난수는 0부터 100까지니까 0부터 100까지의 인덱스 만들기

        //valueCnt 는 그냥 index - > 해당 값이 몇번 들어가있는지 빈도수구하기
        for (int i = 0; i < m.length; i++) valueCnt[m[i]]++; //10개 돌면서 안에 있는값 ++해주기


        int max = 0; //빈 도 수 중에서 제일 많이 들어간 "값"
        int tmp = 0; // 그 값의 "빈도 수"

        for (int i = 0; i < 101; i++) {
            if (max < valueCnt[i]) {
                max = i; //값
                tmp = valueCnt[i]; //빈도 수
            }
        }

        //두번 이상 나온 수가 있을때
        if (tmp > 1) {
            return max;
        }else {
            //10개 수 모두 1번씩 나왔을땐 -1
            return -1;
        }
    }

    // 편차
    public void deviation(){
        int avg = totalAvg();
        for(int i = 0 ; i<m.length;i++){
            sb1.append(m[i]-avg).append(" ");
        }
    }

    public static void main(String[] args) {
        OneArray a = new OneArray();
        System.out.println("기준할 숫자를 입력해주세요");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        // 출력하기
        a.print(k);
        //k와 가장 가까운 근삿값
    }
    
  
}
