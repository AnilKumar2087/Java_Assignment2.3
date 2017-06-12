package pattern_x;

public class x_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size = 6;
		char display='x';
		
		    for (int row = 0; row < size; row++) {
		        for (int col = 0; col < size; col++) {
		            if (row == col || row + col == size - 1) {
		                System.out.print(display);
		            } else {
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
		    
		}

	}

}
