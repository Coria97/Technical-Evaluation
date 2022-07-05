package Solution;

import java.util.Arrays;
import java.util.List;

public class main {
	
	public static int findHighElementSol1(int[] arr) {
		//Exercise 1 
		//Explain how to find the high element of an array of integers.
		Arrays.sort(arr);
		return arr[arr.length-1];
	}
	
	public static int findHighElementSol2(int[] arr) {
		int aux = Integer.MIN_VALUE; 
		for(int i = 0; i < arr.length; i++)
			if(aux < arr[i])
				aux = arr[i];
		return aux;
	}
	
	public static void findSequenceNumber(int[] arr, int sum) {
		//Exercise 2
		//Given an array of integers, make a function that indicates which ranges of consecutive numbers result in the quantity passed to it as a parameter
		int i = 0;
		int start = 0;
		int auxSum = 0;
		while (i < arr.length) {
			auxSum+= arr[i];
			if (auxSum == sum) {
				System.out.println("los elementos entre (" + start + " , " + i + ") suman : " + auxSum);
				start++;
				i = start;
				auxSum = 0;
			}
			else
				if (auxSum > sum) {
					start++;
					i = start;
					auxSum = 0;
				}
				else
					i++;
		}
	}
	
	public static int sizeList(List l) {
		//Exercise 3
		//Given any node in a doubly linked list, explain how to get the total number of elements in that list. The only methods that expose the node type are getPrevious() and getNext()
		//which return null if there is no previous/next and getData() which return the node data.
		if(l == null)
			return 0;
		else
		{	
			List aux = l;
			int size = 0;
			while(aux.getNext() != null)
				size++;
			List aux = l;
			while(aux.getPrevious() != null)
				size++;
			return size;
		}
	}
	
	public static boolean isPalindromoSol1(String s) {
		//Exercise 4
		// A palindrome is a word or phrase that reads the same forwards as backwards. Make a function that determines if a word or phrase is a palindrome. 
		//No need to worry about spaces or cases
		for(int i = 0; i < s.length() ; i++)
			if(s.charAt(i) != s.charAt(s.length()-1-i))
				return false;
		return true;
	}
	
	public static boolean isPalindromoSol2(String s) {
		int i = 0;
		int j = s.length()-1;
		int half = j/2;
		while ((i <= half) && (j>= half)) {
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++; 
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Exercise 1
		int[] arrEx1 = {5, 8, 0, -10, 44, 89, 1, 3, 7, 77, 12, -3, 4};
		System.out.println("Solution 1: el mayor elemento del arreglo es: " + findHighElementSol1(arrEx1));
		System.out.println("Solution 2: el mayor elemento del arreglo es: " + findHighElementSol2(arrEx1));
		
		//Exercise 2
		int[] arrEx2 = {6,7,5,4,3,1,2,3,5,6,7,9,0,0,1,2,4,1,2,3,5,1,2};
		int sum = 13;
		findSequenceNumber(arrEx2, sum);
		
		//Exercise 4
		String s = "neuquen";
		System.out.println(isPalindromoSol1(s));
		System.out.println(isPalindromoSol2(s));
		
		
	}

}
