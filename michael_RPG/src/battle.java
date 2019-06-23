package michael_RPG;

public class battle {

    public void 전투(michael_RPG.monster monst, michael_RPG.character charact, michael_RPG.skill skill) {
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

    public void 난동(michael_RPG.monster monster) {
        System.out.println(monster.name + "은(는) 난동을 피우기 시작했습니다!1");
        System.out.println("몬스터가 난동을 피우면 몬스터의 공격력은 상승하고 방어력은 하락합니다!!");
        System.out.println();
        monster.attack_value += monster.attack_value * 1.25;
        monster.defend_value -= monster.defend_value * 1.25;
    }

    public void 난동중(michael_RPG.monster monster) {
        System.out.println(monster.name + "은(는) 난동을 피우고 있습니다!!");
        System.out.println();
        monster.attack_value += monster.attack_value * 1.5;
        monster.defend_value -= monster.defend_value * 1.5;
    }

    public void 의지(michael_RPG.character character) {
        System.out.println("전투가 길어지고 있지만 의지를 갖고 싸움에 임하자\n" + character.name + "의 공격력과 방어력이 올라갑니다!!");
        System.out.println();
        character.attack_value += character.attack_value * 1.5;
        character.defend_value += character.defend_value * 1.5;
    }

    public void 화상(michael_RPG.character character) {
        System.out.println("디아블로의 브레스에 맞아" + character.name + "은(는) 화상을 입었습니다!!");
        System.out.println(character.name + "의 체력이 조금씩 닳기 시작합니다!!");
        System.out.println();
        character.hp -= character.hp * 1.5;
    }

    public void 도트뎀(michael_RPG.character character) {
        System.out.println("화상 데미지를 입었습니다.");
        System.out.println();
        character.hp -= character.hp * 1.5;
    }

    public void 공포(michael_RPG.character character) {
        System.out.println("당신은 군다를 보고 공포에 떨고 있습니다.");
        System.out.println("캐릭터의 공격력이 50%감소하고 방어력은 50% 올라갑니다.");
        System.out.println();
        character.attack_value -= character.attack_value * 0.5;
        character.defend_value += character.defend_value * 0.5;
    }

    public void 희망(michael_RPG.character character) {
        System.out.println("당신은 끝까지 희망을 잃지 않고 몬스터를 상대합니다");
        System.out.println("체력이 회복되었습니다");
        System.out.println("공격력이 올라갔습니다");
        System.out.println();
        character.hp = character.max_hp;
        character.attack_value += character.attack_value * 2;
        character.defend_value += character.defend_value * 2;
    }

    public void 회복(michael_RPG.monster monster) {
        System.out.println(monster.name + "은(는)체력회복 스킬을 사용했습니다!!");
        System.out.println();
        monster.hp += monster.max_hp * 0.5;
    }

    public void 사망(michael_RPG.character character, michael_RPG.monster monster) {
        try {
            System.out.println(character.name + "은(는) 사망하셨습니다,");
            Thread.sleep(1000);
            System.out.println("여신의 가호가 내려와 당신을 다시 부활시켰습니다.");
            Thread.sleep(1000);
            System.out.println("일어나세요....용사여...");
            Thread.sleep(1000);
            System.out.println("몸이 완전히 회복되었습니다.");
            System.out.println("캐릭터의 능력치가 조금 상승했습니다.");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        character.attack_value += character.attack_value * 0.5;
        character.defend_value += character.defend_value * 0.5;
        character.max_hp += character.max_hp * 0.5;
        character.max_mp += character.max_mp * 0.5;
        character.hp = character.max_hp;
        character.mp = character.max_mp;
        monster.hp = monster.max_hp;
    }
    public void 몹사망(michael_RPG.monster monster){
        try{
        System.out.println(monster.name+"은(는) 쓰러졌습니다!!");
        Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
    }
}
