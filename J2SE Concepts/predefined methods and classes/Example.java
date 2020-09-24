public class  Example{
 private int x ;
 private int y ;
 public Example(int x, int y){
 this.x = x;
 this.y = y;
 }
 public void setX(int x){
 this.x = x;
 }
 public int getX(){
 return x;
 }
 public void setY(int y){
 this.y = y;
 }
 @Override
 public int hashCode(){
 System.out.print("In Ex cls hC(): ");
 return  x + y;
 }

 @Override
 public boolean equals(Object obj){
 if(obj instanceof Example){
 Example e = (Example)obj;
 return this.x == e.x;
 }
 return false;
 }

 public int JVMHC(){
 System.out.print("In Ex cls JVMhC(): ");
 return super.hashCode();
 }
 public int getY(){
 return y;
 }
 public void display(){
 System.out.println(x + "  " + y);
 }
}
