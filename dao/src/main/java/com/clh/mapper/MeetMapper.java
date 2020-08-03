package com.clh.mapper;

import com.clh.bean.Meet;

import java.util.List;
import java.util.Map;

public interface MeetMapper {
    List list(Map map);

    List listServer();

    int addMeet(Meet meet);

//    int addModdl(Map map);

    List listOne(Integer mid);

    void xiuMeet(Meet meet);

    void deleteModdl(Map map);

    void addModdl(Map map);

    void deleteMeet(Integer mid);
}
