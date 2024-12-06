public class Weather {
    private String city;
    private double windSpeed;
    private int rainPercentage;
    private boolean isRainy;
    private boolean isCloudy;
    private boolean isSunny;

    public Weather(String city, double windSpeed, int rainPercentage, boolean isRainy, boolean isCloudy, boolean isSunny) {
        this.city = city;
        this.windSpeed = windSpeed;
        this.rainPercentage = rainPercentage;
        this.isRainy = isRainy;
        this.isCloudy = isCloudy;
        this.isSunny = isSunny;
    }

    public Weather(double windSpeed, int rainPercentage, String city) {
        this.windSpeed = windSpeed;
        this.rainPercentage = rainPercentage;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getRainPercentage() {
        return rainPercentage;
    }

    public void setRainPercentage(int rainPercentage) {
        this.rainPercentage = rainPercentage;
    }

    public boolean isRainy() {
        return isRainy;
    }

    public void setRainy(boolean rainy) {
        isRainy = rainy;
    }

    public boolean isCloudy() {
        return isCloudy;
    }

    public void setCloudy(boolean cloudy) {
        isCloudy = cloudy;
    }

    public boolean isSunny() {
        return isSunny;
    }

    public void setSunny(boolean sunny) {
        isSunny = sunny;
    }

    public void printWeatherInfo() {
        System.out.println("City: " + city);
        System.out.println("Wind speed: " + windSpeed);
        System.out.println("Rain percentage: " + rainPercentage);
        System.out.println("Is it rainy: " + isRainy);
        System.out.println("Is it cloudy: " + isCloudy);
        System.out.println("Is it sunny: " + isSunny);
    }

    public boolean goodTimeToWalk() {
        if (isRainy) {
            return false;
        } else if (isCloudy && rainPercentage > 50) {
            return false;
        } else if (windSpeed > 24.5) {
            return false;
        }
        return true;
    }
}
