import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class SWexpert1219 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		byte n, index, value, exist;
		int i, j, road_num;
		
		ArrayList<Byte> start = new ArrayList<Byte>();
		ArrayList<Byte> going = new ArrayList<Byte>();
		
		byte[] road1 = new byte[100];
		byte[] road2 = new byte[100];
    	byte[] answer = new byte[10];
    	
    	for(n=0; n<10; n++) {
    		
    		exist = 0;
    		
    		Arrays.fill(road1, (byte)0);
    		Arrays.fill(road2, (byte)0);
    		
    		start.clear();
    		going.clear();
    		start.add((byte)0);
    		
    		//입력
    		scan.nextInt();
    		road_num = scan.nextInt();
    		
    		
    		for(i=0; i<road_num; i++) {
    			index = scan.nextByte();
    			value = scan.nextByte();
    			
    			if(road1[index] == 0)
    				road1[index] = value;
    			else
    				road2[index] = value;
    		}
    		
    		
    		//구현
    		for(i=0; i<=road_num; i++) {

    			for(j=0; j<start.size(); j++) {
    				
    				if(road1[start.get(j)] != 0)
    					going.add(road1[start.get(j)]);
    				
    				if(road2[start.get(j)] != 0)
    					going.add(road2[start.get(j)]);
    				
    			}

    			
    			if(going.contains((byte)99)) {
    				exist = 1;
    				break;
    			}
    			
    			start.clear();
    			
    			for(j=0; j<going.size(); j++)
    				start.add(going.get(j));
    			
    			going.clear();
    			
    		}
    		
    		
    		//정답 저장
    		answer[n] = exist;
    	}

    	
    	//출력
    	for(n=0; n<10; n++) System.out.println("#"+(n+1)+" "+answer[n]);
    	
	}

}
