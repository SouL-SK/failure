package michael_RPG;

public class battle {

    public void 전투(michael_RPG.monster monst, michael_RPG.character charact) {
        System.out.println(charact.name + "의 공격!!");
        System.out.println("----------------------------------------------------------");
        monst.hp -= ((charact.attack_value + charact.weapon.attack_value) - monst.defend_value);
        체력보조(charact);
        System.out.println(
                (charact.attack_value + charact.weapon.attack_value) - monst.defend_value + "의 데미지를 주었습니다.");
        System.out.println("----------------------------------------------------------");
        if (monst.hp < 0) {
            System.out.println(monst.name + "의 체력:" + "0/" + monst.max_hp);
            System.out.println("-----------------------------------------------------------");
        } else
            System.out.println(monst.name + "의 체력:" + monst.hp + "/" + monst.max_hp);
        System.out.println("---------------------------------------------------------------");
        System.out.println();
    }

    public void 전투2(michael_RPG.monster monst, michael_RPG.character charact) {
        System.out.println(monst.name + "의 공격!!");
        System.out.println("-------------------------------------------------------------");
        charact.hp -= (monst.attack_value - (charact.defend_value + charact.equip.defend_value));
        체력보조(charact);
        공격보조(monst, charact);
        int n = 공격보조(monst, charact);
        if (n == 0) {
            System.out.println("0의 데미지를 주었습니다.");
            System.out.println("---------------------------------------------------------");
        }
        if (n == 1) {
            System.out.println(
                    monst.attack_value - (charact.defend_value + charact.equip.defend_value) + "의 데미지를 주었습니다.");
            System.out.println("-------------------------------------------------------------------------");
        }
        System.out.println(charact.name + "의 체력" + charact.hp + "/" + charact.max_hp);
        System.out.println("-------------------------------------------------------------------");
    }

    public void 체력보조(michael_RPG.character charact) {
        if (charact.hp > charact.max_hp) {
            charact.hp = charact.max_hp;
        }
    }

    public int 공격보조(michael_RPG.monster monst, michael_RPG.character charact) {
        if (monst.attack_value - (charact.defend_value + charact.equip.defend_value) < 0) {

            return 0;
        } else
            return 1;
    }

    public void 마나소모(michael_RPG.character charact) {
        charact.mp -= charact.skill1.use_mp;
    }
    public void 난동(michael_RPG.monster monster){
        System.out.println(monster.name+"은(는) 난동을 피우기 시작했습니다!1");
        System.out.println("몬스터가 난동을 피우면 몬스터의 공격력은 상승하고 방어력은 하락합니다!!");
        monster.attack_value+=monster.attack_value*1.5;
        monster.defend_value-=monster.defend_value*1.5;
    }
    public void
}
