package escapemc.module.modules;

import org.lwjgl.input.Keyboard;

import escapemc.module.Category;
import escapemc.module.Module;

public class Spider extends Module {

	public Spider() {
	
		super("Spider", 0, Category.Movement);

	}

	@Override
	public void Tick()
	{
		if(mc.thePlayer.isCollidedHorizontally)
			mc.thePlayer.motionY = 0.2;
	}

	
}
