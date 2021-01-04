package com.oms.serverapi;

import com.oms.bean.Book;
import com.oms.bean.CompactDisc;

import java.util.ArrayList;
import java.util.Map;

public class CompactDiscApi implements IMediaApi<CompactDisc> {
    @Override
    public ArrayList<CompactDisc> getMedias(Map<String, String> queryParams) {
        System.out.println("get CompactDiscApi");
        return null;
    }

    @Override
    public CompactDisc updateMedia(CompactDisc media) {
        System.out.println("Update CompactDisc");
        return null;
    }
}
