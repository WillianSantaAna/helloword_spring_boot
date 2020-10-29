package pt.iade.HelloWordSpringBoot.models;

public class CurricularUnit {

   private String name;
   private double grade;
   private int semester;
   private double ects;
   
   public CurricularUnit(String name, double grade, int semester, double ects) {
      this.name = name;
      this.grade = grade;
      this.semester = semester;
      this.ects = ects;
   }

   public String getName() {
      return name;
   }

   public double getGrade() {
      return grade;
   }

   public int getSemester() {
      return semester;
   }

   public double getEcts() {
      return ects;
   }

   public boolean isAproved() {
      return grade > 9.5;
   }
}