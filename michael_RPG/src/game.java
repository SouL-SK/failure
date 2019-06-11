package michael_RPG;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        // 생성한 인스턴스들
        michael_RPG.equipment branch = new michael_RPG.equipment("나뭇가지", 10, 0);
        michael_RPG.equipment knight_sword = new michael_RPG.equipment("초보 기사의 검", 1000, 0);
        michael_RPG.equipment knight_blade = new michael_RPG.equipment("기사 단장의 검", 5000, 0);
        michael_RPG.equipment sword_saint = new michael_RPG.equipment("검성의 검", 10000, 0);
        michael_RPG.equipment 낡은세트 = new michael_RPG.equipment("낡은 세트", 0, 50);
        michael_RPG.equipment 초보기사세트 = new michael_RPG.equipment("초보 기사 세트", 0, 250);
        michael_RPG.equipment 기사단장세트 = new michael_RPG.equipment("기사 단장 세트", 0, 500);
        michael_RPG.equipment 검성세트 = new michael_RPG.equipment("검성 세트", 0, 5000);
        michael_RPG.skill 달팽이세마리 = new michael_RPG.skill("달팽이 세마리", 50, 10);
        michael_RPG.skill 베기 = new michael_RPG.skill("베기", 1000, 30);
        michael_RPG.skill 베어가르기 = new michael_RPG.skill("베어가르기", 3000, 50);
        michael_RPG.skill 홀리크로스 = new michael_RPG.skill("홀리크로스", 25000, 150);
        michael_RPG.portion 체력포션 = new michael_RPG.portion("체력포션", 100,5);
        michael_RPG.portion 마나포션 = new michael_RPG.portion("마나포션", 100,5);
        michael_RPG.character beginner = new michael_RPG.character("리무녁", 100, 80, 100, 80, 50, 50, branch, 낡은세트, 체력포션, 마나포션, 달팽이세마리);
        michael_RPG.character michael = new michael_RPG.character("미하일", 1000, 800, 1000, 800, 150, 150, knight_sword, 초보기사세트, 체력포션, 마나포션,
                베기);
        michael_RPG.character souljunior = new michael_RPG.character("소울주니어", 800, 1000, 800, 1000, 200, 150, knight_sword, 초보기사세트, 체력포션,
                마나포션, 베기);
        michael_RPG.character knghit_michael = new michael_RPG.character("기사미하일", 3000, 1500, 3000, 1500, 500, 700, knight_blade, 기사단장세트,
                체력포션, 마나포션, 베어가르기);
        michael_RPG.character soulsenior = new michael_RPG.character("소울시니어", 2000, 2000, 2000, 2000, 700, 500, knight_blade, 기사단장세트,
                체력포션, 마나포션, 베어가르기);
        michael_RPG.character sword_saint_michael = new michael_RPG.character("검성미하일", 10000, 8000, 10000, 8000, 2500, 3000, sword_saint,
                검성세트, 체력포션, 마나포션, 홀리크로스);
        michael_RPG.character soulmaster = new michael_RPG.character("소울마스터", 10000, 8000, 10000, 8000, 3000, 2500, sword_saint, 검성세트,
                체력포션, 마나포션, 홀리크로스);
        michael_RPG.monster 피카츄 = new michael_RPG.monster("피카츄", 150, 150, 80, 0);
        michael_RPG.monster 람머스 = new michael_RPG.monster("람머스", 8500, 8500, 280, 110);
        michael_RPG.monster 군다 = new michael_RPG.monster("군다", 110000, 110000, 5000, 1600);
        michael_RPG.monster 디아블로 = new michael_RPG.monster("디아블로", 6000000, 6000000, 10000, 5000);
        michael_RPG.message 메시지 = new michael_RPG.message();
        michael_RPG.status 상태 = new michael_RPG.status();
        michael_RPG.chain 연결 = new michael_RPG.chain();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        // 여기까지 생성한 인스턴스 들이었습니다.

        // 게임 시작
        System.out.println("게임을 시작하겠습니다.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println("게임을 시작하기 앞서서 게임에 대해서 설명해드리겠습니다.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println("당신은 이 세계에서 몬스터를 잡아 전직을 해야합니다.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println("몬스터를 잡고 나면 전직을 하실 수 있습니다.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println("전직을 하면 더 강한 능력치, 스킬과 장비를 얻으실 수 있습니다.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println("당신은 초보자부터 시작합니다.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println("전직 루트는 두가지 루트가 있습니다.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("미하일 루트가 있고 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println("소울마스터 루트가 있습니다.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("미하일 루트는 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("초보자 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("- 미하일 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("- 기사미하일 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("- 검성미하일 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println("입니다.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("소울마스터 루트는 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("초보자 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("- 소울주니어 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("- 소울시니어 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("- 소울마스터 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("입니다.");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.print("선택창에서 번호를 알려드릴 테니 ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
        }
        System.out.println("원하는 행동은 선택지를 보고 입력하시면 됩니다.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("그러면 이제 게임을 시작하겠습니다.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        System.out.println("즐거운 시간 되십시오!");
        System.out.println("\n");
        System.out.println("로딩 중...");

//		 게임 시작 기본 설명이었습니다.
//		 잠깐 텀

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        메시지.스토리시작();
        try {
            Thread.sleep(1000);
            {
            }
        } catch (InterruptedException e) {
        }
        메시지.이동(beginner, 피카츄);
        try {
            Thread.sleep(1000);
            {
            }
        } catch (InterruptedException e) {
        }
        while (피카츄.hp > 0) {
            메시지.전투창(beginner);
            i = sc.nextInt();
            if (i == 1) {
                메시지.스킬창(beginner, 달팽이세마리);
                if (i == 1) {
                    연결.전투(피카츄, beginner, 달팽이세마리);
                    연결.마나소모(beginner);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    연결.전투2(피카츄, beginner);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            }
            if (i == 2) {
                메시지.포션();
                i = sc.nextInt();
                if (i == 1) {
                    메시지.체력포션(beginner);
                }
                if (i == 2) {
                    메시지.마나포션(beginner);
                }
            }
        }
        메시지.전직(피카츄, beginner);
        i = sc.nextInt();
        if (i == 1) {
            메시지.전직완료(michael);
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            메시지.이동(michael, 람머스);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            while (람머스.hp > 0) {
                메시지.전투창(michael);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(michael, 베기);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(람머스, michael, 베기);
                        연결.마나소모(michael);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                        연결.전투2(람머스, michael);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (i == 2) {
                    메시지.포션();
                    i = sc.nextInt();
                    if (i == 1) {
                        메시지.체력포션(michael);
                    }
                    if (i == 2) {
                        메시지.마나포션(michael);
                    }
                }
            }
            메시지.전직(람머스, michael);
            메시지.이동(knghit_michael, 군다);
            try {
                Thread.sleep(1000);
                {
                }
            } catch (InterruptedException e) {
            }
            while (군다.hp > 0) {
                메시지.전투창(knghit_michael);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(knghit_michael, 베어가르기);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(군다, knghit_michael, 베어가르기);
                        연결.마나소모(knghit_michael);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                        연결.전투2(군다, knghit_michael);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (i == 2) {
                    메시지.포션();
                    i = sc.nextInt();
                    if (i == 1) {
                        메시지.체력포션(knghit_michael);
                    }
                    if (i == 2) {
                        메시지.마나포션(knghit_michael);
                    }
                }
            }
            메시지.전직(군다, knghit_michael);
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            메시지.이동(sword_saint_michael, 디아블로);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            while (디아블로.hp > 0) {
                메시지.전투창(sword_saint_michael);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(sword_saint_michael, 홀리크로스);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(디아블로, sword_saint_michael, 홀리크로스);
                        연결.마나소모(sword_saint_michael);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                        연결.전투2(디아블로, sword_saint_michael);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (i == 2) {
                    메시지.포션();
                    i = sc.nextInt();
                    if (i == 1) {
                        메시지.체력포션(sword_saint_michael);
                    }
                    if (i == 2) {
                        메시지.마나포션(sword_saint_michael);
                    }
                }
            }
            System.out.println("축하합니다!! 디아블로를 무찌르셨습니다!!");
            System.out.println("미하일키우기를 즐겨주셔서 감사합니다!!");
            System.out.println();
        }
        if (i == 2) {///여기서 부터 소울마스터 루트
            메시지.전직완료(souljunior);
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            메시지.이동(souljunior, 람머스);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            while (람머스.hp > 0) {
                메시지.전투창(souljunior);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(souljunior, 베기);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(람머스, souljunior, 베기);
                        연결.마나소모(souljunior);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                        연결.전투2(람머스, souljunior);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (i == 2) {
                    메시지.포션();
                    i = sc.nextInt();
                    if (i == 1) {
                        메시지.체력포션(souljunior);
                    }
                    if (i == 2) {
                        메시지.마나포션(souljunior);
                    }
                }
            }
            메시지.전직(람머스, souljunior);
            메시지.전직완료(soulsenior);
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            메시지.이동(soulsenior, 군다);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            while (군다.hp > 0) {
                메시지.전투창(soulsenior);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(soulsenior, 베어가르기);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(군다, soulsenior, 베어가르기);
                        연결.마나소모(soulsenior);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                        연결.전투2(군다, soulsenior);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                    }
                }
                if (i == 2) {
                    메시지.포션();
                    i = sc.nextInt();
                    if (i == 1) {
                        메시지.체력포션(soulsenior);
                    }
                    if (i == 2) {
                        메시지.마나포션(soulsenior);
                    }
                }
            }
            메시지.전직(군다, soulsenior);
            메시지.전직완료(soulmaster);
            System.out.println();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            메시지.이동(soulmaster, 디아블로);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            while (디아블로.hp > 0) {
                메시지.전투창(soulmaster);
                i = sc.nextInt();
                if (i == 1) {
                    메시지.스킬창(soulmaster, 홀리크로스);
                    i = sc.nextInt();
                    if (i == 1) {
                        연결.전투(디아블로, soulmaster, 홀리크로스);
                        연결.마나소모(soulmaster);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                        연결.전투2(디아블로, soulmaster);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                        }
                    }
                }
            }
            if (i == 2) {
                메시지.포션();
                i = sc.nextInt();
                if (i == 1) {
                    메시지.체력포션(soulmaster);
                }
                if (i == 2) {
                    메시지.마나포션(soulmaster);
                }
            }
            System.out.println("축하합니다!! 디아블로를 무찌르셨습니다!!");
            System.out.println("미하일키우기를 즐겨주셔서 감사합니다!!");
            System.out.println();
        }
    }
}

