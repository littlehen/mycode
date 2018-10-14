package offer;

public class Replace {
	
	public String replace(String input) {
		
		if(input == null || input =="")
			return null;
		
		StringBuilder str = new StringBuilder();
		
		for(int i = 0; i < input.length(); i++) {
			if(String.valueOf(input.charAt(i)).equals(" ")) {
				str.append("%20");
			}else
				str.append(input.charAt(i));
		}
		return String.valueOf(str);
	}
	
	// 测试用例
	     public static void main(String[] args) {
	    	 Replace test = new Replace();
	         // 输入的字符串包含空格：最后面，最前面，中间，连续空格
	         String str1 = "We are happy.";
	         String str2 = " Wearehappy.";
	         String str3 = "Wearehappy. ";
	         String str4 = "We   are   happy  .";
	         //输入的字符串没有空格
	         String str5="Wearehappy.";
	         //特殊输入测试：字符串只有连续空格、只有一个空格、字符串是一个null指针、字符串是一个空字符串;
	         String str6="    ";
	         String str7=" ";
	         String str8=null;
	         String str9="";
	         System.out.println(test.replace(str1));
	         System.out.println(test.replace(str2));
	         System.out.println(test.replace(str3));
	         System.out.println(test.replace(str4));
	         System.out.println(test.replace(str5));
	         System.out.println(test.replace(str6));
	         System.out.println(test.replace(str7));
	         System.out.println(test.replace(str8));
	         System.out.println(test.replace(str9));
	     }
}
