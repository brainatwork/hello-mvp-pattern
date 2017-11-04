package com.dariocampisano.mvp_test;

public class Activity implements IContract.View{
	private IContract.UserActionsListener presenter;
	
	public Activity(){}
	
	public void onCreate(){
		presenter = new Presenter(this); // we should initialize the presenter into the onCreate method
		presenter.showText();
	}
	
	public void setText() {
		System.out.print("Hello World with MVP");
	}

}
