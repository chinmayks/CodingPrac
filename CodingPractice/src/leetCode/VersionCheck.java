package leetCode;
/**
 * 278
 * @author chinmaysingh
 *
 */
public class VersionCheck {
	
	static int val = 1702766719;
	
	
	public static int bsearch(int start , int end){
        if(start > end) return 1;
        int mid = (start + end)/2;
        boolean flag = isBadVersion(mid);
        int result =0;
        
        if(flag && mid>1 && !isBadVersion(mid-1)) return mid;
        if(flag){
            result = bsearch(start, mid-1);
        }
        else{
            result = bsearch(mid+1, end);
        }
        return result;
    }
	
	public static boolean isBadVersion(int n) {
		if(n>= val) {
			return true;
			
		}else {
			return false;
		}
	}
    public static int firstBadVersion(int n) {
        //System.out.println(isBadVersion(3));
        if(n==1) return 1;
        return bsearch(1, n);
    }

	public static void main(String[] args) {
		System.out.println(firstBadVersion(2126753390));

	}

}
