package oo.heritage;

public class Player {
	int life = 100;
	int power = 10;
	int mana = 0;
	int posX;
	int posY;
	
	Player(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	void walk(Direction direction) {
		switch (direction) {
		case NORTH:
			posY++;
			break;
		case EAST:
			posX++;
			break;
		case SOUTH:
			posY--;
			break;
		case WEST:
			posX--;
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + direction);
		}
	}
	
	boolean attack(Player opponent) {
		int deltaX = Math.abs(posX - opponent.posX);
		int deltaY = Math.abs(posY - opponent.posY);
		
		if (deltaX == 0 && deltaY == 1) {
			opponent.life -= power;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			opponent.life -= power;
			return true;
		} else {
			return false;
		}
	}
}
