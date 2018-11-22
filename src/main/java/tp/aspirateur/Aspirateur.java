package tp.aspirateur;

public class Aspirateur {

	private int x;
	private int y;
	private char orientation;

	private int xPiece;
	private int yPiece;

	public Aspirateur(int pX, int pY, char pOrientation, int pXPiece, int pYPiece) {
		this.setX(pX);
		this.setY(pY);
		this.setOrientation(pOrientation);
		this.setxPiece(pXPiece);
		this.setyPiece(pYPiece);
	}

	public int getX() {
		return this.x;
	}

	public void setX(int pX) {
		this.x = pX;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int pY) {
		this.y = pY;
	}

	public char getOrientation() {
		return this.orientation;
	}

	public void setOrientation(char pOrientation) {
		this.orientation = pOrientation;
	}

	public int getxPiece() {
		return this.xPiece;
	}

	public void setxPiece(int pXPiece) {
		this.xPiece = pXPiece;
	}

	public int getyPiece() {
		return this.yPiece;
	}

	public void setyPiece(int pYPiece) {
		this.yPiece = pYPiece;
	}

	@Override
	public String toString() {
		return this.getX() + " " + this.getY() + " " + this.getOrientation();
	}

	/**
	 *
	 * @param commande
	 * @return true si la commance a été exécutée, false sinon
	 */
	public boolean executerCommande(char commande) {
		switch (commande) {
		case 'D':
			this.tournerADroite();
			return true;
		case 'G':
			this.tournerAGauche();
			return true;
		case 'A':
			this.avancer();
			return true;
		}
		return false;
	}

	public void avancer() {
		switch (this.getOrientation()) {
		case 'N':
			if (this.getY() != this.getyPiece()) {
				this.setY(this.getY() + 1);
			}
			break;

		case 'W':
			if (this.getX() != 0) {
				this.setX(this.getX() - 1);
			}
			break;

		case 'S':
			if (this.getY() != 0) {
				this.setY(this.getY() - 1);
			}
			break;

		case 'E':
			if (this.getX() != this.getxPiece()) {
				this.setX(this.getX() + 1);
			}
			break;
		}
	}

	public void tournerAGauche() {
		switch (this.getOrientation()) {
		case 'N':
			this.setOrientation('W');
			break;

		case 'W':
			this.setOrientation('S');
			break;

		case 'S':
			this.setOrientation('E');
			break;

		case 'E':
			this.setOrientation('N');
			break;
		}
	}

	public void tournerADroite() {
		for (int i = 0; i < 3; i++) {
			this.tournerAGauche();
		}
	}

}
