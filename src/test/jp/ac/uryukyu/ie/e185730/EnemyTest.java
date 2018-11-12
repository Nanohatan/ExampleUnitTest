package jp.ac.uryukyu.ie.e185730;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {
    @Test
    public void attack() {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 6, 3);
        while (enemy.hitPoint>0) {
            hero.attack(enemy); //乱数で0ダメージとなることもあるため、複数回実行してみる// 。
        }
        for (int i = 0; i<5; i++) {
            enemy.attack(hero);
        }
        assertEquals(heroHP, hero.hitPoint);
    }
}