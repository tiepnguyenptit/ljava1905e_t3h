package application.controller.web;

import application.constant.CompanyConstant;
import application.data.service.UserService;
import application.model.viewmodel.common.HeaderMenuVM;
import application.model.viewmodel.common.LayoutHeaderVM;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

public class BaseController {

    @Autowired
    private UserService userService;

    public LayoutHeaderVM getLayoutHeaderVM() {
        LayoutHeaderVM vm = new LayoutHeaderVM();
        ArrayList<HeaderMenuVM> headerMenuVMArrayList = new ArrayList<>();
        headerMenuVMArrayList.add(new HeaderMenuVM("Home", "/"));
        headerMenuVMArrayList.add(new HeaderMenuVM("Contact", "/"));
        headerMenuVMArrayList.add(new HeaderMenuVM("Cart", "/cart"));

        vm.setHeaderMenuVMArrayList(headerMenuVMArrayList);
        vm.setCompanyName(CompanyConstant.NAME);

        return vm;
    }



}
