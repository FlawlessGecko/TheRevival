package com.FlawlessGecko.TheRevival.client;

import com.FlawlessGecko.TheRevival.handler.ConfigurationHandler;
import com.FlawlessGecko.TheRevival.reference.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.client.config.GuiConfig;

		//Allows us to acces where we store all the config info for gui
		//If we need to restrt world or restartMinecraft
		public class ModGuiConfig extends GuiConfig
		{
		    public ModGuiConfig(GuiScreen guiScreen)
		    {
		        super(guiScreen,
		                new ConfigElement(ConfigurationHandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
		                Reference.MOD_ID,
		                false,
		                false,
		                GuiConfig.getAbridgedConfigPath(ConfigurationHandler.configuration.toString()));
		    }
		}