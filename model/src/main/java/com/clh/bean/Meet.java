package com.clh.bean;

public class Meet {
    private Integer mid;
    private Integer code;
    private String mname;
    private String start_time;
    private String end_time;
    private String create_time;

    @Override
    public String toString() {
        return "Meet{" +
                "mid=" + mid +
                ", code=" + code +
                ", mname='" + mname + '\'' +
                ", start_time='" + start_time + '\'' +
                ", end_time='" + end_time + '\'' +
                ", create_time='" + create_time + '\'' +
                '}';
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Meet() {
    }

    public Meet(Integer mid, Integer code, String mname, String start_time, String end_time, String create_time) {
        this.mid = mid;
        this.code = code;
        this.mname = mname;
        this.start_time = start_time;
        this.end_time = end_time;
        this.create_time = create_time;
    }
}
