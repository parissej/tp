package tp.loto;

public class Tirage {

	// 5 numéros allant de 1 à 50
	// 2 étoiles allant de 1 à 12
	private int boule_1, boule_2, boule_3, boule_4, boule_5, etoile_1, etoile_2;

	public Tirage(String pBoule_1, String pBoule_2, String pBoule_3, String pBoule_4, String pBoule_5, String pEtoile_1,
			String pEtoile_2) {
		this.setBoule_1(pBoule_1);
		this.setBoule_2(pBoule_2);
		this.setBoule_3(pBoule_3);
		this.setBoule_4(pBoule_4);
		this.setBoule_5(pBoule_5);
		this.setEtoile_1(pEtoile_1);
		this.setEtoile_2(pEtoile_2);
	}

	public void setBoule_1(String pBoule_1) {
		this.boule_1 = Integer.parseInt(pBoule_1);
	}

	public void setBoule_2(String pBoule_2) {
		this.boule_2 = Integer.parseInt(pBoule_2);
	}

	public void setBoule_3(String pBoule_3) {
		this.boule_3 = Integer.parseInt(pBoule_3);
	}

	public void setBoule_4(String pBoule_4) {
		this.boule_4 = Integer.parseInt(pBoule_4);
	}

	public void setBoule_5(String pBoule_5) {
		this.boule_5 = Integer.parseInt(pBoule_5);
	}

	public void setEtoile_1(String pEtoile_1) {
		this.etoile_1 = Integer.parseInt(pEtoile_1);
	}

	public void setEtoile_2(String pEtoile_2) {
		this.etoile_2 = Integer.parseInt(pEtoile_2);
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