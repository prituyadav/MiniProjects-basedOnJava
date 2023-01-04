package com.ram.controller;

public class studentImpl implements StudentDao{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentImpl sti=new studentImpl();
		
		sti.savedetails();
		sti.deletedetails();
		sti.update();
		
	//new StudentDao().deletedetails();;
		
	}

	@Override
	public void savedetails() {
		// TODO Auto-generated method stub
		System.out.println("added successfully////");
		
	}

	@Override
	public void deletedetails() {
		// TODO Auto-generated method stub
		System.out.println("deleted successfully;;;");
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("updated successfully\\\\");
		
	}

}
