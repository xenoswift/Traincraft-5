package train.client.render.models.blocks;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.AdvancedModelLoader;
import net.minecraftforge.client.model.IModelCustom;
import org.lwjgl.opengl.GL11;
import train.common.library.Info;
import train.common.tile.TileTCRail;

@SideOnly(Side.CLIENT)
public class ModelLeftSwitchTCTrack extends ModelBase {
	private static IModelCustom modelMediumLeftSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_small_active_left_new.obj"));
	private static IModelCustom modelMediumLeftSwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_small_inactive_left_new.obj"));
	private static IModelCustom modelMediumLeftParallelSwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_parallel_inactive_left.obj"));
	private static IModelCustom modelMediumLeftParallelSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_parallel_active_left.obj"));
	private static IModelCustom modelLargeLeftSwitchActive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_medium_active_left.obj"));
	private static IModelCustom modelLargeLeftSwitchInactive = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_switch_medium_inactive_left.obj"));


	public ModelLeftSwitchTCTrack() {

	}

	public void renderMediumActive() {
		modelMediumLeftSwitchActive.renderAll();
	}
	public void renderMediumInactive() {
		modelMediumLeftSwitchInactive.renderAll();
	}
	public void renderMediumParallelInactive() {
		modelMediumLeftParallelSwitchInactive.renderAll();
	}
	public void renderMediumParallelActive() {
		modelMediumLeftParallelSwitchActive.renderAll();
	}
	public void renderLarge90Active() {
		modelLargeLeftSwitchActive.renderAll();
	}
	public void renderLarge90Inactive() {
		modelLargeLeftSwitchInactive.renderAll();
	}

	public void render(String type, TileTCRail tcRail, double x, double y, double z) {

		// Bind the texture, so that OpenGL properly textures our block.
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		GL11.glColor4f(1, 1, 1, 1);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);

		if (facing == 3) {
			if(type.equals("medium")){
				GL11.glTranslatef(-1.0f, 0.0f, 1.0f);
			}
			else if(type.equals("large_90")){
				GL11.glRotatef(0, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, -4.0f);
			}
			else if(type.equals("medium_parallel")){
				GL11.glRotatef(-90, 0, 1, 0);
			}
		}
		else if (facing == 1) {
			if(type.equals("medium")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 1.0f);
			}
			else if(type.equals("large_90")){
				GL11.glRotatef(180, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, -4.0f);
			}
			else if(type.equals("medium_parallel")){
				GL11.glRotatef(90, 0, 1, 0);
			}
		}
		else if(facing == 2){
			if(type.equals("medium")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 1.0f);
			}
			else if(type.equals("large_90")){
				GL11.glRotatef(90, 0, 1, 0);
				GL11.glTranslatef(0.0f, 0.0f, -4.0f);
			}
			//if(type.equals("medium_parallel")){
				//do something if needed
			//}
		}
		else if(facing == 0){
			if(type.equals("medium")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(-1.0f, 0.0f, 1.0f);
			}
			else if(type.equals("large_90")){
				GL11.glRotatef(-90, 0, 1, 0);
				GL11.glTranslatef(.0f, 0.0f, -4.0f);
			}
			else if(type.equals("medium_parallel")){
				GL11.glRotatef(180, 0, 1, 0);
			}
		}
		if(type.equals("medium")&&!tcRail.getSwitchState()){this.renderMediumInactive();}
		if(type.equals("medium")&&tcRail.getSwitchState()){this.renderMediumActive();}
		if(type.equals("medium_parallel")&&!tcRail.getSwitchState()){this.renderMediumParallelInactive();}
		if(type.equals("medium_parallel")&&tcRail.getSwitchState()){this.renderMediumParallelActive();}
		if(type.equals("large_90")&&!tcRail.getSwitchState()){this.renderLarge90Inactive();}
		if(type.equals("large_90")&&tcRail.getSwitchState()){this.renderLarge90Active();}
		
		//if(type.equals("large"))this.renderLarge();
	}
}