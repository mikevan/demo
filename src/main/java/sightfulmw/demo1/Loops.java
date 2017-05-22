package sightfulmw.demo1;

public class Loops {
	
	public void forLoop(int x[]) {
		System.out.println("In forLoop()");
		for (int y=0; y<2; y++){
			System.out.println("the value is " +x[y]);
		}
	}
	
	public void whileLoop(int numReps) {
		int i = 0;
		
		System.out.println("In whileLoop();");
		
		while(i<numReps){
			System.out.println("the value is " + i);
			i++;
		}
	}
	
	public void doWhile(int numDWReps){
		int i = 0;
		
		System.out.println("in doWhile();");
		
		do{
			System.out.println(i);
			i++;
		}while(i<numDWReps);
	}
}
