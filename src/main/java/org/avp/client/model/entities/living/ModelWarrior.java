package org.avp.client.model.entities.living;

import com.arisux.mdx.lib.client.util.OpenGL;
import com.arisux.mdx.lib.client.util.models.Model;

import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.MathHelper;


public class ModelWarrior extends Model
{
    public ModelRenderer chest, abdomen, rThigh, lThigh, lShin1, rShin1, lShin2, rShin2, lFoot, rFoot, lArm1, rArm1, lClaw1, rArm2, neck, headSpine1, rHead, jaw, jaw2, headSpine2, lArm2, rClaw1, lClaw2, rClaw2, back1, back2, tail1, tail2, stabber, tail3, tail4, lHead, tailSpikes5, tailSpikes4, tailSpikes3, tailSpikes2, tail5, tailSpikes1, part1, part2, part3, part4, headBase, headTop;

    public ModelWarrior()
    {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.chest = new ModelRenderer(this, 0, 46);
        this.chest.addBox(-4.5F, -2.0F, 0.0F, 9, 8, 10);
        this.chest.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.chest.setTextureSize(256, 128);
        this.chest.mirror = true;
        this.setRotation(this.chest, -0.1919862F, 0.0F, 0.0F);
        this.abdomen = new ModelRenderer(this, 0, 27);
        this.abdomen.addBox(-3.5F, -5.0F, 8.0F, 7, 6, 12);
        this.abdomen.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.abdomen.setTextureSize(256, 128);
        this.abdomen.mirror = true;
        this.setRotation(this.abdomen, -0.5585054F, 0.0F, 0.0F);
        this.rThigh = new ModelRenderer(this, 59, 45);
        this.rThigh.addBox(-1.5F, -4.0F, -2.5F, 4, 14, 5);
        this.rThigh.setRotationPoint(-4.5F, 2.0F, 16.0F);
        this.rThigh.setTextureSize(256, 128);
        this.rThigh.mirror = true;
        this.setRotation(this.rThigh, -0.8028515F, 0.2443461F, 0.418879F);
        this.lThigh = new ModelRenderer(this, 40, 45);
        this.lThigh.addBox(-2.5F, -4.0F, -2.5F, 4, 14, 5);
        this.lThigh.setRotationPoint(4.5F, 2.0F, 16.0F);
        this.lThigh.setTextureSize(256, 128);
        this.lThigh.mirror = true;
        this.setRotation(this.lThigh, -0.8028515F, -0.2443461F, -0.418879F);
        this.lShin1 = new ModelRenderer(this, 79, 49);
        this.lShin1.addBox(-2.0F, 8.0F, -5.5F, 3, 3, 12);
        this.lShin1.setRotationPoint(4.5F, 2.0F, 16.0F);
        this.lShin1.setTextureSize(256, 128);
        this.lShin1.mirror = true;
        this.setRotation(this.lShin1, -0.4014257F, -0.2443461F, -0.418879F);
        this.rShin1 = new ModelRenderer(this, 79, 33);
        this.rShin1.addBox(-1.0F, 8.0F, -5.5F, 3, 3, 12);
        this.rShin1.setRotationPoint(-4.5F, 2.0F, 16.0F);
        this.rShin1.setTextureSize(256, 128);
        this.rShin1.mirror = true;
        this.setRotation(this.rShin1, -0.4014257F, 0.2443461F, 0.418879F);
        this.lShin2 = new ModelRenderer(this, 113, 40);
        this.lShin2.addBox(-1.5F, 5.5F, 9.0F, 2, 9, 2);
        this.lShin2.setRotationPoint(4.5F, 2.0F, 16.0F);
        this.lShin2.setTextureSize(256, 128);
        this.lShin2.mirror = true;
        this.setRotation(this.lShin2, -0.8028515F, -0.2443461F, -0.418879F);
        this.rShin2 = new ModelRenderer(this, 113, 53);
        this.rShin2.addBox(-0.5F, 5.5F, 9.0F, 2, 9, 2);
        this.rShin2.setRotationPoint(-4.5F, 2.0F, 16.0F);
        this.rShin2.setTextureSize(256, 128);
        this.rShin2.mirror = true;
        this.setRotation(this.rShin2, -0.8028515F, 0.2443461F, 0.418879F);
        this.lFoot = new ModelRenderer(this, 110, 24);
        this.lFoot.addBox(5.0F, 15.0F, -8.0F, 2, 2, 5);
        this.lFoot.setRotationPoint(4.5F, 2.0F, 17.0F);
        this.lFoot.setTextureSize(256, 128);
        this.lFoot.mirror = true;
        this.setRotation(this.lFoot, 0.0F, -0.2443461F, 0.0F);
        this.rFoot = new ModelRenderer(this, 95, 24);
        this.rFoot.addBox(-7.0F, 15.0F, -8.0F, 2, 2, 5);
        this.rFoot.setRotationPoint(-4.5F, 2.0F, 17.0F);
        this.rFoot.setTextureSize(256, 128);
        this.rFoot.mirror = true;
        this.setRotation(this.rFoot, 0.0F, 0.2443461F, 0.0F);
        this.lArm1 = new ModelRenderer(this, 40, 29);
        this.lArm1.addBox(-1.0F, -1.0F, -1.0F, 2, 13, 2);
        this.lArm1.setRotationPoint(4.5F, -5.0F, 3.0F);
        this.lArm1.setTextureSize(256, 128);
        this.lArm1.mirror = true;
        this.setRotation(this.lArm1, 0.3665191F, 0.0F, -0.5934119F);
        this.rArm1 = new ModelRenderer(this, 50, 29);
        this.rArm1.addBox(-1.0F, -1.0F, -1.0F, 2, 13, 2);
        this.rArm1.setRotationPoint(-4.5F, -5.0F, 3.0F);
        this.rArm1.setTextureSize(256, 128);
        this.rArm1.mirror = true;
        this.setRotation(this.rArm1, 0.3665191F, 0.0F, 0.5934119F);
        this.lClaw1 = new ModelRenderer(this, 83, 24);
        this.lClaw1.addBox(-1.0F, 11.0F, -13.5F, 2, 1, 3);
        this.lClaw1.setRotationPoint(4.5F, -5.0F, 3.0F);
        this.lClaw1.setTextureSize(256, 128);
        this.lClaw1.mirror = true;
        this.setRotation(this.lClaw1, 0.3665191F, 0.0F, -0.5934119F);
        this.rArm2 = new ModelRenderer(this, 98, 9);
        this.rArm2.addBox(-1.0F, 10.5F, -10.5F, 2, 2, 11);
        this.rArm2.setRotationPoint(-4.5F, -5.0F, 3.0F);
        this.rArm2.setTextureSize(256, 128);
        this.rArm2.mirror = true;
        this.setRotation(this.rArm2, 0.3665191F, 0.0F, 0.5934119F);
        this.neck = new ModelRenderer(this, 23, 86);
        this.neck.addBox(-2.0F, -2.0F, -4.0F, 4, 6, 5);
        this.neck.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.neck.setTextureSize(256, 128);
        this.neck.mirror = true;
        this.setRotation(this.neck, -0.1919862F, 0.0F, 0.0F);
        this.headSpine1 = new ModelRenderer(this, 0, 100);
        this.headSpine1.addBox(0.0F, -5.0F, -6.0F, 0, 10, 3);
        this.headSpine1.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.headSpine1.setTextureSize(256, 128);
        this.headSpine1.mirror = true;
        this.setRotation(this.headSpine1, -((float) Math.PI / 5F), 0.0F, 0.0F);
        this.rHead = new ModelRenderer(this, 34, 0);
        this.rHead.addBox(-2.51F, 3.0F, -5.0F, 3, 3, 5);
        this.rHead.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.rHead.setTextureSize(256, 128);
        this.rHead.mirror = true;
        this.setRotation(this.rHead, -0.122173F, 0.0F, 0.0F);
        this.jaw = new ModelRenderer(this, 51, 10);
        this.jaw.addBox(-2.5F, 2.8F, -5.0F, 5, 3, 4);
        this.jaw.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.jaw.setTextureSize(256, 128);
        this.jaw.mirror = true;
        this.setRotation(this.jaw, 0.122173F, 0.0F, 0.0F);
        this.jaw2 = new ModelRenderer(this, 52, 20);
        this.jaw2.addBox(-1.5F, 4.1F, -6.1F, 3, 2, 5);
        this.jaw2.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.jaw2.setTextureSize(256, 128);
        this.jaw2.mirror = true;
        this.setRotation(this.jaw2, 0.122173F, 0.0F, 0.0F);
        this.headSpine2 = new ModelRenderer(this, 7, 100);
        this.headSpine2.addBox(0.0F, -14.0F, -7.2F, 0, 10, 3);
        this.headSpine2.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.headSpine2.setTextureSize(256, 128);
        this.headSpine2.mirror = true;
        this.setRotation(this.headSpine2, -0.9075712F, 0.0F, 0.0F);
        this.lArm2 = new ModelRenderer(this, 71, 9);
        this.lArm2.addBox(-1.0F, 10.5F, -10.5F, 2, 2, 11);
        this.lArm2.setRotationPoint(4.5F, -5.0F, 3.0F);
        this.lArm2.setTextureSize(256, 128);
        this.lArm2.mirror = true;
        this.setRotation(this.lArm2, 0.3665191F, 0.0F, -0.5934119F);
        this.rClaw1 = new ModelRenderer(this, 72, 24);
        this.rClaw1.addBox(-1.0F, 11.0F, -13.5F, 2, 1, 3);
        this.rClaw1.setRotationPoint(-4.5F, -5.0F, 3.0F);
        this.rClaw1.setTextureSize(256, 128);
        this.rClaw1.mirror = true;
        this.setRotation(this.rClaw1, 0.3665191F, 0.0F, 0.5934119F);
        this.lClaw2 = new ModelRenderer(this, 60, 30);
        this.lClaw2.addBox(-2.0F, 11.5F, -16.5F, 3, 0, 6);
        this.lClaw2.setRotationPoint(4.5F, -5.0F, 3.0F);
        this.lClaw2.setTextureSize(256, 128);
        this.lClaw2.mirror = true;
        this.setRotation(this.lClaw2, 0.3665191F, 0.0F, -0.5934119F);
        this.rClaw2 = new ModelRenderer(this, 60, 38);
        this.rClaw2.addBox(-1.0F, 11.5F, -16.5F, 3, 0, 6);
        this.rClaw2.setRotationPoint(-4.5F, -5.0F, 3.0F);
        this.rClaw2.setTextureSize(256, 128);
        this.rClaw2.mirror = true;
        this.setRotation(this.rClaw2, 0.3665191F, 0.0F, 0.5934119F);
        this.lHead = new ModelRenderer(this, 53, 0);
        this.lHead.addBox(-0.499F, 3.0F, -5.0F, 3, 3, 5);
        this.lHead.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.lHead.setTextureSize(256, 128);
        this.lHead.mirror = true;
        this.setRotation(this.lHead, -0.122173F, 0.0F, 0.0F);
        this.part1 = new ModelRenderer(this, 10, 86);
        this.part1.addBox(-4.5F, -11.0F, 7.0F, 2, 9, 2);
        this.part1.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.part1.setTextureSize(256, 128);
        this.part1.mirror = true;
        this.setRotation(this.part1, -0.1919862F, 0.0F, -0.1745329F);
        this.part2 = new ModelRenderer(this, 0, 86);
        this.part2.addBox(2.5F, -11.0F, 7.0F, 2, 9, 2);
        this.part2.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.part2.setTextureSize(256, 128);
        this.part2.mirror = true;
        this.setRotation(this.part2, -0.1919862F, 0.0F, 0.1745329F);
        this.part3 = new ModelRenderer(this, 9, 86);
        this.part3.addBox(-3.5F, -14.0F, 10.0F, 2, 9, 2);
        this.part3.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.part3.setTextureSize(256, 128);
        this.part3.mirror = true;
        this.setRotation(this.part3, -0.5585054F, 0.0F, -0.1745329F);
        this.part4 = new ModelRenderer(this, 0, 86);
        this.part4.addBox(1.5F, -14.0F, 10.0F, 2, 9, 2);
        this.part4.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.part4.setTextureSize(256, 128);
        this.part4.mirror = true;
        this.setRotation(this.part4, -0.5585054F, 0.0F, 0.1745329F);
        this.headBase = new ModelRenderer(this, 0, 0);
        this.headBase.addBox(-2.5F, -5.0F, -3.0F, 5, 10, 5);
        this.headBase.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.headBase.setTextureSize(256, 128);
        this.headBase.mirror = true;
        this.setRotation(this.headBase, -((float) Math.PI / 5F), 0.0F, 0.0F);
        this.headTop = new ModelRenderer(this, 28, 10);
        this.headTop.addBox(-2.5F, -14.0F, -4.2F, 5, 10, 5);
        this.headTop.setRotationPoint(0.0F, -7.5F, -4.0F);
        this.headTop.setTextureSize(256, 128);
        this.headTop.mirror = true;
        this.setRotation(this.headTop, -0.9075712F, 0.0F, 0.0F);
        this.back1 = new ModelRenderer(this, 0, 65);
        this.back1.addBox(0.0F, -10.0F, 0.0F, 0, 8, 10);
        this.back1.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.back1.setTextureSize(256, 128);
        this.back1.mirror = true;
        this.setRotation(this.back1, -0.1919862F, 0.0F, 0.0F);
        this.back2 = new ModelRenderer(this, 23, 65);
        this.back2.addBox(0.0F, -11.0F, 8.0F, 0, 6, 12);
        this.back2.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.back2.setTextureSize(256, 128);
        this.back2.mirror = true;
        this.setRotation(this.back2, -0.5585054F, 0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 50, 66);
        this.tail1.addBox(-2.0F, -2.5F, 0.0F, 4, 4, 11);
        this.tail1.setRotationPoint(0.0F, 6.5F, 5.5F);
        this.tail1.setTextureSize(64, 32);
        this.tail1.mirror = true;
        this.setRotation(this.tail1, -0.4014257F, 0.0F, 0.0F);
        this.tail2 = new ModelRenderer(this, 85, 66);
        this.tail2.addBox(-2.0F, -1.5F, 0.0F, 4, 4, 11);
        this.tail2.setRotationPoint(0.0F, 9.5F, 29.5F);
        this.tail2.setTextureSize(64, 32);
        this.tail2.mirror = true;
        this.setRotation(this.tail2, -((float) Math.PI / 10F), 0.0F, 0.0F);
        this.tail3 = new ModelRenderer(this, 118, 66);
        this.tail3.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 11);
        this.tail3.setRotationPoint(0.0F, 13.5F, 30.5F);
        this.tail3.setTextureSize(64, 32);
        this.tail3.mirror = true;
        this.setRotation(this.tail3, -0.2094395F, 0.0F, 0.0F);
        this.tail4 = new ModelRenderer(this, 149, 66);
        this.tail4.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 11);
        this.tail4.setRotationPoint(0.0F, 15.5F, 40.5F);
        this.tail4.setTextureSize(64, 32);
        this.tail4.mirror = true;
        this.setRotation(this.tail4, -0.1396263F, 0.0F, 0.0F);
        this.tail5 = new ModelRenderer(this, 178, 66);
        this.tail5.addBox(-0.5F, -0.5F, -1.0F, 1, 1, 11);
        this.tail5.setRotationPoint(0.0F, 17.5F, 50.5F);
        this.tail5.setTextureSize(64, 32);
        this.tail5.mirror = true;
        this.setRotation(this.tail5, -0.0523599F, 0.0F, 0.0F);
        this.tailSpikes5 = new ModelRenderer(this, 178, 96);
        this.tailSpikes5.addBox(0.0F, -1.5F, 0.0F, 0, 3, 11);
        this.tailSpikes5.setRotationPoint(0.0F, 17.5F, 51.5F);
        this.tailSpikes5.setTextureSize(64, 32);
        this.tailSpikes5.mirror = true;
        this.setRotation(this.tailSpikes5, -0.0523599F, 0.0F, 0.0F);
        this.tailSpikes4 = new ModelRenderer(this, 149, 96);
        this.tailSpikes4.addBox(0.0F, -2.0F, 0.0F, 0, 4, 10);
        this.tailSpikes4.setRotationPoint(0.0F, 15.5F, 41.5F);
        this.tailSpikes4.setTextureSize(64, 32);
        this.tailSpikes4.mirror = true;
        this.setRotation(this.tailSpikes4, -0.1396263F, 0.0F, 0.0F);
        this.tailSpikes3 = new ModelRenderer(this, 118, 94);
        this.tailSpikes3.addBox(0.0F, -3.0F, 0.0F, 0, 6, 10);
        this.tailSpikes3.setRotationPoint(0.0F, 13.5F, 31.5F);
        this.tailSpikes3.setTextureSize(64, 32);
        this.tailSpikes3.mirror = true;
        this.setRotation(this.tailSpikes3, -0.2094395F, 0.0F, 0.0F);
        this.tailSpikes2 = new ModelRenderer(this, 90, 93);
        this.tailSpikes2.addBox(0.0F, -3.5F, 0.0F, 0, 8, 11);
        this.tailSpikes2.setRotationPoint(0.0F, 9.5F, 20.5F);
        this.tailSpikes2.setTextureSize(64, 32);
        this.tailSpikes2.mirror = true;
        this.setRotation(this.tailSpikes2, -((float) Math.PI / 10F), 0.0F, 0.0F);
        this.tailSpikes1 = new ModelRenderer(this, 58, 93);
        this.tailSpikes1.addBox(0.0F, -4.5F, 0.0F, 0, 8, 11);
        this.tailSpikes1.setRotationPoint(0.0F, 6.5F, 5.5F);
        this.tailSpikes1.setTextureSize(64, 32);
        this.tailSpikes1.mirror = true;
        this.setRotation(this.tailSpikes1, -0.4014257F, 0.0F, 0.0F);
        this.stabber = new ModelRenderer(this, 205, 66);
        this.stabber.addBox(-1.5F, 0.0F, 0.0F, 3, 0, 11);
        this.stabber.setRotationPoint(0.0F, 18.5F, 61.5F);
        this.stabber.setTextureSize(64, 32);
        this.stabber.mirror = true;
        this.setRotation(this.stabber, -0.0523599F, 0.0F, 0.0F);
    }

    @Override
    public void render(Object obj)
    {
        EntityLivingBase base = (EntityLivingBase) obj;;
        
        this.lThigh.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) - 0.8028515F;
        this.lShin1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) - 0.4014257F;
        this.lShin2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) - 0.8028515F;
        this.lFoot.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj);
        this.rThigh.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) - 0.8028515F;
        this.rShin1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) - 0.4014257F;
        this.rShin2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) - 0.8028515F;
        this.rFoot.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj);
        this.rArm1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
        this.rArm2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
        this.rClaw1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
        this.rClaw2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
        this.lArm1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
        this.lArm2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
        this.lClaw1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
        this.lClaw2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) + 0.3665191F;

        OpenGL.pushMatrix();
        {
            OpenGL.translate(0F, 0.32F, 0F);

            float newangle = 0.0F;
            float multiplier = 0.1F;
            newangle = MathHelper.cos(idleProgress(obj) * 4.0F * multiplier) * (float) Math.PI * 0.5F * swingProgressPrev(obj);

            if (base != null && base.prevPosX == base.posX && base.prevPosY == base.posY && base.prevPosZ == base.posZ)
            {
                newangle = MathHelper.cos(idleProgress(obj) * 0.07F);
                multiplier = 0.95F;
            }

            this.doTail(newangle, multiplier);
            this.lThigh.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) - 0.8028515F;
            this.lShin1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) - 0.4014257F;
            this.lShin2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) - 0.8028515F;
            this.lFoot.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj);
            this.rThigh.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) - 0.8028515F;
            this.rShin1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) - 0.4014257F;
            this.rShin2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) - 0.8028515F;
            this.rFoot.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj);
            this.rArm1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
            this.rClaw1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
            this.rArm2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
            this.rClaw2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
            this.lArm1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
            this.lClaw1.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
            this.lArm2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
            this.lClaw2.rotateAngleX = MathHelper.cos(swingProgress(obj) * 0.6662F + (float) Math.PI) * 1.4F * swingProgressPrev(obj) + 0.3665191F;
            this.headTop.rotateAngleY = (float) Math.toRadians(headYaw(obj)) * 0.75F;
            this.headBase.rotateAngleY = (float) Math.toRadians(headYaw(obj)) * 0.75F;
            this.headSpine1.rotateAngleY = (float) Math.toRadians(headYaw(obj)) * 0.75F;
            this.headSpine2.rotateAngleY = (float) Math.toRadians(headYaw(obj)) * 0.75F;
            this.jaw.rotateAngleY = (float) Math.toRadians(headYaw(obj)) * 0.75F;
            this.rHead.rotateAngleY = (float) Math.toRadians(headYaw(obj)) * 0.75F;
            this.lHead.rotateAngleY = (float) Math.toRadians(headYaw(obj)) * 0.75F;
            this.jaw2.rotateAngleY = (float) Math.toRadians(headYaw(obj)) * 0.75F;
            this.jaw2.rotateAngleX = 0.122F + Math.abs(newangle);
            newangle = MathHelper.cos(idleProgress(obj) * 3.5F * multiplier) * (float) Math.PI * 0.4F;
            draw(chest);
            draw(abdomen);
            draw(rThigh);
            draw(lThigh);
            draw(lShin1);
            draw(rShin1);
            draw(lShin2);
            draw(rShin2);
            draw(lFoot);
            draw(rFoot);
            draw(lArm1);
            draw(rArm1);
            draw(lClaw1);
            draw(rArm2);
            draw(neck);
            draw(headSpine1);
            draw(rHead);
            draw(jaw);
            draw(jaw2);
            draw(headSpine2);
            draw(lArm2);
            draw(rClaw1);
            draw(lClaw2);
            draw(rClaw2);
            draw(lHead);
            draw(part1);
            draw(part2);
            draw(part3);
            draw(part4);
            draw(headBase);
            draw(headTop);
            draw(back1);
            draw(back2);
            OpenGL.translate(0F, -0.3F, 0.8F);
            draw(tail1);
            draw(tail2);
            draw(tail3);
            draw(tail4);
            draw(tail5);
            draw(tailSpikes1);
            draw(tailSpikes2);
            draw(tailSpikes3);
            draw(tailSpikes4);
            draw(tailSpikes5);
            draw(stabber);
        }
        OpenGL.popMatrix();
    }

    private void doTail(float angle, float distMult)
    {
        float multiplier = 0.25F;
        this.tail1.rotateAngleY = angle / 1.5F;
        this.tailSpikes1.rotateAngleY = angle / 1.5F;
        this.tail2.rotateAngleY = angle * multiplier;
        this.tail2.rotationPointZ = this.tail1.rotationPointZ + (float) Math.cos(this.tail1.rotateAngleY) * 10.0F;
        this.tail2.rotationPointX = this.tail1.rotationPointX + (float) Math.sin(this.tail1.rotateAngleY) * 10.0F;
        this.tailSpikes2.rotateAngleY = angle * multiplier;
        this.tailSpikes2.rotationPointZ = this.tail1.rotationPointZ + (float) Math.cos(this.tail1.rotateAngleY) * 10.0F;
        this.tailSpikes2.rotationPointX = this.tail1.rotationPointX + (float) Math.sin(this.tail1.rotateAngleY) * 10.0F;
        multiplier = multiplier + distMult;
        this.tail3.rotateAngleY = angle * multiplier;
        this.tail3.rotationPointZ = this.tail2.rotationPointZ + (float) Math.cos(this.tail2.rotateAngleY) * 10.0F;
        this.tail3.rotationPointX = this.tail2.rotationPointX + (float) Math.sin(this.tail2.rotateAngleY) * 10.0F;
        this.tailSpikes3.rotateAngleY = angle * multiplier;
        this.tailSpikes3.rotationPointZ = this.tail2.rotationPointZ + (float) Math.cos(this.tail2.rotateAngleY) * 10.0F;
        this.tailSpikes3.rotationPointX = this.tail2.rotationPointX + (float) Math.sin(this.tail2.rotateAngleY) * 10.0F;
        multiplier = multiplier + distMult;
        this.tail4.rotateAngleY = angle * multiplier;
        this.tail4.rotationPointZ = this.tail3.rotationPointZ + (float) Math.cos(this.tail3.rotateAngleY) * 10.0F;
        this.tail4.rotationPointX = this.tail3.rotationPointX + (float) Math.sin(this.tail3.rotateAngleY) * 10.0F;
        this.tailSpikes4.rotateAngleY = angle * multiplier;
        this.tailSpikes4.rotationPointZ = this.tail3.rotationPointZ + (float) Math.cos(this.tail3.rotateAngleY) * 10.0F;
        this.tailSpikes4.rotationPointX = this.tail3.rotationPointX + (float) Math.sin(this.tail3.rotateAngleY) * 10.0F;
        multiplier = multiplier + distMult;
        this.tail5.rotateAngleY = angle * multiplier;
        this.tail5.rotationPointZ = this.tail4.rotationPointZ + (float) Math.cos(this.tail4.rotateAngleY) * 10.0F;
        this.tail5.rotationPointX = this.tail4.rotationPointX + (float) Math.sin(this.tail4.rotateAngleY) * 10.0F;
        this.tailSpikes5.rotateAngleY = angle * multiplier;
        this.tailSpikes5.rotationPointZ = this.tail4.rotationPointZ + (float) Math.cos(this.tail4.rotateAngleY) * 10.0F;
        this.tailSpikes5.rotationPointX = this.tail4.rotationPointX + (float) Math.sin(this.tail4.rotateAngleY) * 10.0F;
        multiplier = multiplier + distMult;
        this.stabber.rotateAngleY = angle * multiplier;
        this.stabber.rotationPointZ = this.tail5.rotationPointZ + (float) Math.cos(this.tail5.rotateAngleY) * 10.0F;
        this.stabber.rotationPointX = this.tail5.rotationPointX + (float) Math.sin(this.tail5.rotateAngleY) * 10.0F;
    }
}
