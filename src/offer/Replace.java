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
	
	// ��������
	     public static void main(String[] args) {
	    	 Replace test = new Replace();
	         // ������ַ��������ո�����棬��ǰ�棬�м䣬�����ո�
	         String str1 = "We are happy.";
	         String str2 = " Wearehappy.";
	         String str3 = "Wearehappy. ";
	         String str4 = "We   are   happy  .";
	         //������ַ���û�пո�
	         String str5="Wearehappy.";
	         //����������ԣ��ַ���ֻ�������ո�ֻ��һ���ո��ַ�����һ��nullָ�롢�ַ�����һ�����ַ���;
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
