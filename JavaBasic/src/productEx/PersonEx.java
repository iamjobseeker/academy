package productEx;

import java.util.Scanner;

import product.Computer;
import product.Product;
import product.Tv;

class Person { 
	private String name;
	private int money;
	private Product prod;

	public Person (String name, int money) {
		System.out.println("이름: " + name);
		System.out.println("잔액: " + money);
	}

	public void buy(Product prod) {
		while(true) {
			money -= prod.getPrice();
			if (money<0) {
				System.out.println("잔액이 부족하여 구매할 수 없습니다.");
				money += prod.getPrice();
				System.out.println("잔액은 " + money + "입니다.");
				break;
			} else {
				System.out.println(name+"님이 "+prod.getPrice()+"를 지불하고"+prod.getModel()+" 구매함");
				System.out.println("[잔액] "+ money+"원");
				break;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}

public class PersonEx{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("고객 이름을 입력해주세요  ");
		String name = input.nextLine();
		System.out.print("보유 금액을 입력해주세요  ");
		int money = input.nextInt();
		Person p = new Person(name, money);

		Computer c = new Computer("lg gram", 700000);
		Tv t = new Tv("Samsung View", 2000000);

		p.buy(c);
		c.out();
//		p.buy(t);

	}
}
