package Array;

import java.util.Scanner;

//최댓값ㅇ, 최소값ㅇ, 근사값ㅇ, ?��차ㅇ, 최빈값ㅇ, ?��계ㅇ, ?��균ㅇ, ?��균이?�� 개수?��, ?���? ?��?�� 개수?��
public class OneArray {

    private int[] m = new int[10]; //?��?��?��?�� ???��?��?�� �?
    StringBuilder sb = new StringBuilder(); //근삿 �? ( 찾는 값이 10 ?���? 8 �? 12 ?��?�� ?��?�� ?��?���?)
    StringBuilder sb1 = new StringBuilder(); //?���? ???��


    // 배열?�� Random �? ?���?
    public OneArray() {
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 100)+1; //1�??�� 100까�??�� ?��?�� 발생
        }
//    		m= new int[]{0,0,0,0,1,2,3,4,5,6};
    }

    // 출력?���?
    public void print(int k) {
    	
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        
        System.out.println("최댓�?: " + maxValue(1));
        System.out.println("최솟�?: " + minValue(1));
        System.out.println("총합: " + totalSum());
        System.out.println("?���?: " + totalAvg());
        System.out.println("?���? ?��?��?�� �??��: " + maxavgCnt());
        System.out.println("?���? 미만?�� �??��: " + minavgCnt());
        //?��름차?��?���? ?��?��?��?��?��?�� ?��?��
        
        System.out.println();
        System.out.println(k + " ?? �??�� ?��?? 차는? " + approximate(k));
        System.out.println(k + " ?��  근삿값�?? " + sb);

        if (manyValue() == -1) {
            System.out.println("?��?�� 많이 ?��?�� ?��?��? 모두 ?��번씩 ?��?��");
        } else {
            System.out.println("?��?�� 많이 ?��?�� ?��?��? " + manyValue());
        }

        System.out.println();
        System.out.println("?��?�� 배열??");
        for(int num : m){
            System.out.print(num + " ");
        }
        
        System.out.println();
        deviation();
        System.out.println("?��?�� 배열?��?��?�� ?��차는?: "+ sb1);

    }

    // Swap logic
    public void swap(int i, int j) {
        int tmp = 0;
        tmp = m[i];
        m[i] = m[j];
        m[j] = tmp;
    }

    // ?��?�� ?��?��(selection sort)
    public void sort(int order) {
        int tmp = 0;
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (order == 0) { // ?��림차?��
                    if (m[i] < m[j]) {
                        swap(i, j);
                    }
                } else { // ?��름차?��
                    if (m[i] > m[j]) {
                        swap(i, j);
                    }
                }
            }
        }
    }

    // 최댓�?
    public int maxValue(int index) {
        // 출력?���? ?��?�� ?��?��?���?
        // 0?��?�� ?��림차?��
        sort(0);
        return m[index - 1];
    }

    // 최솟�?
    public int minValue(int index) {
        // 최솟�? 찾기?��?�� ?��?��?���?
        sort(1); // ?��림차?��
        return m[index - 1];
    }

    // 배열?�� 총합
    public int totalSum() {
        int ans = 0;

        for (int i = 0; i < m.length; i++) {
            ans += m[i];
        }

        return ans;
    }

    // 배열?�� ?���? ?���?
    public int totalAvg() {
        return totalSum() / m.length;
    }

    // 배열?�� ?���? ?��?��?�� �??��
    public int maxavgCnt() {
        int k = totalAvg();
        int cnt = 0;
        for (int i = 0; i < m.length; i++) {
            if (k <= m[i]) cnt++;
        }
        return cnt;
    }

    // 배열?�� ?���? ?��?��?�� �??��
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

    // 근삿�? �? 구하�? 
    
    // ans?? �??�� ?��?? �?, 근삿�? 그자체는 sb?�� ?��?���? ?��?��
    public int approximate(int n) {
        int ans = Math.abs(n - m[0]);

        for (int i = 1; i < m.length; i++) {
            if (ans > Math.abs(n - m[i])) ans = Math.abs(n - m[i]);
        }
        
        //근삿�? ?��?�� sb?�� ?���?
        for (int i = 0; i < m.length; i++) {
            if (Math.abs(n - m[i]) == ans) sb.append(m[i]).append(" ");
        }

        return ans;
    }

    // 최빈�? -> ?��?��?��?�� ?��?��?��?�� �??�� 많이?��?���?
    // ?���? for �? ?��?��뽑고 ?��?�� ?���?, ?��?��뽑고 ?��?�� ?��?��?��, 
    //그냥 ?���? 리스?�� 만들�? ?��?��?��?�� ?��?��?�� 그숫?���? ?��마나 ?��?��?���?
    public int manyValue() {
        int[] valueCnt = new int[101]; //?��?��?�� 0�??�� 100까�??���? 0�??�� 100까�??�� ?��?��?�� 만들�?

        //valueCnt ?�� 그냥 index - > ?��?�� 값이 몇번 ?��?���??��?���? 빈도?��구하�?
        for (int i = 0; i < m.length; i++) valueCnt[m[i]]++; //10�? ?��면서 ?��?�� ?��?���? ++?��주기


        int max = 0; //�? ?�� ?�� 중에?�� ?��?�� 많이 ?��?���? "�?"
        int tmp = 0; // �? 값의 "빈도 ?��"

        for (int i = 0; i < 101; i++) {
            if (max < valueCnt[i]) {
                max = i; //�?
                tmp = valueCnt[i]; //빈도 ?��
            }
        }

        //?���? ?��?�� ?��?�� ?���? ?��?��?��
        if (tmp > 1) {
            return max;
        }else {
            //10�? ?�� 모두 1번씩 ?��?��?��?�� -1
            return -1;
        }
    }

    // ?���?
    public void deviation(){
        int avg = totalAvg();
        for(int i = 0 ; i<m.length;i++){
            sb1.append(m[i]-avg).append(" ");
        }
    }

    public static void main(String[] args) {
        OneArray a = new OneArray();
        System.out.println("기�??�� ?��?���? ?��?��?��주세?��");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        // 출력?���?
        a.print(k);
        //k?? �??�� �?까운 근삿�?
    }
    
  
}
