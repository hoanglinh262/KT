package kT;

import java.util.Scanner;

public class MainApp {
	 public static void main(String[] args) {
	        Person[] persons = new Person[5];
	        input(persons);
	        print(persons);
	    }

	    // Hàm nhập thông tin cho danh sách students và teachers
	    public static void input(Person[] persons) {
	        Scanner scanner = new Scanner(System.in);
	        for (int i = 0; i < persons.length; i++) {
	            System.out.println(" Nhập thông tin Person " + (i + 1));
	            System.out.print("Name: ");
	            String name = scanner.nextLine();
	            System.out.print("Age: ");
	            int age = scanner.nextInt();
	            scanner.nextLine(); // Đọc bỏ dòng mới
	            
	            if (i < 3) { // Nếu là sinh viên
	                System.out.print("Toan: ");
	                double toan = scanner.nextDouble();
	                System.out.print("Ly: ");
	                double ly = scanner.nextDouble();
	                System.out.print("Hoa: ");
	                double hoa = scanner.nextDouble();
	                scanner.nextLine(); // Đọc bỏ dòng mới
	                persons[i] = new Student(name, age, toan, ly, hoa);
	            } else { // Nếu là giáo viên
	                System.out.print("HSL (He so luong): ");
	                double hsl = scanner.nextDouble();
	                scanner.nextLine(); // Đọc bỏ dòng mới
	                persons[i] = new Teacher(name, age, hsl);
	            }
	        }
	        scanner.close();
	    }

	    // Hàm in thông tin của danh sách persons
	    public static void print(Person[] persons) {
	        System.out.println("Information of all persons:");
	        for (Person person : persons) {
	            if (person instanceof Student) { // Nếu là sinh viên
	                Student student = (Student) person;
	                System.out.println("Student - Name: " + student.getName() + ", Age: " + student.getAge() +
	                        ", Toan: " + student.getToan() + ", Ly: " + student.getLy() + ", Hoa: " + student.getHoa() +
	                        ", Diem Trung Binh: " + student.diemTrungBinh());
	            } else if (person instanceof Teacher) { // Nếu là giáo viên
	                Teacher teacher = (Teacher) person;
	                System.out.println("Teacher - Name: " + teacher.getName() + ", Age: " + teacher.getAge() +
	                        ", HSL: " + teacher.getHsl() + ", Luong: " + teacher.tinhLuong());
	            }
	        }
	    }
}
