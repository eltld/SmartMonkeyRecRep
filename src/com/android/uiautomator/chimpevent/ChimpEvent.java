package com.android.uiautomator.chimpevent;

import java.io.Serializable;

import com.android.chimpchat.core.IChimpDevice;
import com.android.uiautomator.UiAutomatorModel;
import com.android.uiautomator.UiAutomatorViewer;

public abstract class ChimpEvent implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5306233327888072163L;
	long wait; // Amount of time to wait before invoking event
	private String type; // Type of the event (to display in the UI
	private String misc; // Other details specific to the event

	public boolean invoke(IChimpDevice chimp) {
		try {
			// chimp.wait(wait);
			System.out.println("waiting for " + wait + " ms");
			Thread.sleep(wait);
			return true;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean invokenow(IChimpDevice chimp)
	{
		return false;
	}

	public String getWait() {
		return "" + wait;
	}

	public String getType() {
		return type;
	}

	public String getMisc() {
		return misc;
	}

	protected void setType(String type) {
		this.type = type;
	}

	protected void setMisc(String misc) {
		this.misc = misc;
	}

}
