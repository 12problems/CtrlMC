package escapemc.module.modules;

import org.lwjgl.input.Keyboard;

import escapemc.module.Category;
import escapemc.module.Module;

public class Step extends Module {

	public Step() {
	
		super("Step", Keyboard.KEY_G, Category.Movement);

	}

	@Override
	public void onEnable() {
			
		mc.thePlayer.stepHeight = 1.2F;
		this.setToggled(true);
		
	}
	
	@Override
	public void onDisable() {

		mc.thePlayer.stepHeight = 0F;
		this.setToggled(false);
		
	}
	
	
}
