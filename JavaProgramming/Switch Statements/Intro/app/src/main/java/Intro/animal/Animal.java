package intro.animal;

public class Animal {
    private AnimalType animalType;
    private String animalName;

    public Animal(int year) {
        switch (year % 12) {
            case 0:
                setAnimalName("Monkey");
                setAnimalType(AnimalType.MAMMAL);
                break;

            case 1:
                setAnimalName("Rooster");
                setAnimalType(AnimalType.MAMMAL);
                break;

            case 2:
                setAnimalName("Dog");
                setAnimalType(AnimalType.MAMMAL);
                break;

            case 3:
                setAnimalName("Pig");
                setAnimalType(AnimalType.MAMMAL);
                break;

            case 4:
                setAnimalName("Rat");
                setAnimalType(AnimalType.MAMMAL);
                break;

            case 5:
                setAnimalName("Ox");
                setAnimalType(AnimalType.MAMMAL);
                break;

            case 6:
                setAnimalName("Tiger");
                setAnimalType(AnimalType.MAMMAL);
                break;

            case 7:
                setAnimalName("Rabbit");
                setAnimalType(AnimalType.MAMMAL);
                break;

            case 8:
                setAnimalName("Dragon");
                setAnimalType(AnimalType.SERPENT);
                break;

            case 9:
                setAnimalName("Snake");
                setAnimalType(AnimalType.SERPENT);
                break;

            case 10:
                setAnimalName("Horse");
                setAnimalType(AnimalType.MAMMAL);
                break;

            case 11:
                setAnimalName("Sheep");
                setAnimalType(AnimalType.MAMMAL);
                break;

            default:
                System.out.println("We're sorry but the year you entered does not exist on the chinese zodiac chart.");
                break;
        }
    }

    /**
     * @return AnimalType return the animalType
     */
    public AnimalType getAnimalType() {
        return animalType;
    }

    /**
     * @param animalType the animalType to set
     */
    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    /**
     * @return String return the animalName
     */
    public String getAnimalName() {
        return animalName;
    }

    /**
     * @param animalName the animalName to set
     */
    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

}
