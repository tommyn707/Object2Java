
public class Samurai extends Human {
	static int samuraiCount = 0;
	
	//Constructor
	public Samurai() {
		this.health = 200;
		samuraiCount +=1;
	}
	public Samurai(String name) {
		this.health = 200;
		this.name = name;
		samuraiCount +=1;
	}
	
	//Methods
	public void deathBlow(Human human) {
		human.setHealth(human.getHealth() - human.getHealth());
		this.setHealth(this.getHealth()/2);
		System.out.println("DIe");
	}
	public void meditate() {
		this.setHealth(this.getHealth() + this.getHealth()/2);
		System.out.println("(" + this.getName() + " healing for " + this.getHealth() / 2 + " points!)");
	}
	public int howMany() {
		System.out.println(samuraiCount);
		return samuraiCount;
	}
}