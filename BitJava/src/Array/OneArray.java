package Array;

import java.util.Scanner;

//ìµœëŒ“ê°’ã…‡, ìµœì†Œê°’ã…‡, ê·¼ì‚¬ê°’ã…‡, ?¸ì°¨ã…‡, ìµœë¹ˆê°’ã…‡, ?•©ê³„ã…‡, ?‰ê· ã…‡, ?‰ê· ì´?ƒ ê°œìˆ˜?…‡, ?‰ê·? ?´?•˜ ê°œìˆ˜?…‡
public class OneArray {

    private int[] m = new int[10]; //?‚œ?ˆ˜?“¤?´ ???¥?˜?Š” ê°?
    StringBuilder sb = new StringBuilder(); //ê·¼ì‚¿ ê°? ( ì°¾ëŠ” ê°’ì´ 10 ?´ê³? 8 ê³? 12 ?¼?•Œ ?‘˜?‹¤ ?“¤?–´ê°?)
    StringBuilder sb1 = new StringBuilder(); //?¸ì°? ???¥


    // ë°°ì—´?— Random ê°? ?„£ê¸?
    public OneArray() {
        for (int i = 0; i < m.length; i++) {
            m[i] = (int) (Math.random() * 100)+1; //1ë¶??„° 100ê¹Œì??˜ ?‚œ?ˆ˜ ë°œìƒ
        }
//    		m= new int[]{0,0,0,0,1,2,3,4,5,6};
    }

    // ì¶œë ¥?•˜ê¸?
    public void print(int k) {
    	
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + " ");
        }
        System.out.println();
        
        System.out.println("ìµœëŒ“ê°?: " + maxValue(1));
        System.out.println("ìµœì†Ÿê°?: " + minValue(1));
        System.out.println("ì´í•©: " + totalSum());
        System.out.println("?‰ê·?: " + totalAvg());
        System.out.println("?‰ê·? ?´?ƒ?˜ ê°??ˆ˜: " + maxavgCnt());
        System.out.println("?‰ê·? ë¯¸ë§Œ?˜ ê°??ˆ˜: " + minavgCnt());
        //?˜¤ë¦„ì°¨?ˆœ?œ¼ë¡? ? •? ¬?˜?–´?ˆ?Š” ?ƒ?ƒœ
        
        System.out.println();
        System.out.println(k + " ?? ê°??¥ ?‘?? ì°¨ëŠ”? " + approximate(k));
        System.out.println(k + " ?˜  ê·¼ì‚¿ê°’ì?? " + sb);

        if (manyValue() == -1) {
            System.out.println("? œ?¼ ë§ì´ ?‚˜?˜¨ ?ˆ˜?Š”? ëª¨ë‘ ?•œë²ˆì”© ?‚˜?˜´");
        } else {
            System.out.println("? œ?¼ ë§ì´ ?‚˜?˜¨ ?ˆ˜?Š”? " + manyValue());
        }

        System.out.println();
        System.out.println("?˜„?¬ ë°°ì—´??");
        for(int num : m){
            System.out.print(num + " ");
        }
        
        System.out.println();
        deviation();
        System.out.println("?˜„?¬ ë°°ì—´?—?„œ?˜ ?¸ì°¨ëŠ”?: "+ sb1);

    }

    // Swap logic
    public void swap(int i, int j) {
        int tmp = 0;
        tmp = m[i];
        m[i] = m[j];
        m[j] = tmp;
    }

    // ?„ ?ƒ ? •? ¬(selection sort)
    public void sort(int order) {
        int tmp = 0;
        for (int i = 0; i < m.length - 1; i++) {
            for (int j = i + 1; j < m.length; j++) {
                if (order == 0) { // ?‚´ë¦¼ì°¨?ˆœ
                    if (m[i] < m[j]) {
                        swap(i, j);
                    }
                } else { // ?˜¤ë¦„ì°¨?ˆœ
                    if (m[i] > m[j]) {
                        swap(i, j);
                    }
                }
            }
        }
    }

    // ìµœëŒ“ê°?
    public int maxValue(int index) {
        // ì¶œë ¥?•˜ê¸? ? „?— ? •? ¬?•˜ê¸?
        // 0?¼?•Œ ?‚´ë¦¼ì°¨?ˆœ
        sort(0);
        return m[index - 1];
    }

    // ìµœì†Ÿê°?
    public int minValue(int index) {
        // ìµœì†Ÿê°? ì°¾ê¸°? „?— ? •? ¬?•˜ê¸?
        sort(1); // ?‚´ë¦¼ì°¨?ˆœ
        return m[index - 1];
    }

    // ë°°ì—´?˜ ì´í•©
    public int totalSum() {
        int ans = 0;

        for (int i = 0; i < m.length; i++) {
            ans += m[i];
        }

        return ans;
    }

    // ë°°ì—´?˜ ? „ì²? ?‰ê·?
    public int totalAvg() {
        return totalSum() / m.length;
    }

    // ë°°ì—´?˜ ?‰ê·? ?´?ƒ?˜ ê°??ˆ˜
    public int maxavgCnt() {
        int k = totalAvg();
        int cnt = 0;
        for (int i = 0; i < m.length; i++) {
            if (k <= m[i]) cnt++;
        }
        return cnt;
    }

    // ë°°ì—´?˜ ?‰ê·? ?´?•˜?˜ ê°??ˆ˜
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

    // ê·¼ì‚¿ê°? ë§? êµ¬í•˜ê¸? 
    
    // ans?? ê°??¥ ?‘?? ì°?, ê·¼ì‚¿ê°? ê·¸ìì²´ëŠ” sb?— ?“¤?–´ê°? ?ˆ?‹¤
    public int approximate(int n) {
        int ans = Math.abs(n - m[0]);

        for (int i = 1; i < m.length; i++) {
            if (ans > Math.abs(n - m[i])) ans = Math.abs(n - m[i]);
        }
        
        //ê·¼ì‚¿ê°? ?“¤?„ sb?— ?„£ê¸?
        for (int i = 0; i < m.length; i++) {
            if (Math.abs(n - m[i]) == ans) sb.append(m[i]).append(" ");
        }

        return ans;
    }

    // ìµœë¹ˆê°? -> ?…¸?“œ?“¤?´ ?™?¼?• ?•Œ ê°??¥ ë§ì´?‚˜?˜¨ê±?
    // ?´ì¤? for ë¬? ?•˜?‚˜ë½‘ê³  ?’¤?— ?Œê³?, ?•˜?‚˜ë½‘ê³  ?’¤?— ?Œ?•„?„œ, 
    //ê·¸ëƒ¥ ? „ì²? ë¦¬ìŠ¤?Š¸ ë§Œë“¤ê³? ?¸?±?Š¤?— ?”°?¼?„œ ê·¸ìˆ«?ê°? ?–¼ë§ˆë‚˜ ?‚˜?™”?Š”ì§?
    public int manyValue() {
        int[] valueCnt = new int[101]; //?‚œ?ˆ˜?Š” 0ë¶??„° 100ê¹Œì??‹ˆê¹? 0ë¶??„° 100ê¹Œì??˜ ?¸?±?Š¤ ë§Œë“¤ê¸?

        //valueCnt ?Š” ê·¸ëƒ¥ index - > ?•´?‹¹ ê°’ì´ ëª‡ë²ˆ ?“¤?–´ê°??ˆ?Š”ì§? ë¹ˆë„?ˆ˜êµ¬í•˜ê¸?
        for (int i = 0; i < m.length; i++) valueCnt[m[i]]++; //10ê°? ?Œë©´ì„œ ?•ˆ?— ?ˆ?Š”ê°? ++?•´ì£¼ê¸°


        int max = 0; //ë¹? ?„ ?ˆ˜ ì¤‘ì—?„œ ? œ?¼ ë§ì´ ?“¤?–´ê°? "ê°?"
        int tmp = 0; // ê·? ê°’ì˜ "ë¹ˆë„ ?ˆ˜"

        for (int i = 0; i < 101; i++) {
            if (max < valueCnt[i]) {
                max = i; //ê°?
                tmp = valueCnt[i]; //ë¹ˆë„ ?ˆ˜
            }
        }

        //?‘ë²? ?´?ƒ ?‚˜?˜¨ ?ˆ˜ê°? ?ˆ?„?•Œ
        if (tmp > 1) {
            return max;
        }else {
            //10ê°? ?ˆ˜ ëª¨ë‘ 1ë²ˆì”© ?‚˜?™”?„?• -1
            return -1;
        }
    }

    // ?¸ì°?
    public void deviation(){
        int avg = totalAvg();
        for(int i = 0 ; i<m.length;i++){
            sb1.append(m[i]-avg).append(" ");
        }
    }

    public static void main(String[] args) {
        OneArray a = new OneArray();
        System.out.println("ê¸°ì??•  ?ˆ«?ë¥? ?…? ¥?•´ì£¼ì„¸?š”");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        // ì¶œë ¥?•˜ê¸?
        a.print(k);
        //k?? ê°??¥ ê°?ê¹Œìš´ ê·¼ì‚¿ê°?
    }
    
  
}
