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
public class ModelSmallStraightTCTrack extends ModelBase {
	
	private static IModelCustom modelSmallStraight = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_normal.obj"));
	private static IModelCustom modelRoadCrossing = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_roadcrossing.obj"));

	public ModelSmallStraightTCTrack() {
	}

	public void render(String type) {
		if (type.equals("straight")) {
			modelSmallStraight.renderAll();
		}
		else if (type.equals("crossing")) {
			modelRoadCrossing.renderAll();
		}
		else if (type.equals("crossing1")) {
			modelRoadCrossing.renderAll();
		}
		else if (type.equals("crossing2")) {
			modelRoadCrossing.renderAll();
		}
	}
	
	public void render(String type, TileTCRail tcRail, double x, double y, double z) {

		// Move the object into the correct position on the block (because the OBJ's origin is the center of the object)
		GL11.glColor4f(1, 1, 1, 1);

		// Bind the texture, so that OpenGL properly textures our block.
		if (type.equals("straight")) {
 			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		}
		else if (type.equals("crossing")) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing.png"));
		}		
		else if (type.equals("crossing1")) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_1.png"));
		}		
		else if (type.equals("crossing2")) {
			FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_roadcrossing_2.png"));
		}		
		//GL11.glColor3f(1, 1, 1);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);

		if (facing == 3) {
			GL11.glRotatef(90, 0, 1, 0);
		}
		else if (facing == 1) {
			GL11.glRotatef(90, 0, 1, 0);
		}

		render(type);
	}

}
