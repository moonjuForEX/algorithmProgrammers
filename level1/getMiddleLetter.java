package programmers.level1;

public class getMiddleLetter {
	public String solution(String s) {
		String answer="";
		
		//입력받은 String을 char배열로
		int length=s.length();
		char[] ch=new char[length];
		for(int i=0;i<length;i++) {
			ch[i]=s.charAt(i);
		}
		
		//length가 짝수냐 홀수냐에따른 반환
		int index=length/2;
		if(length%2==0) {
			answer=Character.toString(ch[index-1])+Character.toString(ch[index]);
		}
		else {	
			answer=Character.toString(ch[index]);
		}
		
		
		return answer;
	}
	public static void main(String[] args) {
		
	}
}
