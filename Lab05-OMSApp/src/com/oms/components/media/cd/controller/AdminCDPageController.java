package com.oms.components.media.cd.controller;

import com.oms.app.factory.AdminPageFactory;
import com.oms.bean.CompactDisc;
import com.oms.bean.Media;
import com.oms.components.media.book.controller.AdminBookPageController;
import com.oms.components.media.cd.gui.CDSearchPane;
import com.oms.components.media.cd.gui.CDSinglePane;
import com.oms.components.media.controller.AdminMediaPageController;
import com.oms.components.media.gui.MediaSearchPane;
import com.oms.components.media.gui.MediaSinglePane;
import com.oms.serverapi.CompactDiscApi;
import com.oms.serverapi.IMediaApi;
import com.oms.serverapi.MediaApi;

import java.util.List;
import java.util.Map;

public class AdminCDPageController extends AdminMediaPageController {
    static {
        AdminPageFactory.getInstance().registerPage(
                "cd", new AdminCDPageController());
    }

    private IMediaApi iMediaApi;

    public AdminCDPageController() {

        this.iMediaApi = new CompactDiscApi();
    }

    @Override
    public List<? extends Media> search(Map<String, String> searchParams) {
        MediaApi mediaApi = MediaApi.getInstance();
        return mediaApi.getCds(searchParams);
    }

    @Override
    public MediaSinglePane createSinglePane() {
        return new CDSinglePane();
    }

    @Override
    public MediaSearchPane createSearchPane() {

        return new CDSearchPane();
    }

    @Override
    public Media updateMedia(Media media) {
        return iMediaApi.updateMedia((CompactDisc) media);
    }
}
