package tp.loto;

public class Tirage {

	private String boule_1, boule_2, boule_3, boule_4, boule_5, etoile_1, etoile_2;

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
		this.boule_1 = pBoule_1;
	}

	public void setBoule_2(String pBoule_2) {
		this.boule_2 = pBoule_2;
	}

	public void setBoule_3(String pBoule_3) {
		this.boule_3 = pBoule_3;
	}

	public void setBoule_4(String pBoule_4) {
		this.boule_4 = pBoule_4;
	}

	public void setBoule_5(String pBoule_5) {
		this.boule_5 = pBoule_5;
	}

	public void setEtoile_1(String pEtoile_1) {
		this.etoile_1 = pEtoile_1;
	}

	public void setEtoile_2(String pEtoile_2) {
		this.etoile_2 = pEtoile_2;
	}

	public String getBoule_1() {
		return this.boule_1;
	}

	public String getBoule_2() {
		return this.boule_2;
	}

	public String getBoule_3() {
		return this.boule_3;
	}

	public String getBoule_4() {
		return this.boule_4;
	}

	public String getBoule_5() {
		return this.boule_5;
	}

	public String getEtoile_1() {
		return this.etoile_1;
	}

	public String getEtoile_2() {
		return this.etoile_2;
	}
}