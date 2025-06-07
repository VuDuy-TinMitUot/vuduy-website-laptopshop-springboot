package vn.vuduy.laptopshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import vn.vuduy.laptopshop.domain.User;
import vn.vuduy.laptopshop.repository.UserRepository;
import vn.vuduy.laptopshop.service.UserService;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/admin/user")
    public String getUserPage(Model model) {
        model.addAttribute("newUser", new User()); // new User(): khởi tạo Constructor không tham số VÀ gửi sang view để
                                                   // hiện form(nhồi dữ liệu null vào "newUser")

        return "admin/user/create";
    }

    // Nhồi dữ liệu từ các input HTML vào thuộc tính lớp User(@ModelAttribute)
    @RequestMapping(value = "/admin/user/create", method = RequestMethod.POST)
    public String createUserPage(Model model, @ModelAttribute("newUser") User vuduy) {
        System.out.println("Run here" + vuduy);
        this.userService.handleSaveUser(vuduy);
        return "hello";
    }
}
