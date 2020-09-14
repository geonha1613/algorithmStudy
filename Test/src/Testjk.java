
public class Testjk {
	public static void main(String[] args) {
		String id = "aaaaa.......aaaaaaa";
		String answer="";
		String temp = "";
		//1단계
		temp = stringLower(id);
		System.out.println("1"+temp);
		//2단계
		temp = stringDel(temp);
		System.out.println("2"+temp);
		//3단계
		temp = stringDupDelDot(temp);
		System.out.println("3"+temp);
		//4단계
		temp = stringStEndDelDot(temp);
		System.out.println("4"+temp);
		//5단계
		temp = stringIsNull(temp);
		System.out.println("5"+temp);
		//6단계
		temp = stringLengthSubstring(temp);
		System.out.println("6"+temp);
		//7단계
		temp = stringAddLastChar(temp);
		System.out.println("7"+temp);
	}
	
	// 1단계 method
	private static String stringLower(String input) {
		String answer="";
		answer = input.toLowerCase();
		return answer;
	}
	
	//2단계 method
	private static String stringDel(String input) {
		String answer="";
		answer = input.replaceAll("[^a-z0-9-_.]", "");
		return answer;
	}
	//3단계 method
	private static String stringDupDelDot(String input) {
		String answer="";
		for (int i = 0; i < input.length(); i++) { // i가 0부터 사용자가 입력한 문자열의 길이만큼 반복문을 돌린다.
			if(answer.length() == 0) {
				answer += String.valueOf(input.charAt(i));
			}else if(String.valueOf(input.charAt(i)).equals(".") && answer.substring(answer.length()-1).equals(String.valueOf(input.charAt(i)))){
				answer += ""; 
			}else {
				answer += String.valueOf(input.charAt(i));
			}
		}
		return answer;
	}
	//4단계 method
	private static String stringStEndDelDot(String input) {
		String answer="";
		if(input.startsWith(".")){
			answer = input.substring(1);
		}else{
			answer = input;
		}
		if(answer.endsWith(".")){
			answer = answer.substring(0, answer.length()-1);
		}
		return answer;
	}
	// 5단계 method
	private static String stringIsNull(String input) {
		String answer="";
		if(input.isEmpty()) {
			answer+="a";
		}else {
			answer = input;
		}
		return answer;
	}
	//6단계 method
	private static String stringLengthSubstring(String input) {
		String answer="";
		if(input.length()>15) {
			answer = input.substring(0,15);
		}else {
			answer = input;
		}
		if(answer.endsWith(".")) {
			answer = answer.substring(0, answer.length()-1);
		}
		return answer;
	}
	//7단계 method
	private static String stringAddLastChar(String input) {
		String answer="";
		answer = input;
		if(input.length()<3) {
			while (answer.length()<3) {
				answer += input.substring(input.length()-1);
			}
		}
		return answer;
	}
}