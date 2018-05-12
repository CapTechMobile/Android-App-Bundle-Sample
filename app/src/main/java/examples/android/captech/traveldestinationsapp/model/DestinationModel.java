package examples.android.captech.traveldestinationsapp.model;

public class DestinationModel {

    private String city;
    private String country;
    private String continent;
    private String language;
    private String population;
    private String area;
    private String density;
    private int descriptionResourceId;
    private int[] destinationImageResourceIds;

    public DestinationModel(String city, String country, String continent, String language,
                            String population, String area, String density, int descriptionResourceId,
                            int[] destinationImageResourceIds) {
        this.city = city;
        this.country = country;
        this.continent = continent;
        this.language = language;
        this.population = population;
        this.area = area;
        this.density = density;
        this.descriptionResourceId = descriptionResourceId;
        this.destinationImageResourceIds = destinationImageResourceIds;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String density) {
        this.density = density;
    }


    public int getDescriptionResourceId() {
        return descriptionResourceId;
    }

    public void setDescriptionResourceId(int descriptionResourceId) {
        this.descriptionResourceId = descriptionResourceId;
    }

    public int[] getDestinationImageResourceIds() {
        return destinationImageResourceIds;
    }

    public void setDestinationImageResourceIds(int[] destinationImageResourceIds) {
        this.destinationImageResourceIds = destinationImageResourceIds;
    }

}
