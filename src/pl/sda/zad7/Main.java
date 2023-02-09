package pl.sda.zad7;

public class Main {

    public static void main(String[] args) {

        GunMagazine gunMagazine = new GunMagazine(3);

        gunMagazine.loadBullet("Bullet1");
        gunMagazine.loadBullet("Bullet2");
        gunMagazine.loadBullet("Bullet3");

        gunMagazine.shot();
        gunMagazine.shot();
        gunMagazine.shot();
        System.out.println(gunMagazine.isLoaded());
        gunMagazine.shot();

        gunMagazine.loadBullet("Bullet1");
        gunMagazine.loadBullet("Bullet2");
        gunMagazine.loadBullet("Bullet3");

        gunMagazine.loadBullet("Bullet4");
        gunMagazine.loadBullet("Bullet5");
        gunMagazine.loadBullet("Bullet6");

    }
}
