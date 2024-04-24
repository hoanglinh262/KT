package kT;

public class Teacher extends Person {
	 protected double hsl; // Hệ số lương

	    public Teacher(String name, int age, double hsl) {
	        super(name, age);
	        this.hsl = hsl;
	    }

	    // Getter và setter cho hsl
	    public double getHsl() {
	        return hsl;
	    }

	    public void setHsl(double hsl) {
	        this.hsl = hsl;
	    }

	    // Phương thức tính lương
	    public double tinhLuong() {
	        double luongCoBan = 1800000; // Lương cơ bản
	        return luongCoBan * hsl;
	    }
}
