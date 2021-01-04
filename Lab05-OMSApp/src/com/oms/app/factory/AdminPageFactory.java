package com.oms.app.factory;

import com.oms.components.abstractdata.controller.ADataPageController;

import javax.swing.*;
import java.util.HashMap;

public class AdminPageFactory {

    private static AdminPageFactory adminPageFactory = new AdminPageFactory();

    public static AdminPageFactory getInstance() {
        return adminPageFactory;
    }

    private static HashMap<String, ADataPageController> hashMap = new HashMap<>();

    public JPanel createPage(String typeOfPage) {
        return (hashMap.get(typeOfPage)).getDataPagePane();
    }

    public void registerPage(String typeOfPage, ADataPageController aDataPageController) {
        hashMap.put(typeOfPage, aDataPageController);
    }
}
