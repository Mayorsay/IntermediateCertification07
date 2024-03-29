package adaptor_;

public class MeteoStore {

    boolean save(MeteoSensor meteoSensor) {
        System.out.println("Сохранение данных по метеодатчику: ");
        System.out.println(meteoSensor.getId() + " |t " + meteoSensor.getTemperature() + " |h " + meteoSensor.getHumidity() + " |p " + meteoSensor.getPressure());
        return true;
    }

    boolean save(MeteoSensorSimple meteoSensor) {
        System.out.println("Сохранение данные по метеодатчику: ");
        System.out.println(meteoSensor.getId() + " |t " + meteoSensor.getTemperature());
        return true;
    }
}
