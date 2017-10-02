package train.common.entity.rollingStock;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.LiquidTank;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class EntityTankLava extends LiquidTank {
	public int freightInventorySize;
	
	public static List<String>	lavaCartFluids	= new ArrayList<String>();

	public EntityTankLava(World world) {
		super(world, EnumTrains.tankCartLava.getTankCapacity());
		initFreightWater();
		initFluids();
	}

	public void initFreightWater() {
		freightInventorySize = 2;
		cargoItems = new ItemStack[freightInventorySize];
	}
	
	public void initFluids(){
		lavaCartFluids.add("lava");
		lavaCartFluids.add("silver.molten");
		lavaCartFluids.add("iron.molten");
		lavaCartFluids.add("cobalt.molten");
		lavaCartFluids.add("invar.molten");
		lavaCartFluids.add("manyullyn.molten");
		lavaCartFluids.add("mithril.molten");
		lavaCartFluids.add("tin.molten");
		lavaCartFluids.add("steel.molten");
		lavaCartFluids.add("platinum.molten");
		lavaCartFluids.add("pigiron.molten");
		lavaCartFluids.add("lead.molten");
		lavaCartFluids.add("alumite.molten");
		lavaCartFluids.add("nickel.molten");
		lavaCartFluids.add("bronze.molten");
		lavaCartFluids.add("glass.molten");
		lavaCartFluids.add("obsidian.molten");
		lavaCartFluids.add("lumium.molten");
		lavaCartFluids.add("aluminum.molten");
		lavaCartFluids.add("electrum.molten");
		lavaCartFluids.add("signalum.molten");
		lavaCartFluids.add("aluminumbrass.molten");
		lavaCartFluids.add("gold.molten");
		lavaCartFluids.add("copper.molten");
		lavaCartFluids.add("ardite.molten");
	}

	public EntityTankLava(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	@Override
	public void setDead() {
		super.setDead();
		isDead = true;
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		checkInvent(cargoItems[0]);
		if (worldObj.isRemote)
			return;
		if (getAmount() > 0)
			setColor(getColorFromString("Full"));
		if (getAmount() <= 0)
			setColor(getColorFromString("Empty"));
	}
	
	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);

		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < cargoItems.length; i++) {
			if (cargoItems[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				cargoItems[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
	}
	
	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);

		NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		cargoItems = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound1.getByte("Slot") & 0xff;
			if (j >= 0 && j < cargoItems.length) {
				cargoItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
	}
	
	@Override
	public String getInventoryName() {
		return "Lava Tank cart";
	}

	@Override
	public int getSizeInventory() {
		return freightInventorySize;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		if ((super.interactFirst(entityplayer))) {
			return false;
		}
		if (!this.worldObj.isRemote) {
			entityplayer.openGui(Traincraft.instance, GuiIDs.LIQUID, worldObj, this.getEntityId(), -1, (int) this.posZ);
		}
		return true;
	}

	@Override
	public boolean isStorageCart() {
		return true;
	}

	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 1.85F;
	}
}