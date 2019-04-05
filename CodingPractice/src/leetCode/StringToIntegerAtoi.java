package leetCode;
/**
 * 8. String to Integer (atoi)
 * @author chinmaysingh
 *
 */
public class StringToIntegerAtoi {
	
	public int myAtoi(String str) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) ==' ')continue;
            else if(str.charAt(i) =='-' |str.charAt(i) =='+' | Character.isDigit(str.charAt(i))){
                int pos = i;
                if(str.charAt(pos) == '-'){
                    sb.append("-");
                    pos++;
                }
                else if(pos <str.length() && str.charAt(pos) == '+'){
                    pos++;
                }
                while(pos <str.length() && Character.isDigit(str.charAt(pos))){
                    sb.append(str.charAt(pos));
                    pos++;
                    
                }
                flag = true;
                break;
            }
            else break;
            //if(flag) break;
                
        }
        try{
            if(sb.length() == 0) return 0;
            if(sb.length() == 1 && sb.charAt(0) == '-') return 0;
            else return Integer.parseInt(sb.toString());
        }
        catch(NumberFormatException e){
            if(sb.charAt(0) == '-')
                return Integer.MIN_VALUE;
            else{
                return Integer.MAX_VALUE;
            }
        }
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringToIntegerAtoi stoi = new StringToIntegerAtoi();
		
		String st = "1";
		char ch = '1';
		String regex = "[0-9]";
		System.out.println(st.matches(regex));
		StringBuilder sb = new StringBuilder();
		sb.append("3");
		sb.append("2");
		System.out.println(stoi.myAtoi("  -42"));
		

	}

}
