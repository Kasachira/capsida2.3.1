package web.Service;

import web.model.Cars;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private List<Cars> carList = CarList();
@Override
    public List<Cars> CarList() {
        carList = new ArrayList<>();

        carList.add(new Cars(777,  1966, "Volga"));
        carList.add(new Cars(123,  2014, "Camry"));
        carList.add(new Cars(133,  2016, "Prado"));
        carList.add(new Cars(752, 2000, "Corolla"));
        carList.add(new Cars(666,  2020, "Alphard"));
        return carList;
    }
    @Override
    public List<Cars> getCarList(Integer count) {

        List<Cars> countedCar = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            if (count >= 5) {
                countedCar = carList;
                break;
            }
            countedCar.add(carList.get(i));
        }
        return countedCar;
    }
}