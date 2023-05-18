package cuoiky.bai3;

public class OceaniaCountry extends AbstractCountry {
    CountryData data;

    public OceaniaCountry(CountryData data) {
        this.data = data;
    }

    @Override
    public String getCode() {
        // TODO Auto-generated method stub
        return data.getCode();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return data.getName();
    }

    @Override
    public int getPopulation() {
        // TODO Auto-generated method stub
        return data.getPopulation();
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return data.getArea();
    }

    @Override
    public double getGdp() {
        // TODO Auto-generated method stub
        return data.getGdp();
    }

    /* TODO */
}
