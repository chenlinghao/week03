package com.clh.service;

import com.clh.bean.Meet;
import com.clh.mapper.MeetMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MeetServiceImpl implements MeetService{
    @Resource
    private MeetMapper meetMapper;

    @Override
    public List list(Map map) {
        return meetMapper.list(map);
    }

    @Override
    public List listServer() {
        return meetMapper.listServer();
    }

//    @Override
//    public int add(Meet meet) {
//        return meetMapper.addMeet(meet);
//    }

    @Override
    public List listOne(Integer mid) {
        return meetMapper.listOne(mid);
    }

    @Override
    public int xiu(Meet meet, String[] split) {
        meetMapper.xiuMeet(meet);
        Map map = new HashMap();
        map.put("mid",meet.getMid());
        map.put("sid",split);
        meetMapper.deleteModdl(map);
        meetMapper.addModdl(map);
        return 0;
    }

    @Override
    public int delete(Integer mid) {
        meetMapper.deleteMeet(mid);
        Map map =new HashMap();
        map.put("mid",mid);
        meetMapper.deleteModdl(map);
         return 0;
    }

    @Override
    public int add(Meet meet,String[] sid) {
      int a =   meetMapper.addMeet(meet);
      Map map = new HashMap();
      map.put("mid",meet.getMid());
      map.put("sid",sid);
      meetMapper.addModdl(map);

      return a;

    }
}
