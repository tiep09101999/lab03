package com.oms.serverapi;

import com.oms.bean.DigitalVideoDisc;

import java.util.ArrayList;
import java.util.Map;

public class DigitalVideoDiscApi implements IMediaApi<DigitalVideoDisc>{
    @Override
    public ArrayList<DigitalVideoDisc> getMedias(Map<String, String> queryParams) {
        System.out.println("Get Digital Video Disc");
        return null;
    }

    @Override
    public DigitalVideoDisc updateMedia(DigitalVideoDisc media) {
        System.out.println("Update Digital Video Disc");
        return null;
    }
}
