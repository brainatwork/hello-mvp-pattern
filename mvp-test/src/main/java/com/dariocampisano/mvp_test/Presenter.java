package com.dariocampisano.mvp_test;

public class Presenter implements IContract.UserActionsListener{

	private IContract.View view;
	
	public Presenter(IContract.View view){
		this.view = view;
	}
	
	public void showText() {
		view.setText();
	}

}
