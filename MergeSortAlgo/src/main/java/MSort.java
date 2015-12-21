import java.util.Random;

public class MSort {
	private int[] array = new int[10];
    private int[] tempMergArr;
    private int length = array.length;
    
    private void genTheArray(int[] theArr){
    Random rand = new Random();
    for(int i = 0; i<theArr.length;i++){
    	theArr[i] = rand.nextInt(101);
    	}
    
    }
    
    public void SortTheArr(){
    genTheArray(this.array);
    BreakTheParts(0, length - 1);
    }
    
    public void BreakTheParts(int lowerIndex, int HigherIndex){
    	if (lowerIndex < HigherIndex) {
		int middleIndex = lowerIndex + (HigherIndex - lowerIndex)/ 2;
		BreakTheParts(lowerIndex, middleIndex);
		BreakTheParts(middleIndex + 1, HigherIndex);
		mergeParts(lowerIndex, middleIndex, HigherIndex);
		}
    	
    }
    

  public void mergeParts(int lowerIndex, int middleIndex, int HigherIndex){
	  	for(int i = lowerIndex;i<=HigherIndex;i++){
	  	this.tempMergArr[i] = this.array[i];	
	  	}
	  	int i = lowerIndex;
	  	int j = middleIndex + 1;
	  	int k = lowerIndex;
	  	
	  	while(i<=middleIndex && j<=HigherIndex){
	  		if (tempMergArr[i] < tempMergArr[j]) {
				array[k] = tempMergArr[i];
				i++;
			}
	  		else {
				array[k] = tempMergArr[j];
				j++;
			}
	  		k++;
	  	}
	  	while(i <= middleIndex){
	  	array[k] = tempMergArr[i];
	  	k++;
	  	i++;
	  	}
	  	while(j <= HigherIndex){
		  	array[k] = tempMergArr[j];
		  	k++;
		  	j++;
		  }
	  	
  }
  
  	public static void Main(String args[]){
  		MSort sort = new MSort();
  		sort.SortTheArr();
  	}
}
