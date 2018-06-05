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
		System.out.println("�̸�: " + name);
		System.out.println("�ܾ�: " + money);
	}

	public void buy(Product prod) {
		while(true) {
			money -= prod.getPrice();
			if (money<0) {
				System.out.println("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
				money += prod.getPrice();
				System.out.println("�ܾ��� " + money + "�Դϴ�.");
				break;
			} else {
				System.out.println(name+"���� "+prod.getPrice()+"�� �����ϰ�"+prod.getModel()+" ������");
				System.out.println("[�ܾ�] "+ money+"��");
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
		System.out.print("�� �̸��� �Է����ּ���  ");
		String name = input.nextLine();
		System.out.print("���� �ݾ��� �Է����ּ���  ");
		int money = input.nextInt();
		Person p = new Person(name, money);

		Computer c = new Computer("lg gram", 700000);
		Tv t = new Tv("Samsung View", 2000000);

		p.buy(c);
		c.out();
//		p.buy(t);

	}
}
