package za.edu.vcconnect.st10068305;

public class PetSold extends ItemSold {
    private boolean vaccinated, neutered, housebroken;

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    public boolean isNeutered() {
        return neutered;
    }

    public void setNeutered(boolean neutered) {
        this.neutered = neutered;
    }

    public boolean isHousebroken() {
        return housebroken;
    }

    public void setHousebroken(boolean housebroken) {
        this.housebroken = housebroken;
    }
}
