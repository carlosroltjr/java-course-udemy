package oo.heritage;

public class Wizard extends Player{
	Wizard(int posX, int posY) {
		super(posX, posY);
		life = 80;
		power = 2;
		mana = 50;
	}
	
	boolean fireBall(Player opponent) {
		int deltaX = Math.abs(posX - opponent.posX);
		int deltaY = Math.abs(posY - opponent.posY);
		
		if (deltaX == 0 && deltaY <= 2 && mana >= 25) {
			opponent.life -= 25;
			mana -= 25;
			return true;
		} else if (deltaX <= 2 && deltaY == 0 && mana >= 25) {
			opponent.life -= 25;
			mana -= 25;
			return true;
		} else {
			return false;
		}
	}
}
