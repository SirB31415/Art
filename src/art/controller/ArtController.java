package art.controller;

import art.view.*;
import javax.swing.JOptionPane;

public class ArtController
{
	
	private ArtFrame appFrame;
	
	public ArtController()
	{
		this.appFrame = new ArtFrame(this);
	}
	
	public void start()
	{
		JOptionPane.showMessageDialog(appFrame, "Welcome to art!");
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
	public ArtFrame getFrame()
	{
		return appFrame;
	}
	
}
