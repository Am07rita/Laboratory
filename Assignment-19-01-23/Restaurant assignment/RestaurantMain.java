package Restaurant;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantMain {

	private static HashMap Integer;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Map<Integer, Restaurant> map = new HashMap<Integer, Restaurant>();
		
		map.put(1, new Restaurant("Chicken biryani   :" , 130));
		map.put(2, new Restaurant("Paneer Butter masala:", 120));
		map.put(3, new Restaurant("Fried Chicken momo:", 80));
		map.put(4, new Restaurant("Chicken manchurian:", 110));
		map.put(5, new Restaurant("Special Masala Dosa:", 70));
		map.put(6, new Restaurant("Mushroom chilly:", 140));
		System.out.println("===========================");
		
		System.out.println("Welcome to C3805 Restaurant");
		System.out.println("===========================");
		System.out.println("Menu");
		System.out.println("****************");
		System.out.println("Items Price");
		System.out.println("****************");
		
		for(Map.Entry em: map.entrySet())
		{
			Restaurant rest = (Restaurant) em.getValue();
			System.out.println(em.getKey()+")");
			rest.display();
		}
		
		System.out.println();
		
		do {
			System.out.println("Enter food id:");
			int id = sc.nextInt();
			Restaurant rest = map.get(id);
			Billing.order(rest.getFname(), rest.getPrice());
			
			Billing.cont();
		}while(true);
		
	}

}

