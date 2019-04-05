package leetCode;

public class Strstr {
	public static int strStr(String haystack, String needle) {
        if(needle.length()==0) return 0;
        int indexOf = -1;
        System.out.println(needle);
        if(haystack.length()>= needle.length()){
            for(int i=0;i<haystack.length();i++){
                if(haystack.charAt(i) == needle.charAt(0)){
                    indexOf = i;
                    int j=1;
                    for(j=1;j<needle.length();j++){
                        if((i+j<haystack.length()) && haystack.charAt(i+j) == needle.charAt(j)){

                        }
                        else{
                            indexOf = -1;
                            break;
                        }
                        
                    }
                    if(j == needle.length()){
                        return indexOf;

                        }

                }
            }
        }
        return indexOf;
    }

	public static void main(String[] args) {
		//System.out.println("\\u" + Integer.toHexString('÷' | 0x10000).substring(1) );
		//System.out.println(strStr("aaa", "a"));
		int idexof = "aa".indexOf("aaaa");

	}

}
