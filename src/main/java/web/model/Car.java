package web.model;

public class Car {
    private String name;
    private String model;
    private int releaseDate;

    public Car(){
    }
    public Car (String name, String model,int releaseDate){
        this.name = name;
        this.model = model;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}

