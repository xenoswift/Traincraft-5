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
public class ModelMediumStraightTCTrack extends ModelBase {
	private static IModelCustom modelMediumStraight = AdvancedModelLoader.loadModel(new ResourceLocation(Info.modelPrefix + "track_normal.obj"));

	public ModelMediumStraightTCTrack() {
	}

	public void render() {
		modelMediumStraight.renderAll();
	}

	public void render(TileTCRail tcRail, double x, double y, double z) {

		// Bind the texture, so that OpenGL properly textures our block.
		FMLClientHandler.instance().getClient().renderEngine.bindTexture(new ResourceLocation(Info.resourceLocation, Info.modelTexPrefix + "track_normal.png"));
		GL11.glColor4f(1, 1, 1, 1);
		//GL11.glScalef(0.5f, 0.5f, 0.5f);
		int facing = tcRail.getWorldObj().getBlockMetadata(tcRail.xCoord, tcRail.yCoord, tcRail.zCoord);

		if (facing == 3) {
			GL11.glRotatef(-90, 0, 1, 0);
		}
		else if (facing == 1) {
			GL11.glRotatef(90, 0, 1, 0);
		}
		else if(facing == 0){
			GL11.glRotatef(180, 0, 1, 0);
		}

		for (int i = 0; i < 3; i++) {
			render();
			GL11.glTranslatef(0.0f, 0.0f, -1.0f);
		}
	}
}