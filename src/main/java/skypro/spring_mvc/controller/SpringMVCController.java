package skypro.spring_mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// Создаем класс SpringMVCController и аннотируем его двумя аннотациями:
// Аннотация Controller, чтобы создался бин класса
// Аннотация RequestMapping, чтобы обозначить необходимый URL
@Controller
@RequestMapping("/skypro")
public class SpringMVCController {

    // Создаем метод, который только возвращает название отображения,
    // которое мы создадим далее
    // А срабатывать этот метод будет, когда URL будет содержать "/skypro/1"
    @RequestMapping("/1")
    public String getFirstView() {
        return "view1";
    }

    @RequestMapping("/enterInfo")
    public String enterName() {
        return "enterInfo";
    }

    @RequestMapping("/showInfo")
    public String showName() {
        return "showInfo";
    }

}
