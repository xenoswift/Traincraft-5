package train.common.core.util;

import net.minecraft.block.BlockRailBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.oredict.OreDictionary;
import train.common.api.EntityRollingStock;
import train.common.api.Locomotive;


public class TraincraftUtil{

    public static Item getItemFromName(String name){
        if (Item.itemRegistry.containsKey(name)){
            return (Item) Item.itemRegistry.getObject(name);
        } else {
            return null;
        }
    }

    public static ItemStack getItemFromUnlocalizedName(String itemName, int meta){
        Item item = getItemFromName(itemName);
        if(item != null){
            return new ItemStack(item, 1, meta);
        }
        return null;
    }

    public static byte getByteFromColor(String c){
        if(c.equals("Black")){
            return 0;
        } else if (c.equals("Red")){
            return 1;
        } else if(c.equals("Green")){
            return 2;
        } else if(c.equals("Brown")){
            return 3;
        } else if(c.equals("Blue")){
            return 4;
        } else if(c.equals("Purple")){
            return 5;
        } else if(c.equals("Cyan")){
            return 6;
        } else if(c.equals("LightGrey")){
            return 7;
        } else if(c.equals("Grey")){
            return 8;
        } else if(c.equals("Magenta")){
            return 13;
        } else if(c.equals("Lime")){
            return 10;
        } else if(c.equals("Yellow")){
            return 11;
        } else if(c.equals("LightBlue")){
            return 12;
        } else if(c.equals("Pink")){
            return 9;
        } else if(c.equals("Orange")){
            return 14;
        } else if(c.equals("White")){
            return 15;
        } else if(c.equals("Full")){
            return 101;
        } else if (c.equals("Empty")){
            return 100;
        }
        return 0;
    }

    public static byte[] getBytesFromColors(String[] c){
        byte[] ret = new byte[c.length];
        for(int i=0; i<c.length;i++){
            ret[i]=getByteFromColor(c[i]);
        }
        return ret;
    }

    public static boolean itemStackMatches(ItemStack item1, ItemStack item2){
    	return (item1.getItem() == item2.getItem()) && 
    			(item1.getItemDamage() == item2.getItemDamage() 
    				|| item1.getItemDamage() == OreDictionary.WILDCARD_VALUE
    				|| item2.getItemDamage() == OreDictionary.WILDCARD_VALUE);
    }

    public static boolean isRailBlockAt(World world, int x, int y, int z){
        return world.getBlock(x,y,z) instanceof BlockRailBase;
    }

    public static final double degrees = (180d / Math.PI);
    public static final float radian = (float)(Math.PI / 180.0D);
    public static void updateRider(EntityRollingStock transport,double distance, double yOffset) {
        if(transport.riddenByEntity==null){return;}
        float pitchRads = transport.anglePitchClient * radian;
        double rotationCos1 = Math.cos(Math.toRadians(transport.renderYaw+((transport instanceof Locomotive)?90:180)));
        double rotationSin1 = Math.sin(Math.toRadians(transport.renderYaw+((transport instanceof Locomotive)?90:180)));
        if(transport.side.isServer()){
            rotationCos1 =  Math.cos(Math.toRadians(transport.serverRealRotation + 90));
            rotationSin1 = Math.sin(Math.toRadians((transport.serverRealRotation + 90)));
            transport.anglePitchClient = transport.serverRealPitch*60;
        }
        float pitch = (float) (transport.posY + (Math.tan(pitchRads) * distance) + transport.getMountedYOffset()
                + transport.riddenByEntity.getYOffset() + yOffset);

        double bogieX1 = (transport.posX + (rotationCos1 * distance));
        double bogieZ1 = (transport.posZ + (rotationSin1* distance));
        //System.out.println(rotationCos1+" "+rotationSin1);
        if(transport.anglePitchClient>20 && rotationCos1 == 1){
            bogieX1-=pitchRads*2;
            pitch-=pitchRads*1.2;
        }
        if(transport.anglePitchClient>20 && rotationSin1 == 1){
            bogieZ1-=pitchRads*2;
            pitch-=pitchRads*1.2;
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            transport.riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        } else {
            transport.riddenByEntity.setPosition(bogieX1, (transport.posY + transport.getMountedYOffset() + transport.riddenByEntity.getYOffset() + yOffset), bogieZ1);
        }
    }

}
