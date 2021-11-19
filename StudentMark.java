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
public class StudentMark implements Imark
{
    private String StuId;
    private String className;
    private String subjectName;
    private int semester;
    private float mark;

    public StudentMark(String StuId, String className, String subjectName, int semester, float mark) 
    {
        this.StuId = StuId;
        this.className = className;
        this.subjectName = subjectName;
        this.semester = semester;
        this.mark = mark;
    }
    public StudentMark ()
    {
        StuId="a123";
        className="phan van a";
        subjectName="a";
        semester=2;
        mark=3;
    }
    public String getStuId() {
        return StuId;
    }

    public void setStuId(String StuId) {
        this.StuId = StuId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }     
    @Override
    public void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ID hoc sinh: ");
        this.StuId = sc.nextLine();
        System.out.println("Nhap vao ten lop: ");
        this.className = sc.nextLine();
        System.out.println("Nhap vao ten chu de: ");
        this.subjectName = sc.nextLine();
        System.out.println("Nhap vao hoc ky: ");
        semester = sc.nextInt();
        System.out.println("Nhap vao dau: ");
        mark = sc.nextFloat();
    }
    
    @Override
    public void display()
    {
        System.out.println("Nhap vao ID hoc sinh: "+ this.getStuId());
        System.out.println("Nhap vao ten lop: "+ this.getClassName());
        System.out.println("Nhap vao ten chu de: "+ this.getSubjectName());
        System.out.println("Nhap vao hoc ky: "+ this.getSemester());
        System.out.println("Nhap vao dau: "+ this.getMark());
    }
}

