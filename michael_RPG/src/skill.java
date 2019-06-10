package michael_RPG;

public class skill {
	String name;
	int damage;
	int use_mp;
	
	public skill(String name,int damage,int use_mp) {
		this.name=name;
		this.damage=damage;
		this.use_mp=use_mp;
	}
	
	public void useSkill(int damage, int use_mp, michael_RPG.monster monster, michael_RPG.character character) {
		monster.hp -= damage;
		character.mp -= use_mp;
	}
}