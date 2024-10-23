package cardGame;


public class Monster {
	@Override
	public String toString() {
		return "Monster Name: "+ name +"  Monster Strength:" + strength;
	}
	
	private int strength;
	private String name;

	
	
//	public Monster(String name,int strength) {
//		SetMonsterStrength(strength);
//		SetMonsterName(name);}
	public Monster(String name,int strength) {
		this.strength=strength;
		this.name=name;}
	
	public void SetMonsterName(String name) {
		 this.name = name;
	}
	
	public int	GetMonsterStrength(){
		return this.strength;
	}
	
	public void SetMonsterStrength(int strength) {
		 strength = this.strength;
	}
	
//	void getMonsters() {
//		for (Monster monster :dungeon) {
//			System.out.print(monster);
//		}
//	}
//	public int getDungeonSize() {
//		return dungeon.size();
//	}
//	
	
	
	

}
