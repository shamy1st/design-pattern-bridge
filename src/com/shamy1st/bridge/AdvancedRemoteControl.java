package com.shamy1st.bridge;

public class AdvancedRemoteControl extends RemoteControl {

	public AdvancedRemoteControl(Device device) {
		super(device);
	}

	public void setChannel(int number) {
		super.device.setChannel(number);
	}
}
