package com.practise.http.viewholderpattern;

/**
 * Created by e00959 on 4/9/2015.
 */
public class StudentPojo {

    private String mEmpNo=null;
    private String mEmpName=null;
    private String mEmpAddress=null;

    public StudentPojo(String empNo,String empName,String empAddress)
    {
        mEmpNo=empNo;
        mEmpName=empName;
        mEmpAddress=empAddress;
    }

    public String getmEmpNo() {
        return mEmpNo;
    }

    public String getmEmpName() {
        return mEmpName;
    }

    public String getmEmpAddress() {
        return mEmpAddress;
    }

}
