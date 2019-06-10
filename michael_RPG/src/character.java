package michael_RPG;

public class character {
	String name;
	int hp;
	int mp;
	int max_hp;
	int max_mp;
	int attack_value;
	int defend_value;
	michael_RPG.equipment weapon;
	michael_RPG.equipment equip;
	michael_RPG.portion hp_portion;
	michael_RPG.portion mp_portion;
	michael_RPG.skill skill1;

	public character(String name, int hp, int mp, int max_hp, int max_mp, int attack_value, int defend_value,
					 michael_RPG.equipment weapon, michael_RPG.equipment equip, michael_RPG.portion hp_portion, michael_RPG.portion mp_portion, michael_RPG.skill skill1) {
		super();
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.max_hp = max_hp;
		this.max_mp = max_mp;
		this.attack_value = attack_value;
		this.defend_value = defend_value;
		this.weapon = weapon;
		this.equip = equip;
		this.hp_portion = hp_portion;
		this.mp_portion = mp_portion;
		this.skill1 = skill1;
		
	}

}