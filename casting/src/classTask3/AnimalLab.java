package classTask3;

public class AnimalLab {
    public void checkAnimal(Animal animal) {
        if (animal instanceof Herbivore) {
        	Herbivore h = (Herbivore) animal;
            h.printType();
        } 
        else if (animal instanceof Carnivore) {
            Carnivore c = (Carnivore) animal;
            c.printType();
        } 
        else if (animal instanceof Omnivore) {
            Omnivore o = (Omnivore) animal;
            o.printType();
        }
    }
}