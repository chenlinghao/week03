package com.clh.service;

import com.clh.bean.Meet;

import java.util.List;
import java.util.Map;

public interface MeetService {
    List list(Map map);

    List listServer();

    int add(Meet meet,String[] s);
//    int add(Meet meet);

    List listOne(Integer mid);

    int xiu(Meet meet, String[] split);

    int delete(Integer mid);
}
