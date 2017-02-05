package escapemc.Gui.Ingame;

import escapemc.main.Reference;
import escapemc.module.Category;
import escapemc.module.Module;
import escapemc.module.ModuleManager;
import net.minecraft.client.Minecraft;

public class CtrlMCOverlay {

	static Minecraft mc = Minecraft.getMinecraft();
		
	
	public static void drawOverlay() {
		
		mc.fontRendererObj.drawString("�3Ctrl�bMC �5"+Reference.VERSION, 0, 0, 0xffffffff);
		DrawModList();
		
	}
	
	private static void DrawModList() {
		
		int y = 120;
		for(Module m : ModuleManager.Modules) {
			
			if(m.isToggled()) {
				
				mc.fontRendererObj.drawString("�c"+m.getName(), 1, y, 0xffffffff);
				y += 9;
				
			}
			
		}
		
	}
	
	
	
}
