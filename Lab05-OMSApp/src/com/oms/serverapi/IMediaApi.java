package com.oms.serverapi;

import com.oms.bean.Media;

import java.util.ArrayList;
import java.util.Map;

public interface IMediaApi<T extends Media> {

    public ArrayList<T> getMedias(Map<String, String> queryParams);

    public T updateMedia(T media);
}
