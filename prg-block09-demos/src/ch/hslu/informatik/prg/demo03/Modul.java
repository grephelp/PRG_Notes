package ch.hslu.informatik.prg.demo03;

public class Modul {
	
	private String name;
	private int etcs;
	private int semester;
	
	
	public Modul(String name, int etcs, int semester) {
		this.name = name;
		this.etcs = etcs;
		this.semester = semester;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEtcs() {
		return etcs;
	}


	public void setEtcs(int etcs) {
		this.etcs = etcs;
	}


	public int getSemester() {
		return semester;
	}


	public void setSemester(int semester) {
		this.semester = semester;
	}


	@Override
	public String toString() {
		return "Modul [name=" + name + ", etcs=" + etcs + ", semester=" + semester + "]";
	} 
	
	

}
