package Lab_200440217;

public class ComicSeries {
    private String favMagicHero;
    private String favScienceHero;
    private String favVillain;


    public ComicSeries(String favMagicHero, String favScienceHero, String favVillain){
        setMagicHero(favMagicHero);
        setScienceHero(favScienceHero);
        setVillain(favVillain);

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
        if (!favMagicHero.isBlank()) {
            this.favMagicHero = favMagicHero;
        }
        else{
            throw new IllegalArgumentException("Magic Hero cannot be blank.");
        }
    }
    public void setScienceHero(String favScienceHero){
        if (!favScienceHero.isBlank())
        {
            this.favScienceHero = favScienceHero;
        }
        else{
        throw new IllegalArgumentException("Science Hero cannot be blank.");
        }

    }
    public void setVillain(String favVillain){
        if (!favVillain.isBlank()) {
            this.favVillain = favVillain;
        }

    }

    public String toString(){
        String result = "You comic book has been made with the following characters: " + favMagicHero + ", " + favScienceHero + ", and " + favVillain;

        return result;
    }

}
