public class HumanTest {

	public static void main(String[] args) {
		Human testHuman1 = new Human("Human");
		Human testHuman2 = new Human("Human2");
		Human testHuman3 = new Human("Human3");
		Wizard testWizard1 = new Wizard("Wizard1");
		Wizard testWizard2 = new Wizard("Wizard2");
		Wizard testWizard3 = new Wizard("Wizard3");
		Ninja testNinja1 = new Ninja("Ninja");
		Ninja testNinja2 = new Ninja("Ninja2");
		Ninja testNinja3 = new Ninja("Ninja3");
		Samurai testSamurai1 = new Samurai("Samurai1");
		Samurai testSamurai2 = new Samurai("Samurai2");
		Samurai testSamurai3 = new Samurai("Samurai3");		
		
		testHuman1.attack(testSamurai3);
		testWizard1.fireball(testNinja2);
		testNinja2.steal(testHuman2);
		testSamurai1.attack(testHuman3);
		testWizard2.heal(testNinja2);
		testWizard3.fireball(testNinja3);
		testSamurai3.deathBlow(testNinja1);
		testSamurai2.meditate();
		testNinja1.runAway();
		testSamurai3.howMany();		
	}
}