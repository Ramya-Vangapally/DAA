import java.util.*;
class LCP_HM{
    static int findMinLength(String[] arr){
        int mi = Integer.MAX_VALUE;
        for (int i=0;i<arr.length ;i++ )
        mi = Math.min(mi,arr[i].length());
        return mi;
    }
    static String LCP(String[] s){
        int small = findMinLength(s);
        String a = s[0].substring(0,small);
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> h = new HashMap<>();
        for (int i=0;i<small ;i++ ) {
            for (int j=0;j<s.length ;j++ ){
                h.put(s[j].charAt(i),h.getOrDefault(s[j].charAt(i),0)+1);
            } 
            if(h.get(a.charAt(i))==s.length){
                sb.append(a.charAt(i));
                h.clear();
            }
            else break;
        }
        return sb.toString();
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        System.out.print(LCP(s));
        
    }
}