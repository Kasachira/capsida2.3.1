package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;
import web.model.Cars;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false,
            defaultValue = "5") int count, ModelMap model) {
        CarServiceImpl service = new CarServiceImpl();
        List<Cars> cars = service.getCarList(count);

        model.addAttribute("carTable", cars);
        return "/cars";
    }

}
