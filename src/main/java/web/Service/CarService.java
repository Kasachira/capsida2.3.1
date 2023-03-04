package web.Service;

import web.model.Cars;

import java.util.List;

public interface CarService {
    public List<Cars> CarList();
    List<Cars> getCarList(Integer count);
}
