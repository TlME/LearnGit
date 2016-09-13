
public class Spongebob {
	private boolean readyFlag = false;

	public Spongebob(){
		this.readyFlag = true;
	}
	public Spongebob(int i){
		if (i % 2 == 0){
			this.readyFlag = true;
		}
		else{
			this.readyFlag = false;
		}
	}
	public void feels(){
		System.out.println("Are you feeling it now, Mr. Krabs?");
	}
	public void hey(){
		if (this.readyFlag = true){
			System.out.println("I'm ready!");
		}
		else{
			System.out.println("I ddowwhn bleehhn bee neephleehh, MR. KRABS!");
		}
	}
}
