package com.shamy1st;

import com.shamy1st.bridge.AdvancedRemoteControl;
import com.shamy1st.bridge.RemoteControl;
import com.shamy1st.bridge.SamsungTv;
import com.shamy1st.bridge.SonyTv;

public class Main {

	public static void main(String[] args) {
		
		RemoteControl sonyRemoteControl = new RemoteControl(new SonyTv());
		sonyRemoteControl.turnOn();
		sonyRemoteControl.turnOff();
		
		AdvancedRemoteControl sonyAdvancedRemote = new AdvancedRemoteControl(new SonyTv());
		sonyAdvancedRemote.setChannel(1);
		
		
		RemoteControl samsungRemote = new RemoteControl(new SamsungTv());
		samsungRemote.turnOn();
		samsungRemote.turnOff();
		
		AdvancedRemoteControl samsungAdvancedRemote = new AdvancedRemoteControl(new SamsungTv());
		samsungAdvancedRemote.setChannel(1);
	}
}