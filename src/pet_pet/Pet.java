package pet_pet;

public abstract class Pet {
    private int pawsCount;
    public void sleep() {
        System.out.println("Сплю");
    }
    public void play() {
            System.out.println("Играю");
        }
    public abstract void giveVoice();

    public int getPawsCount() {
        return pawsCount;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }
}
