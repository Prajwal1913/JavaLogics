package Collections;
import java.util.Arrays;
class Employee implements Comparable{
	int id;
	double sal;
	Employee(int id, double sal)
	{
		this.id=id;
		this.sal=sal;
	}
	public String toString() {
		return id+" "+sal;
	}
	public int compareTo(Object obj) {
		Employee s= (Employee)obj;
		return this.id-s.id;
	}
}
public class Sortingcomparable {
	public static void main(String[] args) {
		Employee s1 = new Employee(10,25000.45);
		Employee s2 = new Employee(4,25000.23);
		Employee s3 = new Employee(7,25000.00);
		Employee arr[]={s1,s2,s3};
		Arrays.sort(arr);
		for(Employee b:arr){
			System.out.println(b);
		}
	}
}
