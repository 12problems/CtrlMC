package escapemc.module;

import net.minecraft.client.Minecraft;
import net.minecraft.network.play.server.SPacketChat;

public class Module {
		
		protected Minecraft mc = Minecraft.getMinecraft();
		
		private String name;
		private int key;
		private boolean toggled;
		private Category category;
		
		public Module(String nm, int k, Category c){
			name = nm;
			key = k;
			category = c;
		}
		
		public void toggle(){

			if(toggled == true){
				
				onDisable();
				toggled = false;
				onUpdate();
				
			}else{
				
				onEnable();
				toggled = true;
				onUpdate();
			}
		}
		
		public void onEnable(){}
		public void onDisable(){}
		public void onUpdate(){}
		public void onRender(){}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public Category getCategory(){
			return category;
		}

		public int getKey() {
			return key;
		}

		public void setKey(int key) {
			this.key = key;
		}

		public boolean isToggled() {
			return toggled;
		}

		public void setToggled(boolean toggled) {
			this.toggled = toggled;
		}
		
		public boolean onSendChatMessage(String s){
			return true;
		}
		
		public boolean onRecieveChatMessage(SPacketChat packet){
			return true;
		}
		
		
		
}