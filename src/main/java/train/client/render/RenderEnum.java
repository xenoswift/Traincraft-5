package train.client.render;

import java.util.ArrayList;

import train.client.render.models.*;
import train.client.tmt.ModelBase;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.entity.rollingStock.*;

public enum RenderEnum {

	/** Passengers */
	passengerCartBlue(EntityPassengerBlue.class, new ModelPassenger6(), "passenger", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerCartBlackSmall(EntityPassenger2.class, new ModelPassenger2(), "passenger3", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerLongGreen(EntityPassenger5.class, new ModelPassenger5(), "passenger5_", true, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerShortGreen(EntityPassenger7.class, new ModelPassenger7(), "passenger7", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	passenger_1class_DB(EntityPassenger_1class_DB.class, new ModelPassenger_1class_DB(), "passenger_1class_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passenger_2class_DB(EntityPassenger_2class_DB.class, new ModelPassenger_2class_DB(), "passenger_2class_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerHighSpeedZeroED(EntityPassengerHighSpeedCarZeroED.class, new ModelPassengerHighSpeedCarZeroED(), "passengerHighSpeedCarZeroED", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerTramNY(EntityPassengerTramNY.class, new ModelTramNY(), "locoTramNY", false, new float[] { 0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerAdler(EntityPassengerAdler.class, new ModelPassengerAdler(), "passengerAdler", false, new float[] { 0F, 1.04F, 0.0F }, new float[] { 180F, -90F, 0F }, null, "", 0, null, "", null, 0, false),
	//passenger_DB_oriental(EntityPassengerDBOriental.class, new ModelPassenger_DB_oriental(), "passenger_DB_oriental", false, new float[] { 0F, -0.42F, 0.0F }, new float[] { 180F, 0F, 0F }, new float[] { -1F, -1F, 1F }, "", 0, null, "", null, 0,false),
	passengerCE1Class1(EntityPassengerICE_1class.class, new ModelICE1Passenger(), "ICE1_1st_class", false,
			new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[] { 0.8f, 1f, 0.8f }, "", 0, null,
			"", null, 0, false),
	passengerCE1Class2(EntityPassengerICE_2class.class, new ModelICE1Passenger(), "ICE1_2nd_class", false,
			new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[] { 0.8f, 1f, 0.8f }, "", 0, null,
			"", null, 0, false),
	passengerCE1Restaurant(EntityPassengerICE_Restaurant.class, new ModelICE1Restaurant(), "ICE1_Restaurant", false, new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerGS4(EntityPassengerGS4.class, new ModelGS4Passenger(), "GS4_passenger", false, new float[] { 0.0F, -0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerGS4_Tail(EntityPassengerGS4_Tail.class, new ModelGS4Tail(), "GS4_tail", false, new float[] { 0.0F, -0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerGS4_Observatory(EntityPassengerGS4_Observatory.class, new ModelGS4Observatory(), "GS4_observatory", false, new float[] { 0.0F, -0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),

	/** Caboose */
	cabooseRed(EntityCaboose3.class, new ModelCaboose3(), "caboose3", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	cabooseBlack(EntityCaboose.class, new ModelCaboose(), "caboose", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	cabooseLogging(EntityCabooseLogging.class, new ModelCabooseLogging(), "cabLogging", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	cabooseLoggingPRR(EntityCabooseLoggingPRR.class, new ModelPRRCaboose(), "PRRCaboose_", true, new float[] { 0.0F, -0.38F, 0.0F },new float[]{0,180,180}, null, "", 0, null, "", null, 0, false),

	/** Specials **/
	stockCar(EntityStockCar.class, new ModelStockCar(), "stockcar_", true, new float[] { -.0F, -0.32F, 0.0F }, new float[]{0,0,0}, null, "", 0, null, "", null, 0, false),
	drwgStockCar(EntityStockCarDRWG.class, new ModelDRWGStockCar(), "drwgstockcar", false, new float[] { 1.0F, -0.4F, 0.0F }, new float[]{0,0,180}, null, "", 0, null, "", null, 0, false),
	workCart(EntityWorkCart.class, new ModelWorkCart(), "workcart", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCart(EntityFlatCart.class, new ModelFlatCar(), "flatcart", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	workCaboose(EntityCabooseWorkCart.class, new ModelWorkCaboose(), "workcaboose", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	jukeBoxCart(EntityJukeBoxCart.class, new ModelJukeBox(), "jukebox", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartSU(EntityFlatCartSU.class, new ModelFlatCarSU(), "flatcarsu", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartUS(EntityFlatCartUS.class, new ModelFlatCarUS(), "flatCartUS", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tracksBuilder(EntityTracksBuilder.class, new ModelBuilder(), "builder2", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { -1.3D, 2.1D, 0.0D });
		}
	}, "", null, 0, true),

	/** Freight */
	freightCartRed(EntityFreightCart2.class, new ModelFreightCart2(), "freightcart2", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCartYellow(EntityFreightCart.class, new ModelFreightCart2(), "freightcart", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightWood(EntityFreightWood.class, new ModelWood(), "wood_Full", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightHopper(EntityFreightGrain.class, new ModelGrain(), "hopper", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightOpenWagon(EntityFreightOpenWagon.class, new ModelOpenWagon(), "openwagon", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//passenger4(EntityPassenger4.class, new ModelPassenger4(), "passenger4",false,new float[] {0.0F, -0.32F, 0.0F},null,null,"",0,null,"",null,0),//apparently has been removed
	freightHopperUS(EntityFreightHopperUS.class, new ModelFreightHopper(), "freightHopperUS_", true,
			new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartWoodUS(EntityFlatCartWoodUS.class, new ModelFlatCarWoodUS(), "flatCartWoodUS", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCartUS(EntityFreightCartUS.class, new ModelFreightCartUS(), "freightCartUS", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightBoxCartUS(EntityBoxCartUS.class, new ModelBoxCartUS(), "boxCartUS_", true, new float[] { 0.0F, -0.45F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightBoxCartPRR(EntityBoxCartPRR.class, new ModelPRRX31Wagon(), "PRR_X31a", false, new float[] { 0.0F, -0.38F, 0.0F }, new float[]{0,180,180}, null, "", 0, null, "", null, 0, false),
	freightTGNG(EntityFreightGTNG.class, new ModelGTNG(), "GTNGOreWagon", false, new float[] { 0.0F, 0.2F, 0.0F }, new float[]{0,0,180}, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightCartSmall(EntityFreightCartSmall.class, new ModelSmallFreightCart(), "freightCartSmall", false, new float[] { 0.0F, -0.20F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightMinetrain(EntityFreightMinetrain.class, new ModelMinetrain(), "minetrain", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartWoodLogs(EntityFreightWood2.class, new ModelFreightWood(), "flatCartWood2", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightClosedRedBrown(EntityFreightClosed.class, new ModelFreightClosed(), "freightClosed", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightOpenRedBrown(EntityFreightOpen2.class, new ModelFreightOpen2(), "freightOpen2", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	mailWagen_DB(EntityMailWagen_DB.class, new ModelMailWagen(), "mailWagen_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightWagen_DB(EntityFreightWagenDB.class, new ModelFreightWagenDB(), "freightWagen_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCarRails_DB(EntityFlatCarRails_DB.class, new ModelFlatCarRails_DB(), "flatCarRails_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCar_DB(EntityFlatCar_DB.class, new ModelFlatCar_DB(), "flatCar_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCarLogs_DB(EntityFlatCarLogs_DB.class, new ModelFlatCarLogs_DB(), "flatCarLogs_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightGondola_DB(EntityFreightGondola_DB.class, new ModelFreightGondola_DB(), "freightGondola_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Empty(EntityFreightCenterbeam_Empty.class, new ModelFreightCenterBeam_Empty(), "freight_centerbeam_empty", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Wood1(EntityFreightCenterbeam_Wood_1.class, new ModelFreightCenterBeam_Wood_1(), "freight_centerbeam_wood_1", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Wood2(EntityFreightCenterbeam_Wood_2.class, new ModelFreightCenterBeam_Wood_2(), "freight_centerbeam_wood_2", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightWellcar(EntityFreightWellcar.class, new ModelFreightWellcar(), "freightWellcar_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightTrailer(EntityFreightTrailer.class, new ModelFreightTrailer(), "freightTrailer_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightGS4(EntityFreightGS4_Baggage.class, new ModelGS4Baggage(), "GS4_baggage", false, new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	freightSlateWagon(EntityFreightSlateWagon.class, new ModelSlateWagon(), "freightslatewagon", false, new float[] { 0.0F, 0.2F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),

	/** Tanks **/
	tankWagon_DB(EntityTankWagon_DB.class, new ModelTankWagon_DB(), "tankWagon_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonUS(EntityTankWagonUS.class, new ModelTankWagonUS(), "tankWagonUS", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonGrey(EntityTankWagon2.class, new ModelTankWagon2(), "tankwagon2", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankCartLava(EntityTankLava.class, new ModelWatertransp(), "lavacar_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonYellow(EntityTankWagon.class, new ModelTankWagon(), "tankwagon", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),

	/** Tenders */
	tenderSmall(EntityTenderSmall.class, new ModelTender(), "tender2_", true, new float[] { 0.0F, -0.5F, 0.0F }, new float[] { 0F, 90F, 0F }, new float[] { 0.75F, 0.75F, 0.75F }, "", 0, null, "", null, 0, false),
	tenderHeavy(EntityTenderHeavy.class, new ModelTenderHeavy(), "tender_heavy", false, new float[] { 0.0F, 1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tender4_4_0(EntityTender4_4_0.class, new ModelNormalSteamTender(), "4-4-0-loco_tender_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderBR01(EntityTenderBR01_DB.class, new ModelTenderBR01_DB(), "tenderBR01_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tenderEr_Ussr(EntityTenderEr_Ussr.class, new ModelTenderEr_Ussr(), "tenderEr_Ussr", false, new float[] { 0.06F, -0.44F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderC62Class(EntityTenderC62Class.class, new ModelTenderC62Class(), "c62_class_tender_", true,
			new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tenderAdler(EntityTenderAdler.class, new ModelTenderAdler(), "tender_adler", false, new float[] { 0.0F, 1.05F, 0.0F }, new float[] { 180F, -90F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderGS4(EntityTenderGS4.class, new ModelGS4Tender(), "GS4_tender", false, new float[] { 0.0F, 0.18F, 0.0F },
			new float[] { 0F, 0F, 180F }, new float[] { 0.9f, 1f, 0.9f }, "", 0, null, "", null, 0, false),

	/** Diesel */
	locoKOF(EntityLocoDieselKof_DB.class, new ModelKof(), "locoKof_DB_", true, new float[] { -1.0F, -0.44F, 0.0F }, null, null, "largesmoke", 2, new ArrayList<double[]>() {
		{
			add(new double[] { 0.9D, 1.1D, 0.0D });
		}
	}, "", null, 0, true),
	locoGP40(EntityLocoDieselCD742.class, new ModelGP40(), "cd742_", true, new float[] { -0.8F, 0.75F, 0.0F }, new float[] { 180F, 180F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.2D, 1.23D, 0.0D });
		}
	}, "", null, 0, false),
	locoChME3(EntityLocoDieselChME3.class, new ModelChME3(), "chme3", false, new float[] { -0.5F, -0.47F, 0.0F }, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.7D, 0.0D });
		}
	}, "", null, 0, false),
	locoGP7Red(EntityLocoDieselGP7Red.class, new ModelGP7(), "gp7_", true, new float[] { -0.8F, -0.47F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0D, 1.6D, 0.0D });
			add(new double[] { 0.5D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),
	locoSD40(EntityLocoDieselSD40.class, new ModelSD40(), "locoSD40_", true, new float[] { -1.2F, -0.47F, 0.0F }, new float[] { 180F, 90F, 0F }, new float[] { -1F, -1F, 1F }, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { -0.1D, 1.4D, 0.0D });
			add(new double[] { 0.6D, 1.4D, 0.0D });
		}
	}, "", null, 0, false),
	locoSD70(EntityLocoDieselSD70.class, new ModelSD70(), "locoSD70_", true, new float[] { -1.2F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { -0.5D, 1.4D, 0.0D });
			add(new double[] { -0.5D, 1.4D, 0.0D });
		}
	}, "", null, 0, false),
	locoShunter(EntityLocoDieselShunter.class, new ModelShunter(), "shunter_", true, new float[] { -1.2F, -0.42F, 0.0F }, null, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 2.6D, 1.84D, 0.0D });
		}
	}, "", null, 0, true),
	locoV60_DB(EntityLocoDieselV60_DB.class, new ModelV60(), "locoV60_DB_", true, new float[] { -0.5F, -0.44F, 0.0F }, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.7D, 1.64D, 0.0D });
		}
	}, "", null, 0, false),
	locoMILW_H1044(EntityLocoDieselMILW_H1044.class, new ModelMILW_H1044(), "MILW_H1044", false, new float[]{0,-0.14f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 4D, 1.64D, 0D });
		}
	}, "", null, 0, false),
	locoEMDF7(EntityLocoDieselEMDF7.class, new ModelEMDF7(), "emdf7_", true, new float[]{0,0.12f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
					add(new double[] { 0.3D, 1.55D, 0.0D });
					add(new double[] { 1.0D, 1.55D, 0.0D });
		}
	}, "", null, 0, false),
	locoEMDF3(EntityLocoDieselEMDF3.class, new ModelEMDF3(), "emdf3", false, new float[]{0,0.12f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
					add(new double[] { 0.2D, 1.55D, 0.0D });
					add(new double[] { 0.85D, 1.55D, 0.0D });
		}
	}, "", null, 0, false),
	locoEMDF7b(EntityBUnitEMDF7.class, new ModelEMDF7B(), "emdf7b_", true, new float[]{0,0.12f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 4, null, "", null, 0, false),
	locoEMDF3b(EntityBUnitEMDF3.class, new ModelEMDF3B(), "emdf3b", false, new float[]{0,0.12f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 4, null, "", null, 0, false),

	/** Electric */
	locoVL10(EntityLocoElectricVL10.class, new ModelVL10(), "vl10", false, new float[] { -1.2F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoBR_E69(EntityLocoElectricBR_E69.class, new ModelBR_E69(), "locoBR_E69_", true, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoMineTrain(EntityLocoElectricMinetrain.class, new ModelLocoMinetrain(), "locoMinetrain", false, new float[] { -0.8F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoSpeedZeroED(EntityLocoElectricHighSpeedZeroED.class, new ModelLocoHighSpeedZeroED(), "locoHighSpeedZeroED", false, new float[] { -1.7F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoICE1(EntityLocoElectricICE1.class, new ModelICE1(), "ICE1_Engine", false, new float[] { 0.0F, 0.18F, 0.1F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	//locoSpeedGrey(EntityNewHighSpeedLoco.class, new ModelNewHighSpeedLoco(), "newhighspeedloco", false, new float[] { -0.05F, -0.5F, 0.0F }, new float[] { 0F, 90F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "", 0, null, "", null, 0),
	locoTramYellow(EntityLocoElectricTramWood.class, new ModelTram(), "tram", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoTramNY(EntityLocoElectricTramNY.class, new ModelTramNY(), "locoTramNY", false, new float[] { -1.5F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),

	passengerC4FG(PassengerIC4_DSB_FG.class, new ModelLocoDieselIC4_DSB_FG(), "IC4_DSB_FG", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerC4FH(PassengerIC4_DSB_FH.class, new ModelLocoDieselIC4_DSB_FH(), "IC4_DSB_FH", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoIC4MG(EntityLocoDieselIC4_DSB_MG.class, new ModelLocoDieselIC4_DSB_MG(), "IC4_DSB_MG_", true, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	/** Steam */
	locoCherepanov(EntityLocoSteamCherepanov.class, new ModelLocoCherepanov(), "locoCherepanov", false, new float[] { -0.875F, -0.47F, 0.0F }, new float[] { 0, 180, 0 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.4D, 2.2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.875D, 0.2D, 0.2D });
		}
	}, 2, true),
	locoBR80(EntityLocoSteamBR80_DB.class, new ModelLocoBR80_DB(), "locoBR80_DB_", true, new float[] { -0.75F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.75D, 1.85D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 4, true),
	loco4_4_0(EntityLocoSteam4_4_0.class, new ModelLoco(), "4-4-0-loco_", true, new float[] { -0.66F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.56D, 2.35D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.56D, -0.2D, 0.8D });
		}
	}, 4, true),
	locoSteamSmall(EntityLocoSteamSmall.class, new ModelLoco3(), "loco3_", true, new float[] { -0.99F, -0.7F, 0.0F }, new float[] { 0F, -90F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.69D, 1.25D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoHeavySteam(EntityLocoSteamHeavy.class, new ModelHeavySteamLoco(), "heavysteam", false, new float[] { 0F, -0.42F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.1D, 2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamC62Class(EntityLocoSteamC62Class.class, new ModelLocoC62Class(), "c62_class_", true,
			new float[] { 0F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 5.1D, 2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 5.2D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, new ModelLocoBR01_DB(), "locoBR01_DB", false, new float[] { -1.0F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.5D, 2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamGS4(EntityLocoSteamGS4.class, new ModelGS4Loco(), "GS4_engine", false, new float[] { 0.0F, 0.08F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.95f,0.95f,0.95f}, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 5.4D, 1.8D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, new ModelLocoEr_Ussr(), "locoEr_Ussr", false, new float[] { -0.75F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.5D, 2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamForney(EntityLocoSteamForneyRed.class, new ModelLocoForney(), "locoForney", true, new float[] { -0.6F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.4D, 2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.4D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, new ModelLocoMogul(), "locoMogul", true, new float[] { -0.6F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.5D, 2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.45D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamShay(EntityLocoSteamShay.class, new ModelLocoSteamShay(), "locoShay", false, new float[] { -0.75F, -0.42F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.87D, 1.78D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamVBShay(EntityLocoSteamVBShay.class, new ModelVBShay(), "vbshay", false, new float[] { 0F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.5D, 2.1D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamClimax(EntityLocoSteamClimax.class, new ModelLocoClimax(), "loco_climax", false, new float[] { 0F, 0.18F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.05D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamAdler(EntityLocoSteamAdler.class, new ModelLocoSteamAdler(), "locoAdler", false, new float[] { -0.8F, 1.05F, 0F }, new float[] { 180F, -90F, 0F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.80D, 1.2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamAlice(EntityLocoSteamAlice0_4_0.class, new ModelLocoAlice040(), "0-4-0-loco-alice", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.2D, 1.5D, -0.1D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteam040VB(EntityLocoSteam040VB.class, new ModelVB040(), "loco040VB", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.65D, 1.7D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamGLYN(EntityLocoSteamGLYN042T.class, new Model042TGLYN(), "0-4-2-loco-glyn", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.15D, 1.6D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteam626T(EntityLocoSteam262T.class, new ModelT262(), "262t", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.65D, 1.6D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamA4Mallard(EntityLocoSteamMallardA4.class, new ModelA4Locomotive(), "locoA4_UK_", true, new float[] { -0.8F, 1.05F, 0F }, new float[] { 180F, -90F, 0F }, null, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.3D, 1.1D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamA4Tender(EntityTenderA4.class, new ModelTenderA4(), "locoA4_UK_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false);

	private Class<? extends AbstractTrains> entityClass;
	private ModelBase model;
	private String texture;
	private boolean multiTexture;
	private float[] trans;
	private float[] rotate;
	private float[] scale;
	private String smokeType;
	private ArrayList<double[]> smokeFX;
	private String explosionType;
	private ArrayList<double[]> explosionFX;
	private int smokeIterations;
	private int explosionFXIterations;
	private boolean hasSmokeOnSlopes;

	/**
	 * Defines the render @param for a RollingStock
	 *
	 * @param model ModelBase
	 * @param texture String
	 * @param multiTexture boolean
	 * @param trans float[]
	 * @param rotate float[]
	 * @param scale float[]
	 * @param smokeType String
	 * @param smokeFX ArrayList
	 * @param explosionType String
	 * @param explosionFX ArrayList
	 * @see RenderRollingStock
	 */
	RenderEnum(Class<? extends EntityRollingStock> entityClass, ModelBase model, String texture, boolean multiTexture, float[] trans, float[] rotate, float[] scale, String smokeType, int smokeIterations, ArrayList<double[]> smokeFX, String explosionType, ArrayList<double[]> explosionFX, int explosionFXIterations, boolean hasSmokeOnSlopes) {
		this.entityClass = entityClass;
		this.model = model;
		this.texture = texture;
		this.multiTexture = multiTexture;
		this.trans = trans;
		this.rotate = rotate;
		this.scale = scale;
		this.smokeType = smokeType;
		this.smokeFX = smokeFX;
		this.explosionType = explosionType;
		this.explosionFX = explosionFX;
		this.smokeIterations = smokeIterations;
		this.explosionFXIterations = explosionFXIterations;
		this.hasSmokeOnSlopes = hasSmokeOnSlopes;
	}

	public Class<? extends AbstractTrains> getEntityClass() {
		return entityClass;
	}

	public ModelBase getModel() {
		return model;
	}

	public boolean getIsMultiTextured() {
		return multiTexture;
	}

	public boolean hasSmoke() {
		return smokeType.length() > 0;
	}

	public boolean hasSmokeOnSlopes() {
		return hasSmokeOnSlopes;
	}

	public String getSmokeType() {
		return smokeType;
	}

	public ArrayList<double[]> getSmokeFX() {
		return smokeFX;
	}

	public String getExplosionType() {
		return explosionType;
	}

	public boolean hasExplosion() {
		return explosionType.length() > 0;
	}

	public ArrayList<double[]> getExplosionFX() {
		return explosionFX;
	}

	public float[] getTrans() {
		return trans;
	}

	public float[] getRotate() {
		return rotate;
	}

	public float[] getScale() {
		return scale;
	}

	public String getTexture() {
		return texture;
	}

	public int getSmokeIterations() {
		return smokeIterations;
	}

	public int getExplosionFXIterations() {
		return explosionFXIterations;
	}
}
