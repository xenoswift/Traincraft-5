package train.client.render.models;

import net.minecraft.entity.Entity;
import train.client.render.CustomModelRenderer;
import train.client.tmt.ModelBase;
import train.common.api.Freight;

public class ModelFreightWood extends ModelBase {

	public ModelFreightWood() {

		bogey = new CustomModelRenderer(this, 2, 9, 256, 128);
		bogey.addBox(0F, 0F, 0F, 1, 6, 14);
		bogey.setPosition(-6F, 0F, -18F);

		bogey0 = new CustomModelRenderer(this, 2, 9, 256, 128);
		bogey0.addBox(0F, 0F, 0F, 1, 6, 14);
		bogey0.setPosition(5F, 0F, -18F);

		box = new CustomModelRenderer(this, 35, 9, 256, 128);
		box.addBox(0F, 0F, 0F, 1, 6, 14);
		box.setPosition(6F, 0F, -18F);

		box0 = new CustomModelRenderer(this, 35, 9, 256, 128);
		box0.addBox(0F, 0F, 0F, 1, 6, 14);
		box0.setPosition(-7F, 0F, -18F);

		box1 = new CustomModelRenderer(this, 35, 9, 256, 128);
		box1.addBox(0F, 0F, 0F, 1, 6, 14);
		box1.setPosition(-7F, 0F, 5F);

		box10 = new CustomModelRenderer(this, 100, 0, 256, 128);
		box10.addBox(0F, 0F, 0F, 6, 6, 32);
		box10.setPosition(0F, 9F, -16F);

		box11 = new CustomModelRenderer(this, 100, 38, 256, 128);
		box11.addBox(0F, 0F, 0F, 6, 6, 32);
		box11.setPosition(-6F, 9F, -14F);

		box12 = new CustomModelRenderer(this, 104, 76, 256, 128);
		box12.addBox(0F, 0F, 0F, 6, 6, 28);
		box12.setPosition(-3F, 15F, -13F);

		box2 = new CustomModelRenderer(this, 35, 9, 256, 128);
		box2.addBox(0F, 0F, 0F, 1, 6, 14);
		box2.setPosition(6F, 0F, 5F);

		box3 = new CustomModelRenderer(this, 1, 46, 256, 128);
		box3.addBox(0F, 0F, 0F, 1, 10, 2);
		box3.setPosition(-7F, 9F, 10F);

		box4 = new CustomModelRenderer(this, 1, 46, 256, 128);
		box4.addBox(0F, 0F, 0F, 1, 10, 2);
		box4.setPosition(-7F, 9F, 0F);

		box5 = new CustomModelRenderer(this, 1, 46, 256, 128);
		box5.addBox(0F, 0F, 0F, 1, 10, 2);
		box5.setPosition(-7F, 9F, -11F);

		box52 = new CustomModelRenderer(this, 65, 44, 256, 128);
		box52.addBox(0F, 0F, 0F, 14, 1, 1);
		box52.setPosition(-7F, 5F, -4F);

		box53 = new CustomModelRenderer(this, 65, 44, 256, 128);
		box53.addBox(0F, 0F, 0F, 14, 1, 1);
		box53.setPosition(-7F, 5F, -19F);

		box54 = new CustomModelRenderer(this, 31, 33, 256, 128);
		box54.addBox(0F, 0F, 0F, 4, 2, 4);
		box54.setPosition(-2F, 7F, 19F);

		box55 = new CustomModelRenderer(this, 2, 33, 256, 128);
		box55.addBox(0F, 0F, 0F, 4, 3, 4);
		box55.setPosition(-2F, 4F, -13F);

		box6 = new CustomModelRenderer(this, 1, 46, 256, 128);
		box6.addBox(0F, 0F, 0F, 1, 10, 2);
		box6.setPosition(6F, 9F, 0F);

		box68 = new CustomModelRenderer(this, 29, 40, 256, 128);
		box68.addBox(0F, 0F, 0F, 4, 2, 4);
		box68.setPosition(-2F, 7F, -22F);

		box7 = new CustomModelRenderer(this, 1, 46, 256, 128);
		box7.addBox(0F, 0F, 0F, 1, 10, 2);
		box7.setPosition(6F, 9F, 10F);

		box71 = new CustomModelRenderer(this, 66, 47, 256, 128);
		box71.addBox(0F, 0F, 0F, 12, 2, 2);
		box71.setPosition(-6F, 2F, -12F);

		box72 = new CustomModelRenderer(this, 64, 44, 256, 128);
		box72.addBox(0F, 0F, 0F, 14, 1, 1);
		box72.setPosition(-7F, 5F, 4F);

		box73 = new CustomModelRenderer(this, 65, 44, 256, 128);
		box73.addBox(0F, 0F, 0F, 14, 1, 1);
		box73.setPosition(-7F, 5F, 19F);

		box79 = new CustomModelRenderer(this, 4, 88, 256, 128);
		box79.addBox(0F, 0F, 0F, 16, 2, 37);
		box79.setPosition(-8F, 7F, -18F);

		box8 = new CustomModelRenderer(this, 2, 33, 256, 128);
		box8.addBox(0F, 0F, 0F, 4, 3, 4);
		box8.setPosition(-2F, 4F, 10F);

		box80 = new CustomModelRenderer(this, 2, 9, 256, 128);
		box80.addBox(0F, 0F, 0F, 1, 6, 14);
		box80.setPosition(-6F, 0F, 5F);

		box81 = new CustomModelRenderer(this, 2, 9, 256, 128);
		box81.addBox(0F, 0F, 0F, 1, 6, 14);
		box81.setPosition(5F, 0F, 5F);

		box82 = new CustomModelRenderer(this, 66, 47, 256, 128);
		box82.addBox(0F, 0F, 0F, 12, 2, 2);
		box82.setPosition(-6F, 2F, 11F);

		box9 = new CustomModelRenderer(this, 1, 46, 256, 128);
		box9.addBox(0F, 0F, 0F, 1, 10, 2);
		box9.setPosition(6F, 9F, -11F);

	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bogey.render(f5);
		bogey0.render(f5);
		box.render(f5);
		box0.render(f5);
		box1.render(f5);
		box2.render(f5);
		box3.render(f5);
		box4.render(f5);
		box5.render(f5);		
		box52.render(f5);
		box53.render(f5);
		box54.render(f5);
		box55.render(f5);
		box6.render(f5);
		box68.render(f5);
		box7.render(f5);
		box71.render(f5);
		box72.render(f5);
		box73.render(f5);
		box79.render(f5);
		box8.render(f5);
		box80.render(f5);
		box81.render(f5);
		box82.render(f5);
		box9.render(f5);
		
		int cargo = ((Freight) entity).getAmmountOfCargo();
		if (cargo != 0) {
    		if(cargo<=6) {
    			box10.render(f5);
			}
    		else if(cargo<=12 && cargo>6) {
    			box10.render(f5);
    			box11.render(f5);
    		}
    		else {
    			box10.render(f5);
    			box11.render(f5);
    			box12.render(f5);
    		}
		}

	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {}

	// variables init:
	public CustomModelRenderer bogey;
	public CustomModelRenderer bogey0;
	public CustomModelRenderer box;
	public CustomModelRenderer box0;
	public CustomModelRenderer box1;
	public CustomModelRenderer box10;
	public CustomModelRenderer box11;
	public CustomModelRenderer box12;
	public CustomModelRenderer box2;
	public CustomModelRenderer box3;
	public CustomModelRenderer box4;
	public CustomModelRenderer box5;
	public CustomModelRenderer box52;
	public CustomModelRenderer box53;
	public CustomModelRenderer box54;
	public CustomModelRenderer box55;
	public CustomModelRenderer box6;
	public CustomModelRenderer box68;
	public CustomModelRenderer box7;
	public CustomModelRenderer box71;
	public CustomModelRenderer box72;
	public CustomModelRenderer box73;
	public CustomModelRenderer box79;
	public CustomModelRenderer box8;
	public CustomModelRenderer box80;
	public CustomModelRenderer box81;
	public CustomModelRenderer box82;
	public CustomModelRenderer box9;

}
