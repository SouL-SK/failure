package michael_RPG;

public class chain {

    public void 전투(michael_RPG.monster monst, michael_RPG.character charact, michael_RPG.skill skil) {
        System.out.println(charact.name + "의 공격!!");
        monst.hp -= ((charact.attack_value + charact.weapon.attack_value) - monst.defend_value);
        체력보조(charact);
        System.out.println(
                (charact.attack_value + charact.weapon.attack_value) - monst.defend_value + "의 데미지를 주었습니다.");
        if (monst.hp < 0) {
            System.out.println(monst.name + "의 체력:" + "0/" + monst.max_hp);
        } else
            System.out.println(monst.name + "의 체력:" + monst.hp + "/" + monst.max_hp);
        System.out.println();
    }

    public void 전투2(michael_RPG.monster monst, michael_RPG.character charact) {
        System.out.println(monst.name + "의 공격!!");
        charact.hp -= (monst.attack_value - (charact.defend_value + charact.equip.defend_value));
        체력보조(charact);
        공격보조(monst, charact);
        int n = 공격보조(monst, charact);
        if (n == 0) {
            System.out.println("0의 데미지를 주었습니다.");
        }
        if (n == 1) {
            System.out.println(
                    monst.attack_value - (charact.defend_value + charact.equip.defend_value) + "의 데미지를 주었습니다.");
        }
        System.out.println(charact.name + "의 체력" + charact.hp + "/" + charact.max_hp);
        System.out.println();
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

}
