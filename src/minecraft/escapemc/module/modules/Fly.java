package escapemc.module.modules;

import org.lwjgl.input.Keyboard;

import escapemc.module.Category;
import escapemc.module.Module;

public class Fly extends Module{

	public Fly() {
		super("Fly", Keyboard.KEY_Y, Category.MOVEMENT);
	}

	@Override
	public void onEnable() {
			
		mc.thePlayer.capabilities.isFlying = true;

	}	
		
	@Override
	public void onDisable() {
			
		mc.thePlayer.capabilities.isFlying = false;
			
	}
		
}		
