package fr.dauphine.ja.pachoudalexandre.td00;
import java.util.*;


public class PrimeCollection{
	
	ArrayList<Integer> numbers; 
	
	//CONSTRUCTEUR
	public PrimeCollection(	ArrayList<Integer> list) {
		numbers = list;
	}
	public PrimeCollection() {
		this(new ArrayList<Integer>());
	}
	

	//METHODES
	/**
	 * Ajoute n entier entre 0 et m
	 * @param n entier
	 * @param m entier
	 * @return true
	 */
	public boolean initRandom(int n, int m) {
		Random r = new Random();
		for(int i=0; i<n; i++) {
			numbers.add(Math.abs(r.nextInt())%m);
		}	
		return true;
	}
	/**
	 * test if a integer is a prime
	 * @param n a integer
	 * @return True if n is prime, false if not
	 */
	private boolean isPrime(int n) {
		if(n==1 || n==0) {
			return false;
		}
		double max = Math.sqrt(n);
		for(int i=2; i< max+1 ; i++) {
			if(n%i==0)return false;
		}
		return true;
	}
	
	public void printPrimes() {
		for(Integer ele : this.numbers) {
			if(this.isPrime(ele)) {
				System.out.println(ele+",");
			}
		}
	}
	
	//MAIN
	public static void main(String[] args) {
		PrimeCollection list = new PrimeCollection();
		
		list.initRandom(100, 2000);
		list.printPrimes();
		
		
		
		return;
	}
	
}
