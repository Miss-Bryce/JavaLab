package Lab_200440217;

public class Comics {
    private String favMagicHero;
    private String favScienceHero;
    private String favVillain;


    public Comics (String favMagicHero, String favScienceHero, String favVillain){
        if (name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be blank.");
    }

    public String getMagicHero(){
        return favMagicHero;
    }
    public String getScienceHero(){
        return favScienceHero;
    }
    public String getVillain(){
        return favVillain;
    }

    public void setMagicHero(String favMagicHero){
        this.favMagicHero = favMagicHero;
    }
    public void setScienceHero(String favScienceHero){
        this.favScienceHero = favScienceHero;
    }
    public void setVillain(String favVillain){
        this.favVillain = favVillain;
    }

}
