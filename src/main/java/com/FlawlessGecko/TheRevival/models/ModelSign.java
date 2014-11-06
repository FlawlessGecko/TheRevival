package com.FlawlessGecko.TheRevival.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelSign extends ModelBase {
public ModelRenderer Left_top;
public ModelRenderer Right_top;
public ModelRenderer Left_bottom;
public ModelRenderer Right_bottom;

public int textureWidth=64;
public int textureHeight=64;

//animation

protected int cycleIndex=0;
protected static float[][]undulationCycle=new float[][]{
	{45f,-45f,-45f,0f,45,45f,0f,-45f},
	{0f,45f,-45f,-45f,0f,45f,45f,0f}
};
protected float field_78145_g = 8.0F;
protected float field_78151_h = 4.0F;
// private static final String __OBFID = "CL_00000851";

public ModelSign(){
	Left_top=new ModelRenderer(this,0,0);
	Left_top.addBox(-16f,-16f,-16f,-16,16,16);
	Left_top.setTextureSize(textureWidth, textureHeight);
	
	Left_bottom=new ModelRenderer(this,0,0);
	Left_bottom.addBox(-16f,-16f,-16f,-16,16,16);
	Left_top.setTextureSize(textureWidth, textureHeight);
	
	Right_top=new ModelRenderer(this,0,0);
	Right_top.addBox(-16f,-16f,-16f,-16,16,16);
	Right_top.setTextureSize(textureWidth, textureHeight);
	
	Right_bottom=new ModelRenderer(this,0,0);
	Right_bottom.addBox(-16f,-16f,-16f,-16,16,16);
	Right_bottom.setTextureSize(textureWidth, textureHeight);
}


public void renderSign(Render parEntity, float parTime, float parSwingSuppress, float par4, float parHeadAngleY, float parHeadAngleX, float par7)
{
    setRotationAngles(parTime, parSwingSuppress, par4, parHeadAngleY, parHeadAngleX, par7, parEntity);

    if (this.isChild)
    {
        float childScaleFactor = 0.5F;
        GL11.glPushMatrix();
        GL11.glScalef(1.0F * childScaleFactor, 1.0F * childScaleFactor, 1.0F * childScaleFactor);
        GL11.glTranslatef(0.0F, 24.0F * par7, 0.0F);
        Right_top.render(par7);
        Right_bottom.render(par7); // all rest of body are children of body1
        GL11.glPopMatrix();
    }
    else
    {
        Left_bottom.render(par7);
        Left_top.render(par7); // all rest of body are children of body1
    }
}

/**
 * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
 * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
 * "far" arms and legs can swing at most.
 */
public void setRotationAngles(float parTime, float parSwingSuppress, float par3, float parHeadAngleY, float parHeadAngleX, float par6, Render parEntity)
{
    // swingSuppress goes to 0 when still so gates the movement
  



}
}
