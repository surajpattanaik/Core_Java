public class Faculty extends Person {
 private static String institute;
 private int fno;
 private String dept;
 private double sal;
 static {
 institute = "Nareh i Technologies"; 
 }
 public Faculty(String name, double height, double weight, int fno, String dept, double sal) {
 super(name, height, weight);
 this.fno = fno;
 this.dept = dept;
 this.sal = sal;
 }
 public static String getInstitute() {
 return institute;
 }
 public static void setInstitute(String institute) {
 Faculty.institute = institute;
 }
 public int getFno() {
 return fno;
 }
 public void setFno(int fno) {
 this.fno = fno;
 }
 public String getDept() {
 return dept;
 }
 public void setDept(String dept) {
 this.dept = dept;
 }
 public double getSal() {
 return sal;
 }
 public void setSal(double sal) {
 this.sal = sal;
 }
 public static String displayStaticProperties() {
 return "\ninstitute\t: "+ institute;
 }
 @Override
 public String toString() {
 return super.toString() + displayStaticProperties() + "\nfno\t\t: " + fno + "\ndept\t\t: " + dept + "\nsal\t\t: " + sal;
 }
}