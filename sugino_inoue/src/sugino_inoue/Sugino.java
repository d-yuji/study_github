package sugino_inoue;

public class Sugino {
	private String hisWord;
	
	public Sugino() {
		hisWord = "Oh........";
	}
	public Sugino(String hisWord) {
		this.hisWord = hisWord;
	}
	
	public void voice() {
		System.out.println("He says: "+hisWord);
	}
}
