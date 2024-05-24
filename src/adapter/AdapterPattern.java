package adapter;


public class AdapterPattern {

  public static void main(String[] args) throws Exception {
    TemperatureMeasurement measurement = new TemperatureMeasurement();
    String temp = measurement.getTepmerature();
    temp = temp.split(" ")[0];

    TemperatureStoring storing = new TemperatureStoring();
    storing.storeTemperature(Integer.parseInt(temp));
  }
}

