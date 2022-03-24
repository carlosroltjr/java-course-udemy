package oo.heritage;

public class Game {
	public static void main(String[] args) {
		Player p1 = new Player(10, 10);
		
		Wizard p2 = new Wizard(10, 13);
		
		p1.walk(Direction.NORTH);
		p2.fireBall(p1);
		p1.walk(Direction.NORTH);
		p1.attack(p2);
		p1.attack(p2);
		p1.attack(p2);
		p2.fireBall(p1);
		p2.attack(p1);
		p2.attack(p1);
		
		System.out.printf("%s %d\n", p1.getClass(), p1.life);
		System.out.printf("%s %d\n", p2.getClass(), p2.life);
		
		System.out.printf("X %d, Y %d\n", p1.posX, p1.posY);
		System.out.printf("X %d, Y %d\n", p2.posX, p2.posY);
	}
}
