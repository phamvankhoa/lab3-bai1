/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uneti;

import java.util.Scanner;

/**
 *
 * @author phamv
 */
public class StudentUneti implements Imark {
    private String StuId;
    private String StuName;
    private String gender;
    private String birthday;
    private String nativePlace;

    public StudentUneti(String StuId, String StuName, String gender, String birthday, String nativePlace) 
    {
        this.StuId = StuId;
        this.StuName = StuName;
        this.gender = gender;
        this.birthday = birthday;
        this.nativePlace = nativePlace;
    }
    public StudentUneti ()
    {
        StuId="a123";
        StuName="phan van a";
        gender="a";
        birthday="37/04/200";
        nativePlace="abc";
    }

    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getStuName() {
        return StuName;
    }

    public void setStuName(String StuName) {
        this.StuName = StuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }
    
    @Override
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ID hoc sinh: ");
        this.StuId = sc.nextLine();
        System.out.println("Nhap vao ten hoc sinh: ");
        this.StuName = sc.nextLine();
        System.out.println("Nhap vao gioi tinh: ");
        this.gender = sc.nextLine();
        System.out.println("Nhap vao sinh nhat: ");
        this.birthday = sc.nextLine();
        System.out.println("Nhap vao que quan: ");
        this.nativePlace = sc.nextLine();
    }
    
    @Override
    public void display()
    {
        System.out.println("Nhap vao ID hoc sinh: "+ this.getStuId());
        System.out.println("Nhap vao ten hoc sinh: "+ this.getStuName());
        System.out.println("Nhap vao gioi tinh: "+ this.getGender());
        System.out.println("Nhap vao sinh nhat: "+ this.getBirthday());
        System.out.println("Nhap vao que quan: "+ this.getNativePlace());
    }
}
