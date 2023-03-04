package web.model;

public class Cars {
    int series;
    int year;
    String model;

    public Cars(int series, int year, String model) {
        this.series = series;
        this.year = year;
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "series=" + series +
                ", year=" + year +
                ", model='" + model + '\'' +
                '}';
    }
}
