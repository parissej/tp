package tp.loto;

public class Tirage {

	// 5 numéros allant de 1 à 50
	// 2 étoiles allant de 1 à 12
	private int boule_1, boule_2, boule_3, boule_4, boule_5, etoile_1, etoile_2;

	public Tirage(int pI, int pI2, int pI3, int pI4, int pI5, int pI6, int pI7) {
		this.setBoule_1(pI);
		this.setBoule_2(pI2);
		this.setBoule_3(pI3);
		this.setBoule_4(pI4);
		this.setBoule_5(pI5);
		this.setEtoile_1(pI6);
		this.setEtoile_2(pI7);
	}

	public void setBoule_1(int pBoule_1) {
		this.boule_1 = pBoule_1;
	}

	public void setBoule_2(int pBoule_2) {
		this.boule_2 = pBoule_2;
	}

	public void setBoule_3(int pBoule_3) {
		this.boule_3 = pBoule_3;
	}

	public void setBoule_4(int pBoule_4) {
		this.boule_4 = pBoule_4;
	}

	public void setBoule_5(int pBoule_5) {
		this.boule_5 = pBoule_5;
	}

	public void setEtoile_1(int pEtoile_1) {
		this.etoile_1 = pEtoile_1;
	}

	public void setEtoile_2(int pEtoile_2) {
		this.etoile_2 = pEtoile_2;
	}

	public int getBoule_1() {
		return this.boule_1;
	}

	public int getBoule_2() {
		return this.boule_2;
	}

	public int getBoule_3() {
		return this.boule_3;
	}

	public int getBoule_4() {
		return this.boule_4;
	}

	public int getBoule_5() {
		return this.boule_5;
	}

	public int getEtoile_1() {
		return this.etoile_1;
	}

	public int getEtoile_2() {
		return this.etoile_2;
	}

	@Override
	public String toString() {
		return "[" + this.getBoule_1() + ", " + this.getBoule_2() + ", " + this.getBoule_3() + ", " + this.getBoule_4()
				+ ", " + this.getBoule_5() + ", " + this.getEtoile_1() + ", " + this.getEtoile_2() + "]";
	}
}