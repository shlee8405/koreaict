package day28.com.ict.edu;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Ex04_VO implements Externalizable {
	private String name;
	private int age;
	private String addr;
	private boolean gender;
	private double height;

	public Ex04_VO() {
		// TODO Auto-generated constructor stub
	}

	public Ex04_VO(String name, int age, String addr, boolean gender, double height) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.gender = gender;
		this.height = height;
	}

	// 직렬
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(addr);
		out.writeObject(gender);
		out.writeObject(height);
	}

	// 역직렬
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		name = (String) in.readObject();
		age = (int) in.readObject();
		addr = (String) in.readObject();
		gender = (boolean) in.readObject();
		height = (double) in.readObject();

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
