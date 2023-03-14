package lesson3;

import java.util.Arrays;

public class ArraySort {
	private int[] array;
	
	public ArraySort(int length, int min, int max) {
		this.array = new int[length];
		
		for(int i=0; i<length; i++) {
			this.array[i]= (int) Math.floor(Math.random() *(max - min + 1) + min);
		}
	}
	
	
	public void aSort() {
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array.length;j++) {
				if(array[i]<array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;					
				}
			}
		}
	}
	
	public void dSort() {
		for (int i=0;i<array.length;i++) {
			for (int j=0;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;					
				}
			}
		}
	}
	
	public int[] getBaseArray() {
		return array;
	}

	public void setBaseArray(int[] baseArray) {
		int[] copiedArray = new int [baseArray.length];
		for(int i=0; i<baseArray.length;i++) {
			copiedArray[i]=baseArray[i];
		}
		this.array = copiedArray;
	}
	
	public String printArray() {
		StringBuffer sb = new StringBuffer("[");
		for(int i=0; i<this.array.length; i++) {
			sb.append(array[i]+ ", ");
		}
		
		return sb.delete(sb.length()-2, sb.length()).append("]").toString();
	}
	
	
}
